package com.practica7.practica7.service.implementation;

import java.util.List;

import com.practica7.practica7.model.Album;
import com.practica7.practica7.repository.AlbumRepository;
import com.practica7.practica7.service.AlbumService;
import com.practica7.practica7.service.DTO.AlbumArtistDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements AlbumService{

    @Autowired
    private AlbumRepository albumRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Iterable<Album> getAlbum(){
        return albumRepository.findAll();
    }


    @Override
    public void deleteAlbum(String idAlbum) {
        albumRepository.deleteById(idAlbum);
        
    }


    @Override
    public Album updateAlbum(String id, Album album) {
        if(albumRepository.existsById(id)){
            return albumRepository.save(album);
        }else{
            return null;
        }
    }
        
    //INNER-JOIN
	@Override
	public List<AlbumArtistDTO> getArtistwithAlbumArtist(){

		String query=
				"""
    			SELECT ARTIST.ARTIST_ID, ALBUM.ALBUM_NAME, ALBUM.GENRE, ORDERS.ORDER_DATE
				FROM ARTIST
				INNER JOIN ALBUM ON ARTIST.ARTIST_NAME=ALBUM.ALBUM_ARTIST;
				""";

		List<AlbumArtistDTO> orderList = jdbcTemplate.query(
				query,
				(rs, rowNum) ->
						new AlbumArtistDTO(
								rs.getString("ARTIST_ID"),
								rs.getString("ARTIST_NAME"),
								rs.getString("ALBUM_NAME"),
								rs.getString("GENRE")
                        			
        ));
        
		return orderList;
	}
    
    
}

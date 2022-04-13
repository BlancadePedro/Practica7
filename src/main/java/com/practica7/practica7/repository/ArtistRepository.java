package com.practica7.practica7.repository;

import com.practica7.practica7.model.*;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, String>{
    @Query("SELECT * FROM ARTIST WHERE ARTIST.ARTIST_ID = :artistId")
    public Iterable <Artist> getArtistById(String artistId);

    @Query("INSERT INTO ARTIST (ARTIST.ARTIST_ID, ARTIST.ARTIST_NAME) VALUES (artistId,artistName)")
    public void insertArtist(String artistId,String artistName);

    @Query("DELETE FROM ARTIST WHERE ARTIST.ARTIST_ID = :artistId")
    public void deleteArtist(String artistId);
}

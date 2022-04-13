package com.practica7.practica7.repository;

import java.time.LocalDate;

import com.practica7.practica7.model.Album;
import com.practica7.practica7.model.User;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album,String>{
    @Query("SELECT * FROM ALBUM WHERE ALBUM.ALBUM_ID = :albumId")
    public Iterable <Album> getAlbumById(String albumId);

    @Query("DELETE FROM ALBUM WHERE ALBUM.ALBUM_ID = :albumId")
    public void deleteAlbum(String albumId);

}

package com.practica7.practica7.repository;

import com.practica7.practica7.model.Song;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song,String> {
    @Query("SELECT * FROM SONG WHERE SONG.SONG_ID = :songId")
    public Iterable <Song> getSongById(String songId);

    @Query("DELETE FROM SONG WHERE SONG.SONG_ID = :songId")
    public void deleteSong(String songId);
}

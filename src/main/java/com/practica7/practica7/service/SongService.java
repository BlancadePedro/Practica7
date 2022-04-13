package com.practica7.practica7.service;

import com.practica7.practica7.model.Song;

public interface SongService {
    Iterable<Song> getSong();
    void deleteSong(String idSong);
    Song updateAlbum(String id, Song song);
}

package com.practica7.practica7.service;

import java.util.List;

import com.practica7.practica7.model.Album;
import com.practica7.practica7.service.DTO.AlbumArtistDTO;

public interface AlbumService {
    Iterable<Album> getAlbum();
    void deleteAlbum(String idAlbum);
    Album updateAlbum(String id, Album album);
    List<AlbumArtistDTO> getArtistwithAlbumArtist();

}

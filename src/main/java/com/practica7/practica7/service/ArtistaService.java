package com.practica7.practica7.service;

import java.util.List;

import com.practica7.practica7.model.Artist;
import com.practica7.practica7.service.DTO.SongArtistDTO;

public interface ArtistaService {
    Iterable<Artist> getArtist();
    void deleteArtist(String idArtist);
    Artist updateArtist(String id, Artist artist);
    List<SongArtistDTO> getSongswithArtist();
}

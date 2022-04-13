package com.practica7.practica7.service.implementation;

import com.practica7.practica7.model.Song;
import com.practica7.practica7.repository.SongRepository;
import com.practica7.practica7.service.SongService;

import org.springframework.beans.factory.annotation.Autowired;

public class SongServiceImpl implements SongService{

    @Autowired
    private SongRepository songRepository;

    @Override
    public Iterable<Song> getSong(){
        return songRepository.findAll();
    }

    @Override
    public void deleteSong(String idSong){
        songRepository.deleteById(idSong);
    }

    @Override
    public Song updateAlbum(String id, Song song){
        if(songRepository.existsById(id)){
            return songRepository.save(song);
        }else{
            return null;
        }
    }
}

package com.practica7.practica7.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.practica7.practica7.model.Song;
import com.practica7.practica7.repository.SongRepository;

@RestController
@RequestMapping("/api/v1")
@Service
public class SongController {
    @Autowired
    private SongRepository songRepostery;

    @GetMapping("/song")
    public ResponseEntity<Iterable<Song>> getSong(){

       Iterable<Song> response = songRepostery.findAll();
       return ResponseEntity.ok().body(response);
    }


    @PutMapping("/song/{id}/")
    public ResponseEntity<Song> updateSong(@PathVariable String id, @RequestBody Song song) {
        Song newSong = songRepostery.save(song);
        if (newSong == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newSong);
    }

    @DeleteMapping("/song/{id}")
    public ResponseEntity<Song> deleteSong(@PathVariable String id) {
        songRepostery.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
}

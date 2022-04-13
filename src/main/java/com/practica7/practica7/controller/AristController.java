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


import com.practica7.practica7.model.Artist;
import com.practica7.practica7.repository.ArtistRepository;

@RestController
@RequestMapping("/api/v1")
@Service
public class AristController {
    @Autowired
    private ArtistRepository artistRepostery;

    @GetMapping("/artist")
    public ResponseEntity<Iterable<Artist>> getArtist(){

       Iterable<Artist> response = artistRepostery.findAll();
       return ResponseEntity.ok().body(response);
    }

    @PutMapping("/artist/{id}/")
    public ResponseEntity<Artist> updateArtist(@PathVariable String id, @RequestBody Artist artist) {
        Artist newArtist = artistRepostery.save(artist);
        if (newArtist == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newArtist);
    }

    @DeleteMapping("/artist/{id}")
    public ResponseEntity<Artist> deleteArtist(@PathVariable String id) {
        artistRepostery.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
}

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


import com.practica7.practica7.model.Episode;
import com.practica7.practica7.repository.EpisodeRepository;

@RestController
@RequestMapping("/api/v1")
@Service
public class EpisodeController {
    @Autowired
    private EpisodeRepository episodeRepostery;

    @GetMapping("/episode")
    public ResponseEntity<Iterable<Episode>> getEpisode(){

       Iterable<Episode> response = episodeRepostery.findAll();
       return ResponseEntity.ok().body(response);
    }


    @PutMapping("/episode/{id}/")
    public ResponseEntity<Episode> updateEpisode(@PathVariable String id, @RequestBody Episode episode) {
        Episode newEpisode = episodeRepostery.save(episode);
        if (newEpisode == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newEpisode);
    }

    @DeleteMapping("/episode/{id}")
    public ResponseEntity<Episode> deleteEpisode(@PathVariable String id) {
        episodeRepostery.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
}

package com.practica7.practica7.service.implementation;

import com.practica7.practica7.model.Episode;
import com.practica7.practica7.repository.EpisodeRepository;
import com.practica7.practica7.service.EpisodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EpisodeServiceImpl implements EpisodeService{

    @Autowired
    private EpisodeRepository episodeRepository;

    @Override
    public Iterable<Episode> getEpisode() {
        return episodeRepository.findAll();
    }

    @Override
    public void deleteEpisode(String idEpisode) {
        episodeRepository.deleteById(idEpisode);
        
    }

    @Override
    public Episode updateEpisode(String id, Episode episode) {
        if(episodeRepository.existsById(id)){
            return episodeRepository.save(episode);
        }else{
            return null;
        }
    }
    
}

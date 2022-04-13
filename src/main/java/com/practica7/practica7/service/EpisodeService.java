package com.practica7.practica7.service;

import com.practica7.practica7.model.Episode;

public interface EpisodeService {
    Iterable<Episode> getEpisode();
    void deleteEpisode(String idEpisode);
    Episode updateEpisode(String id, Episode episode);
}

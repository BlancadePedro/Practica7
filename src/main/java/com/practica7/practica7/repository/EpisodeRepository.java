package com.practica7.practica7.repository;

import com.practica7.practica7.model.Episode;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface EpisodeRepository extends CrudRepository <Episode,String> {
    @Query("SELECT * FROM EPISODE WHERE EPISODE.EPISODE_ID = :episodeId")
    public Iterable <Episode> getEpisodeById(String episodeId);

    @Query("INSERT INTO EPISODE (EPISODE.EPISODE_ID, EPISODE.EPISODE_NAME, EPISODE.PARTICIPANTS_NAME, EPISODE.TOPIC) VALUES (episodeId,episodeName,host,topic)")
    public void insertEpisode(String episodeId,String episodeName,String host,String topic);

    @Query("DELETE FROM EPISODE WHERE EPISODE.EPISODE_ID = :episodeId")
    public void deleteEpisode(String episodeId);
}

package com.practica7.practica7.service.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpisodeDTO {
    String episodeId;
    String episodeName;
    String host;
    String topic;
}

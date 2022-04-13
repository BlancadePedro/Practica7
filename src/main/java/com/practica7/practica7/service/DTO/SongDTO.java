package com.practica7.practica7.service.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SongDTO {
    String songId;
    String songName;
    String songArtist;
    LocalDate date;
    String album;
    String genre;
}

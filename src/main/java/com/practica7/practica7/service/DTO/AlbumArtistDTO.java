package com.practica7.practica7.service.DTO;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AlbumArtistDTO {
    String artistId;
    String artistName;
    String albumName;
    String genre;
}

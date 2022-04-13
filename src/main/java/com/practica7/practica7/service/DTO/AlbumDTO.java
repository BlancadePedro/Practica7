package com.practica7.practica7.service.DTO;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AlbumDTO {
    String artistId;
    String albumId;
    String artistName;
    String albumName;
    String genre;
}

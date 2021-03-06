package com.practica7.practica7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("ALBUM")

public class Album {
    private @Column("ALBUM_ID") @Id String albumId;
	private @Column("ALBUM_NAME") String albumName;
	private @Column("ALBUM_ARTIST") String albumArtist;
	private @Column("RELEASE_DATE") LocalDate date;
	private @Column("GENRE") String genre;
}

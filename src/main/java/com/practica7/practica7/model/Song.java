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
@Table("SONG")

public class Song {
    private @Column("SONG_ID") @Id String songId;
	private @Column("SONG_NAME") String songName;
	private @Column("SONG_ARTIST") String songArtist;
	private @Column("RELEASE_DATE") LocalDate date;
	private @Column("ALBUM") String album;
	private @Column("GENRE") String genre;
}

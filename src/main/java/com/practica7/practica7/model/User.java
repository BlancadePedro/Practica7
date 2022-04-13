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
@Table("USER")

public class User {
    private @Column("USER_ID") @Id String userId;
	private @Column("USERS_NAME") String usersName;
	private @Column("USERS_PASSWORD") String usersPassword;
	private @Column("EMAIL") String email;
	private @Column("INITIAL_DATE") LocalDate inicialDate;
}

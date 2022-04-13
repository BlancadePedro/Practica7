package com.practica7.practica7.service.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {
    String userId;
    String usersName;
    String usersPassword;
    String email;
    LocalDate inicialDate;
}

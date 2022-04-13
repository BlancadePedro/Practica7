# Practica7
## Objetivo de la práctica


Desarrollo de una App de Spring Boot que incluya una funcionalidad que permita persistir información utilizando la librería Spring Data JDBC con una base de datos H2.
El módulo de persistencia debe incluir las operaciones (INSERT, UPDATE,  SELECT y DELETE)
Las operaciones debe de incluir como mínimo dos operaciones “JOINS”  utilizando la anotación @Query.

## Desarrollo de la práctica

[![](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/BlancadePedro/Practica7)


La creación de las BBDD se ha realizado en la carpeta resources/db que consta de dos archivos. El primero contiene los atributos de cinco bases de datos creadas, USER, ARTIST, SONG, ALBUM, EPISODE, y en el segundo se le han asignados valores para comprobar su correcto funcionamiento.
A su vez, en main/java/com/practica7/practica7 se han creado cuatro distintas para el desarrollo del back-end de la aplicación. 
En la carpeta "model" se encuentran los archivos que permiten la conexióne entre sql y java, correspondientes a cada base de datos. 
Los archivos de "repostery" permiten la ejecución de las operaciones CRUD (Create, Read, Update, Delete). Se han añadido funciones para la conexión entre las bases de datos (@Query)
Dentro de la carpeta Controller se pueden encontrar las funciones que permiten manejar los datos almacenados en la base de datos, pudiendo obtenerlos, acualizarlos y eliminarlos a partir del id.
Finalemnte, la persistencia de datos se ha desarrollado en la carpeta service. Se han creado cinco interfaces, cada una correspondiente a una base de datos distinta y en la carpeta "implementacion" se encuentran las funciones desarrolladas, incluidas los joins especificados. Se han juntado las tablas ARTIST Y SONG, mediante el campo correspondiente al nombre del artista y ALBUM Y ARTIST, de la misma forma.

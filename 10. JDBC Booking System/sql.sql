CREATE DATABASE booking
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

CREATE TABLE accomodation (
    id INT PRIMARY KEY,
    type VARCHAR (32),
    bed_type VARCHAR (32),
    max_guests INT,
    description VARCHAR(512)
 );

 CREATE TABLE room_fair (
 	 id INT PRIMARY KEY,
	 value NUMERIC,
	 season VARCHAR(32)
 );

 CREATE TABLE accomodation_fair_relation (
 	 id INT PRIMARY KEY,
	 id_accomodation INT, FOREIGN KEY (id_accomodation) REFERENCES accomodation (id),
     id_room_fair INT, FOREIGN KEY (id_room_fair) REFERENCES room_fair (id)
 );

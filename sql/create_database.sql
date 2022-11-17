CREATE DATABASE IF NOT EXISTS `inventory-db`;
GRANT ALL ON `inventory-db`.* TO 'admin'@'%';
USE authentication-db;
CREATE TABLE user(
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    PRIMARY KEY (username)
);
INSERT INTO user VALUES ('admin', '$2a$10$CPEhR4ooKoRa.3.Xv.k4JuWPahvteseXD/fRCpIC5umOsYfPOoE/K');

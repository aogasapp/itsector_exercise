CREATE SCHEMA `itsector` ;

CREATE TABLE `itsector`.`contato` 
(`id` INT NOT NULL,
 `nome` VARCHAR(128) NULL,
 `username` VARCHAR(128) NULL,
 `password` VARCHAR(45) NULL,
 `create_timestamp` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
 `update_timestamp` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`));

 ALTER TABLE `itsector`.`contato`
 CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ,
 ADD UNIQUE INDEX `id_UNIQUE` (`id` ASC);

INSERT INTO contato (nome, username, password) VALUES ('Pedro'  , 'pedro santiago'	, 'xp0556');
INSERT INTO contato (nome, username, password) VALUES ('Antonio Carlos', 'antonio francisco'	, '002@33');
INSERT INTO contato (nome, username, password) VALUES ('Maria'  , 'maria matilde'	, '123ps789');
INSERT INTO contato (nome, username, password) VALUES ('Joaquim', 'joaquim benedito'	, 't01@02');
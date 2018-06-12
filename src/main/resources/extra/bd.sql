CREATE TABLE `Course` (
  `idCourse` INT(11) NOT NULL,
  `name` VARCHAR(150) NULL DEFAULT NULL COLLATE 'utf8_spanish_ci',
  `description` VARCHAR(300) NULL DEFAULT NULL COLLATE 'utf8_spanish_ci',
  `price` INT(11) NULL DEFAULT NULL,
  `hours` INT(11) NULL DEFAULT NULL,
PRIMARY KEY (`idCourse`)
)
COLLATE='utf8_spanish_ci'
  ENGINE=InnoDB
;
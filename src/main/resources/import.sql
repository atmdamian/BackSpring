INSERT INTO DOMICILIOS (ID_DOMICILIO,COLONIA,MUNICIPIO,NO_CALLE,PAIS) VALUES (301, "IXTLAHUACA","IXTLAHUACA","NO.4","Mexico")
INSERT INTO DOMICILIOS (ID_DOMICILIO,COLONIA,MUNICIPIO,NO_CALLE,PAIS) VALUES (302, "IXTLAHUACA CHINA","IXTLAHUACA CHINA","NO.5","China")
INSERT INTO DOMICILIOS (ID_DOMICILIO,COLONIA,MUNICIPIO,NO_CALLE,PAIS) VALUES (303, "IXTLAHUACA CHILE","IXTLAHUACA CHILE","NO.6","Chile")

INSERT INTO CONTACTOS (ID_CONTACTO, TELEFONO, EMAIL) VALUES(201, "55332344556", "SUDODAMIAN@HOTMAIL.COM")
INSERT INTO CONTACTOS (ID_CONTACTO, TELEFONO, EMAIL) VALUES(202, "55332344552", "CORREO2@HOTMAIL.COM")
INSERT INTO CONTACTOS (ID_CONTACTO, TELEFONO, EMAIL) VALUES(203, "55332344553", "CORREO3@HOTMAIL.COM")

INSERT INTO USUARIOS(USUARIO_ID, NOMBRE,APELLIDO, USUARIO, CONTRASENIA, FECHA_NACIMIENTO, FECHA_CREACION, ID_DOMICILIO,ID_CONTACTO) VALUES (401,"DAMIAN", "ATANACIO MENDIOLA", "ATM", "123","2020/12/30","2020/12/30",301,201)
INSERT INTO USUARIOS(USUARIO_ID, NOMBRE,APELLIDO, USUARIO, CONTRASENIA, FECHA_NACIMIENTO, FECHA_CREACION, ID_DOMICILIO,ID_CONTACTO) VALUES (402,"NAME2", "APELLIDO2", "USER2", "123","2020/12/30","2020/12/30",302,202)
INSERT INTO USUARIOS(USUARIO_ID, NOMBRE,APELLIDO, USUARIO, CONTRASENIA, FECHA_NACIMIENTO, FECHA_CREACION, ID_DOMICILIO,ID_CONTACTO) VALUES (403,"NAME3", "APELLIDO3", "USER3", "123","2020/12/30","2020/12/30",303,203)

INSERT INTO `curso`.`persona`(`cve_persona`,`des_correo_electronico`,`nom_apellido_materno`,`nom_apellido_paterno`,`nom_nombre`,`num_ext`,`num_telefono`)VALUES(1,'datanaciom@outlook.com','MENDIOLA','ATANACIO','DAMIAN',43,5538622199)

INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(101,"EQUIPO LAP",2,1)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(102,"EQUIPO LAP1",4,1)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(103,"EQUIPO LAP2",16,0)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(104,"EQUIPO LAP3",16,0)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(105,"EQUIPO LAP4",16,0)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(106,"EQUIPO LAP5",16,0)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(107,"EQUIPO LAP6",16,0)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(108,"EQUIPO LAP7",16,0)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(109,"EQUIPO LAP8",16,0)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(110,"EQUIPO LAP9",16,1)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(111,"EQUIPO LAP10",16,1)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(112,"EQUIPO LAP11",16,1)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(113,"EQUIPO LAP12",16,1)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(114,"HP 1",16,1)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(115,"HP 2",16,1)
INSERT INTO `curso`.`spa_equipo` (`cve_equipo`,`des_unidad_spect`,`num_no_equipo`,`ind_activo`)VALUES(116,"HP 3",16,1)


INSERT INTO `curso`.`country`(`cve_country`,`nom_country`)VALUES(1,"Mexico")
INSERT INTO `curso`.`country`(`cve_country`,`nom_country`)VALUES(2,"USA")
INSERT INTO `curso`.`city`(`cve_city`,`nom_city`,`cve_country`)VALUES(101,"Monterrey",1)
INSERT INTO `curso`.`city`(`cve_city`,`nom_city`,`cve_country`)VALUES(102,"Texas",2)



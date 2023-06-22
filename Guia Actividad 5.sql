select * from creador;
INSERT INTO creador (id_creador, nombre) VALUES (1, "Marvel");
INSERT creador (id_creador, nombre) VALUES (2, "DCComics");
select * from creador;

INSERT INTO personajes VALUES (1,'Bruce Banner', 'Hulk', 160, '600mil', 75, 98, 1962, 'Fisico Nuclear', 1);
INSERT INTO personajes VALUES (2,'Tony Stark', 'Iron Man', 170, '200mil', 70, 123, 1963, 'Inventor Industrial', 1);
INSERT INTO personajes VALUES (3,'Thor Odinson', 'Thor', 145, 'infinita', 100, 235, 1962, 'Rey de Asgard', 1);
INSERT INTO personajes VALUES (4,'Wanda Maximoff', 'Bruja Escarlata', 170, '100mil', 90, 345, 1964, 'Bruja', 1);
INSERT INTO personajes VALUES (5,'Carol Danvers', 'Capitana Marvel', 157, '250mil', 85, 128, 1968, 'Oficial de inteligencia', 1);
INSERT INTO personajes VALUES (6,'Thanos', 'Thanos', 170, 'infinita', 40, 306, 1973, 'Adorador de la muerte', 1);
INSERT INTO personajes VALUES (7,'Peter Parker', 'Spiderman', 165, '25mil', 80, 74, 1962, 'Fotografo', 1);
INSERT INTO personajes VALUES (8,'Steve Rogers', 'Capitan America', 145, '600', 45, 60, 1941, 'Oficial Federal', 1);
INSERT INTO personajes VALUES (9,'Bobby Drake', 'Iceman', 140, '2mil', 64, 122, 1963, 'Contador', 1);
INSERT INTO personajes VALUES (10,'Barry Allen', 'Flash', 160, '10mil', 120, 168, 1956, 'Cientifico Forense', 2);
INSERT INTO personajes VALUES (11,'Bruce Wayne', 'Batman', 170, '500', 32, 47, 1939, 'Hombre de negocios', 2);
INSERT INTO personajes VALUES (12,'Clark Kent', 'Superman', 165, 'infinita', 120, 182, 1948, 'Reportero', 2);
INSERT INTO personajes VALUES (13,'Diana Prince', 'Mujer Maravilla', 160, 'infinita', 95, 127, 1949, 'Princesa Guerrera', 2);

select * from personajes;

UPDATE personajes SET aparicion = 1938 WHERE id_personaje = 12;

select * from personajes;

DELETE FROM personajes WHERE id_personaje = 10;

select * from personajes;
/*a) Ahora veamos cómo ha quedado la tabla “superheroes” que creaste anteriormente. Para ello
necesitarás una consulta de tipo SELECT.*/

select * from superheroes.creador;
select * from superheroes.personajes;

/*b) Realiza una consulta que devuelva todos los valores de la columna “nombre_real” de la tabla
superhéroe.*/

select nombre_real from superheroes.personajes;

/*c) Realiza una consulta que devuelva todos los nombres reales de los personajes cuyo nombre
empieza con “B”.*/

select * FROM superheroes.personajes WHERE nombre_real LIKE "B%";

/*Pongamos a prueba esta nueva cláusula: order by. Seguiremos trabajando con la tabla
“superhéroe”. Realiza una consulta que devuelva todos los registros ordenados por 
“inteligencia”.*/

-- ordenados de forma ascendente

select * from superheroes.personajes order by inteligencia ASC;

-- ordenados de forma descendente

select * from superheroes.personajes order by inteligencia DESC;
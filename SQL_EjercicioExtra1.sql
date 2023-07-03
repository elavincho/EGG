/*Abrir el script de la base de datos llamada “nba.sql” y ejecutarlo para crear todas las tablas e
insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberá
obtener un diagrama de entidad relación igual al que se muestra a continuación: */

-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:
-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.

select nombre from jugadores;

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 
-- libras, ordenados por nombre alfabéticamente.

select nombre, Posicion, Peso from jugadores where Posicion = "C" and Peso > 200 order by nombre ASC;

-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.

select Nombre from equipos order by nombre ASC;

-- 4. Mostrar el nombre de los equipos del este (East).

select nombre, conferencia from equipos where Conferencia = "East";

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.

select nombre, ciudad from equipos where ciudad like "C%" order by nombre ASC;

-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.

select jugadores.nombre, equipos.nombre from jugadores, equipos order by equipos.nombre ASC;

-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.

select jugadores.nombre, equipos.nombre from jugadores, equipos 
where equipos.nombre = "Raptors" order by jugadores.nombre;

-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.

select jugadores.nombre, estadisticas.Puntos_por_partido from jugadores, estadisticas
where jugadores.nombre = "Pau Gasol";

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.

select jugadores.nombre, estadisticas.Puntos_por_partido, estadisticas.temporada 
from jugadores, estadisticas
where jugadores.nombre = "Pau Gasol" and estadisticas.temporada = "04/05";

-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.

select jugadores.nombre, estadisticas.Puntos_por_partido, estadisticas.jugador 
from jugadores, estadisticas; 

-- 11. Mostrar el número de jugadores de cada equipo.

select jugadores.Nombre_equipo, count(jugadores.nombre) from jugadores
group by jugadores.Nombre_equipo;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.

select Round(sum(Puntos_por_partido)) as TotalPuntos,jugador,j.nombre from estadisticas e 
left join jugadores j on e.jugador = j.codigo group by jugador order by TotalPuntos desc limit 1;

-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.

select jugadores.nombre, equipos.nombre, equipos.conferencia, equipos.division, jugadores.altura
from equipos, jugadores order by jugadores.altura DESC limit 1;

-- 14. Mostrar la media de puntos en partidos de los equipos de la división Pacific. 

select equipos.nombre, equipos.division, ROUND(AVG(estadisticas.Puntos_por_partido))
from equipos, estadisticas where equipos.division = "Pacific";

-- 15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con  
-- mayor diferencia de puntos.

select partidos.equipo_local, partidos.equipo_visitante, partidos.puntos_local, partidos.puntos_visitante,
(partidos.puntos_local - partidos.puntos_visitante) 
from partidos 
where (partidos.puntos_local - partidos.puntos_visitante) 
order by (partidos.puntos_local - partidos.puntos_visitante) desc limit 1;

-- 16. Mostrar la media de puntos en partidos de los equipos de la división Pacific. (Repetido item 14)

select equipos.nombre, equipos.division, ROUND(AVG(estadisticas.Puntos_por_partido))
from equipos, estadisticas where equipos.division = "Pacific";

-- 17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.

select partidos.equipo_local, partidos.equipo_visitante, partidos.puntos_local, partidos.puntos_visitante
from partidos;

-- 18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
-- equipo_ganador), en caso de empate sera null.

SELECT partidos.codigo, partidos.equipo_local, partidos.puntos_local, partidos.puntos_visitante, partidos.equipo_visitante,
CASE
  WHEN partidos.puntos_local > partidos.puntos_visitante THEN partidos.equipo_local
  WHEN partidos.puntos_local < partidos.puntos_visitante THEN partidos.equipo_visitante
  ELSE NULL
END AS equipo_ganador
FROM partidos;


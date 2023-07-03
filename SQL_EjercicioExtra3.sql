/*Importar el script de la base de datos llamada “pokemondb.sql” y ejecutarlo para crear todas
las tablas e insertar los registros en las mismas. A continuación, generar el modelo de entidad
relación y reorganizar las tablas para mayor claridad de sus relaciones. Deberá obtener un
diagrama de entidad de relación similar al que se muestra a continuación: 
A continuación, se deben realizar las siguientes consultas:*/
select * from pokemon;
-- 1. Mostrar el nombre de todos los pokemon.
select nombre from pokemon;
-- 2. Mostrar los pokemon que pesen menos de 10k.
select nombre, peso from pokemon where peso < 10 order by nombre;
-- 3. Mostrar los pokemon de tipo agua.
select pokemon.nombre, tipo.nombre from pokemon, tipo where tipo.nombre = "Agua" order by pokemon.nombre;
-- 4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
select pokemon.nombre, tipo.nombre AS Tipo from pokemon, tipo 
where tipo.nombre in ("Agua", "Tierra", "Fuego")
order by tipo.nombre ASC;
-- 5. Mostrar los pokemon que son de tipo fuego y volador.
select pokemon.nombre, tipo.nombre AS Tipo from pokemon, tipo
where tipo.nombre in ("fuego", "Volador") order by pokemon.nombre ASC;
-- 6. Mostrar los pokemon con una estadística base de ps mayor que 200.
select pokemon.nombre, estadisticas_base.ps AS Estadistica_Base from pokemon, estadisticas_base
where estadisticas_base.ps > 200;
-- 7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.

select pokemon.numero_pokedex, pokemon.nombre, pokemon.peso, pokemon.altura 
from pokemon
where pokemon.nombre = "Arbok";

select pokemon.numero_pokedex, pokemon.nombre, pokemon.peso, pokemon.altura 
from pokemon
where (pokemon.numero_pokedex = 23);

-- 8. Mostrar aquellos pokemon que evolucionan por intercambio.
select pokemon.nombre, tipo_evolucion.tipo_evolucion from pokemon, tipo_evolucion
where tipo_evolucion.tipo_evolucion = "Intercambio" order by pokemon.nombre;
-- 9. Mostrar el nombre del movimiento con más prioridad.
select movimiento.nombre, movimiento.prioridad from movimiento order by movimiento.prioridad DESC limit 1;
-- 10. Mostrar el pokemon más pesado.
select nombre, peso from pokemon where peso < 10 order by peso DESC limit 1;
-- 11. Mostrar el nombre y tipo del ataque con más potencia.
select pokemon.nombre, tipo_ataque.tipo, movimiento.potencia
from pokemon, tipo_ataque, movimiento
order by movimiento.potencia DESC;
-- 12. Mostrar el número de movimientos de cada tipo.
select COUNT(movimiento.id_movimiento) AS Tipo_Movimiento, tipo.nombre AS Tipo 
from movimiento, tipo
group by tipo.nombre;
-- 13. Mostrar todos los movimientos que puedan envenenar.
select movimiento.nombre, movimiento.descripcion from movimiento
where movimiento.descripcion like "%env%";
-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
select movimiento.nombre, movimiento.descripcion from movimiento
where movimiento.descripcion like "%daño%" order by movimiento.nombre ASC;
-- 15. Mostrar todos los movimientos que aprende pikachu.
select pokemon.nombre, movimiento.nombre from pokemon, movimiento
where pokemon.nombre = "pikachu";
-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
select pokemon.nombre, movimiento.nombre, mt.MT from pokemon, movimiento, mt
where pokemon.nombre = "pikachu" order by mt.MT;
-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
select pokemon.nombre, movimiento.nombre, nivel_aprendizaje.nivel 
from pokemon, movimiento, nivel_aprendizaje
where pokemon.nombre = "pikachu" order by nivel_aprendizaje.nivel;
-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
select movimiento.nombre, movimiento_efecto_secundario.probabilidad
from movimiento, movimiento_efecto_secundario
where movimiento_efecto_secundario.probabilidad > 30
order by  movimiento_efecto_secundario.probabilidad;
-- 19. Mostrar todos los pokemon que evolucionan por piedra.
select pokemon.nombre, tipo_evolucion.tipo_evolucion, tipo_piedra.nombre_piedra 
from pokemon, tipo_evolucion, tipo_piedra
where tipo_evolucion = "Piedra";

select * from pokemon_evolucion_piedra order by numero_pokedex;

-- 20. Mostrar todos los pokemon que no pueden evolucionar.
select * from pokemon_no_evolucionan order by numero_pokedex;
-- 21. Mostrar la cantidad de los pokemon de cada tipo.
select * from cantidad_tipo_pokemon order by cantidad;




-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:
-- 1. Lista el nombre de todos los productos que hay en la tabla producto.

select nombre from tienda.producto;

-- 2. Lista los nombres y los precios de todos los productos de la tabla producto.

select nombre, precio from tienda.producto;

-- 3. Lista todas las columnas de la tabla producto.

select * from tienda.producto;

-- 4. Lista los nombres y los precios de todos los productos de la tabla producto, 
-- redondeando el valor del precio.
-- //round(precio, 2) el numero despues de la coma redondea en la cant de decimales.

select nombre, round(precio) from tienda.producto;


-- 5. Lista el código de los fabricantes que tienen productos en la tabla producto.

select codigo_fabricante, nombre from producto where codigo_fabricante;
select * from fabricante where codigo in (select codigo_fabricante from producto);
select distinct p.codigo, f.nombre from fabricante f, producto p where f.codigo = p.codigo_fabricante;

-- 6. Lista el código de los fabricantes que tienen productos en la tabla producto, 
-- sin mostrar los repetidos.

select distinct codigo_fabricante from producto;

-- 7. Lista los nombres de los fabricantes ordenados de forma ascendente.

select nombre from fabricante order by nombre ASC;

-- 8. Lista los nombres de los productos ordenados en primer lugar por el nombre de 
-- forma ascendente y en segundo lugar por el precio de forma descendente.

select nombre, precio from producto order by nombre asc, precio desc;

-- 9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.

select * from fabricante limit 5;

-- 10. Lista el nombre y el precio del producto más barato. (Utilice solamente las 
-- cláusulas ORDER BY y LIMIT)

select nombre, precio from producto order by precio asc limit 1;

-- 11. Lista el nombre y el precio del producto más caro. (Utilice solamente las 
-- cláusulas ORDER BY y LIMIT)

select nombre, precio from producto order by precio desc limit 1;

-- 12. Lista el nombre de los productos que tienen un precio menor o igual a $120.

select nombre, precio from producto where precio <= 120;

-- 13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador
-- BETWEEN.

select nombre, precio from producto where precio >= 60 and precio <= 200;

-- 14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. 
-- Utilizando el operador IN.

select * from producto where codigo_fabricante in (1, 3, 5);

-- 15. Devuelve una lista con el nombre de todos los productos que contienen la cadena
-- Portátil en el nombre.

select nombre from producto where nombre like "%Portátil%";

-- Consultas Multitabla
-- 1. Devuelve una lista con el código del producto, nombre del producto, código del 
-- fabricante y nombre del fabricante, de todos los productos de la base de datos.

select producto.codigo, producto.nombre, codigo_fabricante, fabricante.codigo from 
tienda.producto left join tienda.fabricante on producto.codigo = fabricante.codigo;



-- 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de
-- todos los productos de la base de datos. Ordene el resultado por el nombre del 
-- fabricante, por orden alfabético.

select producto.nombre, producto.precio, fabricante.nombre from tienda.producto left join
tienda.fabricante on producto.codigo = fabricante.codigo order by fabricante.nombre asc;

-- 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del 
-- producto más barato.

select producto.nombre, fabricante.nombre, MIN(producto.precio) from tienda.producto 
left join tienda.fabricante  on producto.codigo = fabricante.codigo;

-- 4. Devuelve una lista de todos los productos del fabricante Lenovo.

select * from fabricante f left join producto p on p.codigo_fabricante = f.codigo 
where f.nombre like "%Lenovo%";

-- 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un 
-- precio mayor que $200.

select * from fabricante f left join producto p on p.codigo_fabricante = f.codigo where
p.precio > 200;

-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, 
-- Hewlett-Packard. Utilizando el operador IN.

select * from fabricante f left join producto p on p.codigo_fabricante = f.codigo
where f.nombre in ("Asus", "Hewlett-Packard");

-- 7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, 
-- de todos los productos que tengan un precio mayor o igual a $180. Ordene el 
-- resultado en primer lugar por el precio (en orden descendente) y en segundo lugar 
-- por el nombre (en orden ascendente)

select p.nombre, p.precio, f.nombre from fabricante f 
left join producto p on p.codigo_fabricante = f.codigo where p.precio >= 180 
order by p.precio desc, p.nombre asc; 

-- Consultas Multitabla
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.

-- 1. Devuelve un listado de todos los fabricantes que existen en la base de datos, 
-- junto con los productos que tiene cada uno de ellos. El listado deberá mostrar 
-- también aquellos fabricantes que no tienen productos asociados.

select f.nombre, p.nombre from fabricante f left join producto p 
on p.codigo_fabricante = f.codigo;

-- 2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen 
-- ningún producto asociado.

select * from producto right join fabricante 
on producto.codigo_fabricante = fabricante.codigo 
where producto.nombre is null;

-- Subconsultas (En la cláusula WHERE)
-- Con operadores básicos de comparación
-- 1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).

select * from producto, fabricante where producto.codigo_fabricante = fabricante.codigo 
and fabricante.nombre like "%Lenovo%";

-- 2. Devuelve todos los datos de los productos que tienen el mismo precio que el 
-- producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).

select * from producto, fabricante where producto.codigo_fabricante = fabricante.codigo 
and producto.precio = (select MAX(producto.precio) from producto, fabricante 
where producto.codigo_fabricante = fabricante.codigo and fabricante.nombre 
like "%Lenovo%");

-- 3. Lista el nombre del producto más caro del fabricante Lenovo.

select producto.nombre, fabricante.nombre, MAX(producto.precio) from producto, fabricante 
where producto.codigo_fabricante = fabricante.codigo and fabricante.nombre 
like "%Lenovo%";

-- 4. Lista todos los productos del fabricante Asus que tienen un precio superior al 
-- precio medio de todos sus productos.

select producto.nombre, fabricante.nombre, producto.precio from producto, fabricante where producto.codigo_fabricante = fabricante.codigo 
and producto.precio > (select AVG(producto.precio) from producto, fabricante 
where producto.codigo_fabricante = fabricante.codigo and fabricante.nombre 
like "%Asus%");

-- Subconsultas con IN y NOT IN
-- 1. Devuelve los nombres de los fabricantes que tienen productos asociados. 
-- (Utilizando IN o NOT IN).

select codigo, nombre from fabricante where codigo 
in (select codigo_fabricante from producto);

-- 2. Devuelve los nombres de los fabricantes que no tienen productos asociados. 
-- (Utilizando IN o NOT IN).

select codigo, nombre from fabricante where codigo 
not in (select codigo_fabricante from producto);

-- Subconsultas (En la cláusula HAVING)

-- 1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo
-- número de productos que el fabricante Lenovo.

select p.codigo_fabricante, f.nombre, count(*) from producto p, fabricante f 
where p.codigo_fabricante = f.codigo group by p.codigo_fabricante having count(*) = 
(select count(*) from producto where codigo_fabricante = (select codigo 
from fabricante where nombre like "%Lenovo%"));


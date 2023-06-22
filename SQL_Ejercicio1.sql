-- ejercicio 1
-- 1. Obtener los datos completos de los empleados.

select * from empleados;

-- 2. Obtener los datos completos de los departamentos.

select * from departamentos;

-- 3. Listar el nombre de los departamentos.

select nombre_depto from departamentos;

-- 4. Obtener el nombre y salario de todos los empleados.

select nombre, sal_emp from empleados;

-- 5. Listar todas las comisiones.

select comision_emp from empleados;

-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.

select * from empleados where cargo_emp = "Secretaria";

-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre
-- alfabéticamente. // para ordenar de forma descendente despues de nombre desc

select * from empleados where cargo_emp = "vendedor" order by nombre;

-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a
-- mayor.

select nombre, cargo_emp from empleados;

-- 9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad
-- de “Ciudad Real”

select nombre_jefe_depto from personal.departamentos where ciudad = "CIUDAD REAL";

-- 10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las
-- respectivas tablas de empleados.

select nombre AS Nombre, cargo_emp AS Cargo from personal.empleados;

-- 11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado
-- por comisión de menor a mayor.

select sal_emp, comision_emp from personal.empleados where id_depto = 2000 order by comision_emp ASC;

-- 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta
-- de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
-- empleado y el total a pagar, en orden alfabético.

select nombre, (sal_emp + comision_emp + 500) from personal.empleados where id_depto = 3000;

-- 13. Muestra los empleados cuyo nombre empiece con la letra J.

select nombre from personal.empleados where nombre like "J%";

-- 14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
-- empleados que tienen comisión superior a 1000.

select sal_emp, comision_emp, (sal_emp + comision_emp), nombre from personal.empleados where comision_emp > 1000;

-- 15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
-- comisión.

select sal_emp, comision_emp, (sal_emp + comision_emp), nombre from personal.empleados where comision_emp = 0;

-- 16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.

select nombre, sal_emp, comision_emp from personal.empleados where comision_emp > sal_emp;

-- 17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.

select nombre, sal_emp, comision_emp from personal.empleados where comision_emp <= (sal_emp * 0.30);

-- 18. Hallar los empleados cuyo nombre no contiene la cadena “MA”

select nombre from personal.empleados where NOT nombre like "%MA%";

-- 19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o
-- ‘Mantenimiento.

select nombre_depto from personal.departamentos where nombre_depto in ("Ventas", "investigacion", "Mantenimiento");

-- 20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni
-- “Investigación” ni ‘Mantenimiento.

select nombre_depto from personal.departamentos where not nombre_depto in ("Ventas", "investigacion", "Mantenimiento");

-- 21. Mostrar el salario más alto de la empresa.

select MAX(sal_emp) from personal.empleados;

-- 22. Mostrar el nombre del último empleado de la lista por orden alfabético.

select nombre from personal.empleados order by nombre DESC limit 1;

-- 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
 
select MAX(sal_emp), MIN(sal_emp), (MAX(sal_emp) - MIN(sal_emp)) from personal.empleados;

-- 24. Hallar el salario promedio por departamento.

select id_depto, AVG(sal_emp) from personal.empleados group by id_depto;

-- Consultas con Having

-- 25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
-- empleados de esos departamentos.

select id_depto, count(id_emp) from personal.empleados group by id_depto having count(id_emp) > 3;

-- 26. Hallar los departamentos que no tienen empleados

select id_depto, count(id_emp) from personal.empleados group by id_depto having count(id_emp) = 0;

-- Consulta Multitabla (Uso de la sentencia JOIN/LEFT JOIN/RIGHT JOIN)

-- 27. Mostrar la lista de empleados, con su respectivo departamento y el jefe de cada
-- departamento.

select nombre, nombre_depto, nombre_jefe_depto from personal.empleados right join personal.departamentos on empleados.id_depto = departamentos.id_depto;

-- Consulta con Subconsulta
-- 28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
-- empresa. Ordenarlo por departamento.

select nombre, sal_emp from personal.empleados where sal_emp >= (select AVG(sal_emp) from personal.empleados) order by id_depto;


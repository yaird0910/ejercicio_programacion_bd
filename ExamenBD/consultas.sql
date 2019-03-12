

-- 2. Mostrar el número de ventas de cada producto, ordenado de más a menos ventas

select p.nombre, count(*) as cantidad 
from venta v inner join productos p 
on v.producto=p.producto 
group by v.producto 
order by cantidad desc;



-- 3. Obtener un informe completo de ventas, indicando el nombre del cajero que realizo la venta, nombre y
-- precios de los productos vendidos, y el piso en el que se encuentra la máquina registradora donde se
-- realizó la venta.

select (select nomapelis from cajeros c where c.cajero=v.cajero) as cajero,
(select nombre from productos p where p.producto=v.producto) as producto,
(select precio from productos p where p.producto=v.producto) as precio,
(select piso from maquinas_registradoras m where m.maquina=v.maquina) as piso
from venta v;



-- 4. Obtener las ventas totales realizadas en cada piso

select (select piso from maquinas_registradoras m where m.maquina=v.maquina) as piso,
count(*) as ventas
from venta v 
group by piso;



-- 5. Obtener el código y nombre de cada cajero junto con el importe total de sus ventas.

select c.cajero, c.nomapelis as nombre, 
(select SUM(p.precio) from venta v inner join productos p on v.producto=p.producto where v.cajero=c.cajero) as ventas
from cajeros c;



-- 6. Obtener el código y nombre de aquellos cajeros que hayan realizado ventas en pisos cuyas ventas
-- totales sean inferiores a los 5000 pesos.

select c.cajero, c.nomapelis as nombre
from cajeros c inner join venta v on c.cajero=v.cajero inner join maquinas_registradoras ma on ma.maquina=v.maquina
where (select SUM(p.precio) from venta v inner join productos p on v.producto=p.producto
		inner join maquinas_registradoras m on m.maquina=v.maquina where m.piso=ma.piso) < 5000
group by c.cajero;

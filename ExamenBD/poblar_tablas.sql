-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-03-2019 a las 19:23:10
-- Versión del servidor: 10.1.30-MariaDB
-- Versión de PHP: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `test1`
--

--
-- Volcado de datos para la tabla `cajeros`
--

INSERT INTO `cajeros` (`Cajero`, `NomApelis`) VALUES
(1, 'Raul Perez'),
(2, 'Juan Mendoza');

--
-- Volcado de datos para la tabla `maquinas_registradoras`
--

INSERT INTO `maquinas_registradoras` (`Maquina`, `Piso`) VALUES
(1, 2),
(2, 4),
(3, 3),
(4, 3);

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`Producto`, `Nombre`, `Precio`) VALUES
(1, 'pan', '20'),
(2, 'refresco', '15'),
(3, 'cereal', '40'),
(4, 'jabon', '30');

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`Cajero`, `Maquina`, `Producto`) VALUES
(1, 2, 1),
(2, 1, 4),
(2, 2, 3),
(1, 1, 2),
(2, 2, 4),
(1, 1, 1),
(1, 2, 1),
(1, 2, 1),
(1, 1, 1),
(2, 2, 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

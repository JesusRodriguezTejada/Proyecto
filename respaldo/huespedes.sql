-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-06-2021 a las 06:22:52
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huespedes`
--

CREATE TABLE `huespedes` (
  `NumHab` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Piso` int(11) NOT NULL,
  `FechaEntrada` varchar(45) NOT NULL,
  `FechaSalida` varchar(45) NOT NULL,
  `TipoHabitacion` varchar(45) NOT NULL,
  `Personas` int(11) NOT NULL,
  `PersonasExtras` int(11) NOT NULL,
  `Ciudad` varchar(45) NOT NULL,
  `Dias` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `huespedes`
--

INSERT INTO `huespedes` (`NumHab`, `Nombre`, `Piso`, `FechaEntrada`, `FechaSalida`, `TipoHabitacion`, `Personas`, `PersonasExtras`, `Ciudad`, `Dias`) VALUES
(100, 'juancho ', 1, 'Jun 8, 2021', '01/07/2021', 'Doble', 3, 0, 'lobos', 23),
(103, 'Juan Perez', 1, 'Jun 23, 2021', '09/07/2021', 'Sensilla', 2, 0, 'solar', 16),
(108, 'Alberto Martinez ', 1, 'Jun 30, 2021', '23/07/2021', 'Sencilla', 2, 0, 'San pancho', 23),
(109, 'Miguel Pana', 1, 'Jun 2, 2021', '14/06/2021', 'Sencilla', 2, 1, 'palmas', 12),
(111, 'Lucas', 1, 'Jun 15, 2021', '08/07/2021', 'Triple', 3, 0, 'salvador', 23),
(118, 'Maria Martinez', 2, 'Jun 23, 2021', '12/02/2022', 'Triple', 4, 0, 'Loreto', 23),
(120, 'Ana', 2, 'Jun 16, 2021', '24/06/2021', 'Sencilla', 2, 0, 'Chihuahua', 8),
(122, 'Fernando ', 2, 'Jun 14, 2021', '15/10/2021', 'Triple', 5, 0, 'tepito', 123),
(125, 'pedro', 2, 'Jun 22, 2021', '04/07/2021', 'Doble', 1, 0, 'sunsion', 12),
(127, 'Franco', 2, 'Jun 9, 2021', '23/06/2021', 'Doble', 5, 1, 'Juarez', 14);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD PRIMARY KEY (`NumHab`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

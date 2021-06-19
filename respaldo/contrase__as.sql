-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-06-2021 a las 01:41:55
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 7.3.28

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
-- Estructura de tabla para la tabla `contraseñas`
--

CREATE TABLE `contraseñas` (
  `usuario` varchar(10) NOT NULL,
  `contraseña` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `contraseñas`
--

INSERT INTO `contraseñas` (`usuario`, `contraseña`) VALUES
('gil134679', '0707a4a998376ae41d5ffc3d8f4ae667'),
('Jesus_123', '465f1abe850fcbefad21c50b2fdcf07a'),
('paulina_', '4d186321c1a7f0f354b297e8914ab240'),
('pau_alo', 'f69315a2f7531586a6d273c1a5a7dc0a');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contraseñas`
--
ALTER TABLE `contraseñas`
  ADD PRIMARY KEY (`usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

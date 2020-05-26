-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-05-2020 a las 20:23:08
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `base_de_datos_blog`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `blog`
--

CREATE TABLE `blog` (
  `id` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `titulo` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `contenido` varchar(2555) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `autor` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `blog`
--

INSERT INTO `blog` (`id`, `fecha`, `titulo`, `contenido`, `autor`) VALUES
(3, '2020-05-13', 'COMO ADELGAZAR MEJORANDO SU SISTEMA DIGESTIVO', 'Es un hecho establecido hace demasiado tiempo que un lector se distraer  con el contenido del texto de un sitio mientras que mira su diseÃÂ±o. El punto de usar Lorem Ipsum es que tiene una.', 'Roger huanca cori'),
(5, '2020-05-25', 'MODELO COMPUTACIONAL QUE PUSO AL MUNDO EN CUARENTENA', 'prueba', 'Roger');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usuario` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `password` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `password`) VALUES
(1, 'Roger', 'emergentes2020');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `blog`
--
ALTER TABLE `blog`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `blog`
--
ALTER TABLE `blog`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-11-2017 a las 19:51:04
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdencomiendas`
--
CREATE DATABASE IF NOT EXISTS `bd_encomiendas` DEFAULT CHARACTER SET latin1 COLLATE latin1_spanish_ci;
USE `bd_encomiendas`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encomienda`
--

CREATE TABLE `encomienda` (
  `en_id` int(11) NOT NULL,
  `en_destinatario` varchar(45) COLLATE latin1_spanish_ci NOT NULL,
  `en_direccion` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `en_tipo` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `en_entregadomicilio` tinyint(1) NOT NULL,
  `en_tamano` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `en_remitente` varchar(45) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `encomienda`
--
ALTER TABLE `encomienda`
  ADD PRIMARY KEY (`en_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-03-2023 a las 08:10:40
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `glovobd`
--
CREATE DATABASE IF NOT EXISTS `glovobd` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci;
USE `glovobd`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `restaurante`
--

CREATE TABLE `restaurante` (
  `id_Restaurante` int(99) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Tipo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Ventas` int(99) NOT NULL,
  `Puntuacion` int(10) NOT NULL,
  `Imagen` varchar(535) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `restaurante`
--

INSERT INTO `restaurante` (`id_Restaurante`, `Nombre`, `Tipo`, `Ventas`, `Puntuacion`, `Imagen`) VALUES
(1, 'Pacos', 'Abrasador', 10, 7, 'https://www.noroestemadrid.com/wp-content/uploads/2021/06/ABRASADOR-PACO-PRADO-MADRID-1-002.jpg'),
(2, 'Kebaberia', 'Kebab', 60, 8, 'https://insidezaragoza.com/wp-content/uploads/2022/09/fachada-kebab-miralbueno.png'),
(3, 'Variopinto', 'Pijo', 25, 3, 'https://metro7.es/wp-content/uploads/2020/03/mg_5351_web-385x385.jpg'),
(4, 'Tagliatela', 'Pijo', 40, 4, 'https://res.cloudinary.com/hesvvq3zo/image/upload/v1613038199/0013V00000BTALkQAP/Images__c/1.jpg.jpg'),
(5, 'Takeshi', 'Japones', 75, 8, 'https://images.adsttc.com/media/images/5bf3/5d1c/08a5/e509/1100/014e/newsletter/FEATURE_IMAGE.jpg?1542675707'),
(6, 'Manuel y los hermanos', 'Abrasador', 90, 9, 'https://abrasador.com/wp-content/uploads/2016/02/rio-jerte-salon-2-op.jpg'),
(7, 'Mushashi', 'Japones', 79, 7, 'https://images.adsttc.com/media/images/5b22/d9cf/f197/ccfa/2700/010f/newsletter/06075_140925-002D.jpg?1529010631'),
(8, 'Ankara kebab', 'Kebab', 73, 7, 'https://images.milanuncios.com/api/v1/ma-ad-media-pro/images/1733d0a6-29ee-410c-9dcf-f67616e884ce?rule=hw396_70'),
(9, 'Indidu', 'Indio', 10, 1, 'https://media-cdn.tripadvisor.com/media/photo-s/0f/54/87/17/interior-restaurante.jpg'),
(10, 'Goa', 'Indio', 20, 2, 'https://media-cdn.tripadvisor.com/media/photo-s/18/1a/a5/40/getlstd-property-photo.jpg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `restaurante`
--
ALTER TABLE `restaurante`
  ADD PRIMARY KEY (`id_Restaurante`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `restaurante`
--
ALTER TABLE `restaurante`
  MODIFY `id_Restaurante` int(99) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2020. Aug 27. 12:47
-- Kiszolgáló verziója: 10.4.6-MariaDB
-- PHP verzió: 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `invoices`
--
CREATE DATABASE IF NOT EXISTS `invoices` DEFAULT CHARACTER SET utf8 COLLATE utf8_hungarian_ci;
USE `invoices`;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `customers`
--

CREATE TABLE `customers` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_hungarian_ci NOT NULL,
  `address` varchar(255) COLLATE utf8_hungarian_ci NOT NULL,
  `zip_code` varchar(10) COLLATE utf8_hungarian_ci NOT NULL,
  `city` varchar(150) COLLATE utf8_hungarian_ci NOT NULL,
  `country` varchar(150) COLLATE utf8_hungarian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `customers`
--

INSERT INTO `customers` (`id`, `name`, `address`, `zip_code`, `city`, `country`) VALUES
(1, 'Minta Kft', 'Kossuth Tér 3', '1051', 'Budapest', 'Magyarország'),
(2, 'Proba Kft', 'Budapesti út 106', '9400', 'Sopron', 'Magyarország'),
(3, 'Nagy Kft', 'Budapesti út 10', '6700', 'Szeged', 'Magyarorszag'),
(4, 'Holnap KFt', 'Béla utca 4', '8200', 'Veszprém', 'Magyarorszag'),
(5, 'Jővő KFt', 'Haraszti utca 30', '9700', 'Szombathely', 'Magyarorszag'),
(6, 'Horváth Béla', 'Zanati út 31', '9700', 'Szombathely', 'Magyarorszag'),
(7, 'Kiss János', 'Ikervári utca 42', '9600', 'Sárvár', 'Magyarorszag'),
(8, 'Minta Géza', 'Megyeri út 227', '1101', 'Budapest', 'Magyarország'),
(9, 'Minta Géza', 'Megyeri út 227', '1101', 'Budapest', 'Magyarország'),
(10, 'Minta Géza', 'Megyeri út 227', '1101', 'Budapest', 'Magyarország'),
(11, 'Minta Géza', 'Megyeri út 227', '1101', 'Budapest', 'Magyarország'),
(12, 'Káporsztás Kft', 'valami utca 8', '1111', 'Budapest', 'Hungary');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `invoiceitems`
--

CREATE TABLE `invoiceitems` (
  `id` int(11) NOT NULL,
  `itemName` varchar(255) COLLATE utf8_hungarian_ci NOT NULL,
  `invoice` int(11) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `unitPrice` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `invoiceitems`
--

INSERT INTO `invoiceitems` (`id`, `itemName`, `invoice`, `quantity`, `unitPrice`) VALUES
(1, 'Autómotor', 1, 1, 100000),
(2, 'Visszapillantó tükör', 1, 2, 10000),
(3, 'Jobb oldali ajtó', 1, 1, 5000),
(4, 'Légzsák', 1, 2, 12000),
(5, 'Szélvédő', 1, 1, 30000),
(6, 'Akkumulátor', 2, 2, 30000),
(7, 'Honda féltengely', 2, 2, 20000),
(8, 'Suzuki féltengely', 3, 4, 5000),
(9, 'Volkswagen féltengely', 3, 2, 25000),
(10, 'Bal oldali kilincs (suzuki) ', 3, 1, 2000),
(11, 'jobb oldali kilincs ', 3, 1, 2000),
(12, 'Bal első sárvédő (suzuki)', 3, 1, 7000),
(13, 'Jobb első sárvédő (suzuki)', 3, 1, 7000),
(14, 'Főtengely', 4, 1, 25000),
(15, 'Féltengely gumiharang (audi)', 5, 2, 40000),
(16, 'Levegőszűrő', 5, 1, 4000),
(17, 'Olajszűrő', 5, 5, 3000),
(18, 'Mobil1 motorolaj 5w40 1L', 5, 5, 4000),
(19, 'Üzemanyagszűrő', 5, 1, 7000),
(20, 'Alufelni (mercedes) 5x114 16\"', 6, 4, 25000),
(21, 'Vezető oldali ablaküveg(skoda)', 7, 1, 7000),
(22, 'Anyós oldali ablaküveg(skoda)', 7, 1, 7000),
(23, 'Bal hátsó ablaküveg(skoda)', 7, 1, 7000),
(24, 'Jobb hátsó ablaküveg(skoda)', 7, 1, 7000),
(25, 'Mobil1 motorolaj 5w40 1L', 8, 5, 4000),
(26, 'Mobil1 motorolaj 10w40 1L', 8, 7, 7000),
(27, 'valami', 1, 10, 20000),
(28, 'valami', 14, 10, 20000),
(29, 'Semmi', 14, 10, 10000),
(30, 'semmi', 15, 4, 200000),
(31, 'semmi', 16, 2, 1000),
(32, 'semmi', 17, 2, 1000),
(33, 'semmi', 18, 2, 1000),
(34, 'semmi', 19, 2, 1000),
(35, 'semmi', 20, 2, 1000),
(36, 'semmi', 21, 2, 1000),
(37, 'semmi', 22, 2, 1000),
(38, 'semmi', 23, 2, 1000),
(39, 'semmi', 24, 2, 1000);

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `invoices`
--

CREATE TABLE `invoices` (
  `id` int(11) NOT NULL,
  `customer` int(11) NOT NULL,
  `issueDate` datetime NOT NULL,
  `dueDate` datetime NOT NULL,
  `comment` varchar(255) COLLATE utf8_hungarian_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `invoices`
--

INSERT INTO `invoices` (`id`, `customer`, `issueDate`, `dueDate`, `comment`) VALUES
(1, 1, '2020-01-04 00:00:00', '2020-01-04 00:00:00', NULL),
(2, 2, '2020-01-06 00:00:00', '2020-01-06 00:00:00', NULL),
(3, 3, '2020-02-08 00:00:00', '2020-02-11 00:00:00', NULL),
(4, 4, '2020-03-09 00:00:00', '2020-03-09 00:00:00', NULL),
(5, 5, '2020-04-10 00:00:00', '2020-04-15 00:00:00', NULL),
(6, 3, '2020-04-18 00:00:00', '2020-04-20 00:00:00', NULL),
(7, 6, '2020-06-18 00:00:00', '2020-06-20 00:00:00', NULL),
(8, 7, '2020-07-18 00:00:00', '2020-07-20 00:00:00', NULL),
(9, 6, '2020-08-27 09:42:50', '2020-08-27 00:00:00', NULL),
(10, 3, '2020-08-27 09:45:09', '2020-08-27 00:00:00', NULL),
(11, 4, '2020-08-27 09:50:37', '2020-08-27 00:00:00', NULL),
(12, 5, '2020-08-27 09:52:59', '2020-08-27 00:00:00', NULL),
(13, 4, '2020-08-27 09:55:25', '2020-08-27 00:00:00', NULL),
(14, 8, '2020-08-27 10:00:30', '2020-08-27 00:00:00', NULL),
(15, 11, '2020-08-27 11:08:34', '2020-08-27 00:00:00', NULL),
(16, 11, '2020-08-27 11:10:44', '2020-08-27 00:00:00', NULL),
(17, 11, '2020-08-27 11:17:58', '2020-08-27 00:00:00', NULL),
(18, 11, '2020-08-27 11:18:26', '2020-08-27 00:00:00', NULL),
(19, 11, '2020-08-27 11:18:36', '2020-08-27 00:00:00', NULL),
(20, 11, '2020-08-27 11:19:15', '2020-08-27 00:00:00', NULL),
(21, 11, '2020-08-27 11:20:11', '2020-08-27 00:00:00', NULL),
(22, 11, '2020-08-27 11:20:55', '2020-08-27 00:00:00', NULL),
(23, 11, '2020-08-27 11:22:10', '2020-08-27 00:00:00', NULL),
(24, 11, '2020-08-27 11:22:37', '2020-08-27 00:00:00', NULL);

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `sequence`
--

CREATE TABLE `sequence` (
  `SEQ_NAME` varchar(50) COLLATE utf8_hungarian_ci NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `sequence`
--

INSERT INTO `sequence` (`SEQ_NAME`, `SEQ_COUNT`) VALUES
('SEQ_GEN', '0');

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`);

--
-- A tábla indexei `invoiceitems`
--
ALTER TABLE `invoiceitems`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_invoice` (`invoice`);

--
-- A tábla indexei `invoices`
--
ALTER TABLE `invoices`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_customers` (`customer`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `customers`
--
ALTER TABLE `customers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT a táblához `invoiceitems`
--
ALTER TABLE `invoiceitems`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT a táblához `invoices`
--
ALTER TABLE `invoices`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `invoiceitems`
--
ALTER TABLE `invoiceitems`
  ADD CONSTRAINT `FK_invoice` FOREIGN KEY (`invoice`) REFERENCES `invoices` (`id`);

--
-- Megkötések a táblához `invoices`
--
ALTER TABLE `invoices`
  ADD CONSTRAINT `FK_customers` FOREIGN KEY (`customer`) REFERENCES `customers` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

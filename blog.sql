-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 09 avr. 2024 à 20:50
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `blog`
--
CREATE DATABASE IF NOT EXISTS `blog` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `blog`;

-- --------------------------------------------------------

--
-- Structure de la table `article`
--

DROP TABLE IF EXISTS `article`;
CREATE TABLE IF NOT EXISTS `article` (
  `sujet` varchar(50) NOT NULL,
  `desciption` varchar(255) NOT NULL,
  `nb_jaime` int(11) NOT NULL,
  `nb_naime` int(11) NOT NULL,
  `id` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `article`
--

INSERT INTO `article` (`sujet`, `desciption`, `nb_jaime`, `nb_naime`, `id`) VALUES
('MISA', 'La MISA a remport l\'orange digital center', 3, 2, '2024-04-09 19:15:16'),
('Fanolanana', 'Vosirina daholo ireo nahavanon-doza', 0, 2, '2024-04-09 19:42:18');

-- --------------------------------------------------------

--
-- Structure de la table `utilsateurs`
--

DROP TABLE IF EXISTS `utilsateurs`;
CREATE TABLE IF NOT EXISTS `utilsateurs` (
  `username` varchar(100) NOT NULL,
  `mdp` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tel` varchar(50) NOT NULL,
  `adresse` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilsateurs`
--

INSERT INTO `utilsateurs` (`username`, `mdp`, `email`, `tel`, `adresse`) VALUES
('iantso', '123456', 'iantso@gmail.com', '0344134111', 'Lot t 144 A ambatonjara'),
('neny', '123456', 'test@gmail.com', '0341221813', 'adresse');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

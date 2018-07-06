DROP DATABASE IF EXISTS online_store;

CREATE DATABASE IF NOT EXISTS online_store;

USE online_store;

CREATE TABLE `online_store`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(65) NOT NULL,
  `password` VARCHAR(65) NOT NULL,
  `id_profile` INT NOT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE TABLE `online_store`.`profiles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(65) NOT NULL,
  `last_name` VARCHAR(65) NOT NULL,
  `email` VARCHAR(65) NOT NULL,
  `sex` VARCHAR(65) NOT NULL,
  `telephone_number` INT NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `id_address` INT NOT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE TABLE `online_store`.`addresses` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(65) NOT NULL,
  `region` VARCHAR(65) NOT NULL,
  `city` VARCHAR(65) NOT NULL,
  `street` VARCHAR(65) NOT NULL,
  `build_number` VARCHAR(65) NOT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE TABLE `online_store`.`products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `product_name` VARCHAR(65) NOT NULL,
  `manufacturer` VARCHAR(65) NOT NULL,
  `description` VARCHAR(65) NOT NULL,
  `amount` INT NOT NULL,
  `id_product_price` INT NOT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE TABLE `online_store`.`product_prices` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `item_price` DOUBLE NOT NULL,
  `date_of_setting_price` DATE NOT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE TABLE `online_store`.`categories` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `category_name` VARCHAR(65) NOT NULL,
  `id_subcategory` INT NOT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE TABLE `online_store`.`category_product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_category` INT NOT NULL,
  `id_product` INT NOT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE TABLE `online_store`.`shopping_cart` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_user` INT NOT NULL,
  `type` VARCHAR(65) NOT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE TABLE `online_store`.`shopping_cart_product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_shopping_cart` INT NOT NULL,
  `id_product` INT NOT NULL,
  `product_amount` DOUBLE NOT NULL,
  `price` DOUBLE NOT NULL,
  `shopping_date` DATE NOT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;



--CREATE USER 'fod_A'@'localhost' IDENTIFIED BY 'fusion_fod_a';
--CREATE SCHEMA FOD_A;
--GRANT ALL PRIVILEGES ON FOD_A . * TO 'fod_A'@'localhost';
--FLUSH PRIVILEGES;
--
--CREATE USER 'fod_B'@'localhost' IDENTIFIED BY 'fusion_fod_b';
--CREATE SCHEMA FOD_B;
--GRANT ALL PRIVILEGES ON FODB_B . * TO 'fod_B'@'localhost';
--FLUSH PRIVILEGES;
--
--
--/*in case of java.sql.SQLException: The server timezone value 'UTC' is unrecognized or represents more than one timezone. */
--SET GLOBAL time_zone = '+3:00';
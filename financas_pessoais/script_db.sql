/*FINANCAS_PESSOAIS*/

CREATE DATABASE FINANCAS_PESSOAIS;

CREATE TABLE USUARIO(
	IDUSUARIO INT PRIMARY KEY AUTO_INCREMENT,
	NOME VARCHAR(30) NOT NULL,
	EMAIL VARCHAR(30) UNIQUE,
	TELEFONE VARCHAR(30) NOT NULL,
	CIDADE VARCHAR(30) NOT NULL,
	UF VARCHAR(2) NOT NULL,
	GENERO ENUM('M','F') NOT NULL

);

CREATE TABLE TIPO_LANCAMENTO(
	IDTIPO_LANCAMENTO 
);
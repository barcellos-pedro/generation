#  ###### CREATE #######

CREATE DATABASE bdRH;

USE bdRH;

CREATE TABLE funcionarios(
	id int (100) auto_increment,
    nome varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    dtNascimento date NOT NULL,
    endereco varchar(100) NOT NULL,
    telefone varchar(20) NOT NULL,
    salario float NOT NULL,
    PRIMARY KEY (id)
);

#  ###### INSERT #######

INSERT INTO funcionarios (nome, email, dtNascimento, endereco, telefone, salario)
VALUES("fulano", "fulano.nascimento@bol.com.br", 02/02/2002, "rua dos fulanos 233", "2222-2222", 2300);

INSERT INTO funcionarios (nome, email, dtNascimento, endereco, telefone, salario)
VALUES("sicrano", "sicrano.lala@ig.com.br", "2002/02/22", "rua dos sicranos 333", "2222-2222", 999);

INSERT INTO funcionarios (nome, email, dtNascimento, endereco, telefone, salario)
VALUES("alfabeto", "alfabeto.michaelis@source.com.br", "1990/01/02", "rua das letras 32", "3333-3333", 5000.99);

INSERT INTO funcionarios (nome, email, dtNascimento, endereco, telefone, salario)
VALUES("Mr Pink", "bigapple@gmail.com.br", "1987/05/01", "rua dos ladrilhos 00", "1212-1111", 600.30);

#  ###### SELECT #######

SELECT * FROM funcionarios;

SELECT * FROM funcionarios WHERE salario >= 2000;

SELECT * FROM funcionarios WHERE salario <= 2000;

#  ###### UPDATE #######

UPDATE funcionarios SET nome = "siclano", email = "siclano.lala@ig.com.br" WHERE id = 2;
#  ###### CREATE #######

CREATE DATABASE bdECommerce;

USE bdECommerce;

CREATE TABLE produtos(
	id int auto_increment,
    nome varchar(50) NOT NULL,
    descricao varchar(120) NOT NULL,
    quantidade bigint NOT NULL,
    dt_vencimento date NOT NULL,
    valor float NOT NULL,
    PRIMARY KEY (id)
);

#  ###### INSERT #######

INSERT INTO produtos (nome, descricao, quantidade, dt_vencimento, valor) VALUES("Qualy", "Margarina Top", 3, "2020/12/01", 3.50);
INSERT INTO produtos (nome, descricao, quantidade, dt_vencimento, valor) VALUES("Batedeira Deluxe", "Batedeira Oster 1000 em 1", 1, "2080/11/11", 120.90);
INSERT INTO produtos (nome, descricao, quantidade, dt_vencimento, valor) VALUES("Macbook Air 2017 Usado", "Aquele PC responsa", 5, "2100/02/22", 5500);
INSERT INTO produtos (nome, descricao, quantidade, dt_vencimento, valor) VALUES("Playstation 4", "Videogame pra tirar um lazer", 99, "2999/01/31", 2400);

#  ###### SELECT #######

SELECT * FROM produtos;
SELECT * FROM produtos WHERE valor > 500;
SELECT * FROM produtos WHERE valor < 500;

#  ###### UPDATE #######

UPDATE produtos SET descricao = "Margarina, não manteiga." WHERE id = 1;
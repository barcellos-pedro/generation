# #### CREATE ####
CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	id bigint auto_increment,
    categoria varchar(50) NOT NULL,
    responsavel varchar(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE tb_pizza(
	id bigint auto_increment,
    pizza varchar(50) NOT NULL,
    valor float NOT NULL,
    quantidade int NOT NULL,
    id_categoria bigint NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id)
);

# #### INSERT ####
INSERT INTO tb_categoria (categoria, responsavel) VALUES
("Salgada", "Roberval"), ("Doce", "Petros"), ("Mista", "Cristal");

INSERT INTO tb_pizza (pizza, valor, quantidade, id_categoria) VALUES
("Pizza de Escarola", 50, 3, 1), ("Pizza de brigadeiro", 34, 5, 2), ("Meia Portuguesa e meia Banana", 35.9, 4, 3);

# #### SELECT ####
SELECT * FROM tb_categoria;
SELECT * FROM tb_pizza;

SELECT * FROM tb_pizza WHERE valor > 45;
SELECT * FROM tb_pizza WHERE valor BETWEEN 29 AND 60;

SELECT * FROM tb_pizza WHERE pizza LIKE "%c%";

SELECT tb_pizza.id, pizza, valor, quantidade, categoria FROM tb_pizza
	INNER JOIN tb_categoria ON tb_pizza.id_categoria = tb_categoria.id;
    
SELECT tb_pizza.id, pizza, valor, quantidade, categoria FROM tb_pizza
	INNER JOIN tb_categoria ON tb_pizza.id_categoria = tb_categoria.id WHERE categoria = "Doce";
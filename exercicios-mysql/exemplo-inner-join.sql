#  ###### CREATE #######
CREATE DATABASE bd_teste_join;

USE bd_teste_join;

CREATE TABLE marcas(
	id bigint auto_increment,
    nome varchar(20) NOT NULL,
    ativo boolean NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE produtos(
	id int (3) auto_increment,
    nome varchar(50) NOT NULL,
    preco boolean NOT NULL,
    id_marca bigint NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_marca) REFERENCES marcas (id)
);

#  ###### INSERT  #######
INSERT INTO marcas (nome, ativo) VALUES("Nike", TRUE);
INSERT INTO marcas (nome, ativo) VALUES("Adidas", TRUE);
INSERT INTO marcas (nome, ativo) VALUES("Dry", FALSE);
INSERT INTO marcas (nome, ativo) VALUES("Reebook", FALSE);

INSERT INTO produtos (nome, preco, id_marca) VALUES("Janoski", 300.99, 1);
INSERT INTO produtos (nome, preco, id_marca) VALUES("Camisa Classic", 100.9, 2);
INSERT INTO produtos (nome, preco, id_marca) VALUES("Chuteira básica", 50, 3);
INSERT INTO produtos (nome, preco, id_marca) VALUES("Boot usado", 709, 4);

#  ###### ALTER TABLE #######
ALTER TABLE produtos MODIFY preco decimal;

#  ###### SELECT / INNER JOIN #######
SELECT * FROM marcas;
SELECT * FROM produtos;

SELECT produtos.id, produtos.nome, produtos.preco, marcas.nome FROM produtos
	INNER JOIN marcas
		ON produtos.id_marca = marcas.id;
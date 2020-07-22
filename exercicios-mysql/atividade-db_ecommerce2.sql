#  ###### CREATE #######
CREATE DATABASE db_ecommerce2;

USE db_ecommerce2;

CREATE TABLE tb_categoria(
	id int auto_increment,
    nome varchar(50) NOT NULL,
    responsavel varchar(50) NOT NULL,
    disponibilidade boolean NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE tb_produto(
	id int auto_increment,
    nome varchar(50) NOT NULL,
    descricao varchar(120) NOT NULL,
    quantidade bigint NOT NULL,
    dt_vencimento date NOT NULL,
    valor float NOT NULL,
    id_categoria int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id)
);

#  ###### INSERT #######
INSERT INTO tb_categoria (nome, responsavel, disponibilidade) VALUES("Eletrodoméstico", "Pedro", true);
INSERT INTO tb_categoria (nome, responsavel, disponibilidade) VALUES("Informática", "Kaique", true);
INSERT INTO tb_categoria (nome, responsavel, disponibilidade) VALUES("Móveis", "Sandra", false);
INSERT INTO tb_categoria (nome, responsavel, disponibilidade) VALUES("Jardinagem", "Atila", false);

INSERT INTO tb_produto (nome, descricao, quantidade, dt_vencimento, valor, id_categoria) VALUES("Cafeteira", "Cafeteira top", 3, "2080/12/13", 200, 1);
INSERT INTO tb_produto (nome, descricao, quantidade, dt_vencimento, valor, id_categoria) VALUES("PC Gamer", "Pra você navegar nas interwebs", 15, "2180/12/13", 3300, 3);
INSERT INTO tb_produto (nome, descricao, quantidade, dt_vencimento, valor, id_categoria) VALUES("Sofá em L", "Pra ficar de boas", 43, "3100/12/13", 1200, 4);

#  ###### SELECT #######
SELECT * FROM tb_produto;
SELECT * FROM tb_categoria;

SELECT * FROM tb_produto WHERE valor > 2000;
SELECT * FROM tb_produto WHERE valor BETWEEN 1000 and 2000;
SELECT * FROM tb_produto WHERE nome LIKE "%c%";

SELECT tb_produto.nome, tb_produto.quantidade, tb_produto.valor, tb_categoria.nome FROM tb_produto
	INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id;
        
SELECT tb_produto.nome, tb_produto.quantidade, tb_produto.valor, tb_categoria.nome FROM tb_produto
	INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id
		WHERE tb_categoria.nome LIKE "%Eletrodoméstico%";
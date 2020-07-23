# #### CREATE ####
CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	id bigint auto_increment,
    categoria varchar(50) NOT NULL,
    fornecedor varchar(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE tb_produto(
	id bigint auto_increment,
    nome varchar(50) NOT NULL,
    descricao varchar(50) NOT NULL,
    valor float NOT NULL,
    id_categoria bigint NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id)
);

# #### INSERT ####
INSERT INTO tb_categoria (categoria, fornecedor) VALUES
("Remédios", "ECorp"), ("Cosméticos", "Beauty & Beauty"), ("Doces", "Bomboniere do Zé");

INSERT INTO tb_produto (nome, descricao, valor, id_categoria) VALUES
("Paracetamol", "Remedinho do bem", 33.90, 1), ("Máscara facial BTS", "Melhore sua pele", 55.90, 2), ("Trident", "Chicletin maneiro", 1.90, 3);

# #### SELECT ####
SELECT * FROM tb_categoria;
SELECT * FROM tb_produto;

SELECT * FROM tb_produto WHERE valor > 50;
SELECT * FROM tb_produto WHERE valor BETWEEN 3 and 60;

SELECT * FROM tb_produto WHERE nome LIKE "%b%";

SELECT tb_produto.id, nome, descricao, valor, categoria FROM tb_produto
	INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id;
    
SELECT tb_produto.id, nome, descricao, valor, categoria FROM tb_produto
	INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id WHERE categoria = "Cosméticos";
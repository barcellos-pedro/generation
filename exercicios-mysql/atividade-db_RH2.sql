#  ###### CREATE #######
CREATE DATABASE db_RH2;
USE db_RH2;

CREATE TABLE tb_cargo(
	id int auto_increment,
    nivel varchar(50) NOT NULL,
    setor varchar(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE tb_funcionario(
	id int auto_increment,
    nome varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    endereco varchar(100) NOT NULL,
    telefone varchar(20) NOT NULL,
    salario float NOT NULL,
    id_cargo int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_cargo) REFERENCES tb_cargo(id)
);

#  ###### INSERT #######
INSERT INTO tb_cargo(nivel, setor) VALUES("Estagiário", "T.I");
INSERT INTO tb_cargo(nivel, setor) VALUES("Júnior", "T.I");
INSERT INTO tb_cargo(nivel, setor) VALUES("Pleno", "T.I");
INSERT INTO tb_cargo(nivel, setor) VALUES("Sênior", "T.I");
INSERT INTO tb_cargo(nivel, setor) VALUES("Especialista", "T.I");

INSERT INTO tb_cargo(nivel, setor) VALUES("Estagiário", "Marketing");
INSERT INTO tb_cargo(nivel, setor) VALUES("Júnior", "Marketing");
INSERT INTO tb_cargo(nivel, setor) VALUES("Pleno", "Marketing");
INSERT INTO tb_cargo(nivel, setor) VALUES("Sênior", "Marketing");
INSERT INTO tb_cargo(nivel, setor) VALUES("Especialista", "Marketing");

INSERT INTO tb_funcionario(nome, email, endereco, telefone, salario, id_cargo) VALUES("Pedro", "pedro@barcellos.com.br", "rua três rios 999", "1111-11111", 1500, 3);
INSERT INTO tb_funcionario(nome, email, endereco, telefone, salario, id_cargo) VALUES("Sr. Barcellos", "barcellos@reis.com.br", "rua dos reis 999", "2222-2222", 3500, 4);
INSERT INTO tb_funcionario(nome, email, endereco, telefone, salario, id_cargo) VALUES("Caio", "caio@rafael.com.br", "rua dos loko 999", "3333-3333", 900, 1);
INSERT INTO tb_funcionario(nome, email, endereco, telefone, salario, id_cargo) VALUES("Luana", "luana@rsliva.com.br", "rua dos marketero 999", "4444-4444", 2300, 7);
INSERT INTO tb_funcionario(nome, email, endereco, telefone, salario, id_cargo) VALUES("Ted", "ted@mosby.com.br", "rua da lábia 999", "5555-5555", 5000, 10);

#  ###### SELECT #######
SELECT * FROM tb_cargo;
SELECT * FROM tb_funcionario;

SELECT * FROM tb_funcionario WHERE salario > 2000;
SELECT * FROM tb_funcionario WHERE salario BETWEEN 1000 AND 2000;
SELECT * FROM tb_funcionario WHERE nome LIKE "%c%";

SELECT nome, salario, nivel, setor FROM tb_funcionario
	INNER JOIN tb_cargo ON tb_funcionario.id_cargo = tb_cargo.id;
    
SELECT nome, salario, nivel, setor FROM tb_funcionario
	INNER JOIN tb_cargo ON tb_funcionario.id_cargo = tb_cargo.id
		WHERE tb_cargo.setor = "T.I";
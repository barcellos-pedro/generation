# ##### CREATE #####
CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
	id bigint auto_increment,
    nome varchar(50) NOT NULL,
    patente varchar(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE tb_personagem(
	id bigint auto_increment,
    nome varchar(50),
    pts_ataque int(100) NOT NULL,
    pts_defesa int(100) NOT NULL,
    nivel int(100) NOT NULL,
    id_classe bigint NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_classe) REFERENCES tb_classe (id)
);

# ##### INSERT #####
INSERT INTO tb_classe (nome, patente) VALUES
("Arqueiro", "P1"), ("Mago", "P1"), ("Guerreiro", "P1");

INSERT INTO tb_personagem (nome, pts_ataque, pts_defesa, nivel, id_classe) VALUES
("Legolas", 70, 30, 1, 1), ("Raven", 80, 30, 1, 2), ("Hilda", 50, 80, 1, 3);

INSERT INTO tb_personagem (nome, pts_ataque, pts_defesa, nivel, id_classe) VALUES
("Golias", 2700, 300, 1, 1), ("Venzy", 800, 1500, 1, 2), ("Cami", 5000, 3000, 1, 3);

# ##### SELECT #####
SELECT * FROM tb_classe;
SELECT * FROM tb_personagem;

SELECT * FROM tb_personagem WHERE pts_ataque > 2000;
SELECT * FROM tb_personagem WHERE pts_defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagem WHERE nome LIKE "%ca%";

SELECT tb_personagem.id, tb_personagem.nome, pts_ataque, pts_defesa, nivel, tb_classe.nome FROM tb_personagem
	INNER JOIN tb_classe ON tb_personagem.id_classe = tb_classe.id;
    
SELECT tb_personagem.id, tb_personagem.nome, pts_ataque, pts_defesa, nivel, tb_classe.nome FROM tb_personagem
	INNER JOIN tb_classe ON tb_personagem.id_classe = tb_classe.id WHERE tb_classe.nome = "Arqueiro";
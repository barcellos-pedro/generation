#  ###### CREATE #######
CREATE DATABASE bdEscola;

USE bdEscola;

CREATE TABLE alunos(
	id int auto_increment,
    nome varchar(50) NOT NULL,
    dt_nascimento date NOT NULL,
    nota_final float NOT NULL,
    telefone varchar(15) NOT NULL,
    endereco varchar(50) NOT NULL,
    PRIMARY KEY (id)
);

#  ###### INSERT #######
INSERT INTO alunos (nome, dt_nascimento, nota_final, telefone, endereco) VALUES ("Pedro", "1997/02/02", 7.8, "3333-3333", "rua dos devs 404");
INSERT INTO alunos (nome, dt_nascimento, nota_final, telefone, endereco) VALUES ("Pedro", "1994/01/01", 10, "1111-1111", "rua dos estudantes 44");
INSERT INTO alunos (nome, dt_nascimento, nota_final, telefone, endereco) VALUES ("Ícaro", "1992/12/12", 4.0, "2222-2222", "rua dos esforçados 313");
INSERT INTO alunos (nome, dt_nascimento, nota_final, telefone, endereco) VALUES ("Ícaro", "1990/12/12", 6.5, "4444-4444", "rua dos quatzos 14");
INSERT INTO alunos (nome, dt_nascimento, nota_final, telefone, endereco) VALUES ("aluno teste", "1999/09/09", 9.9, "9999-9999", "rua dos nove 09");

#  ###### SELECT #######
SELECT * FROM alunos;
SELECT * FROM alunos WHERE nota_final > 7.0;
SELECT * FROM alunos WHERE nota_final < 7;

#  ###### UPDATE #######
UPDATE alunos SET nome = "Marcela" WHERE id = 2;
UPDATE alunos SET nome = "Kleber" WHERE id = 4;

#  ###### DELETE #######
DELETE FROM alunos WHERE id = 5;
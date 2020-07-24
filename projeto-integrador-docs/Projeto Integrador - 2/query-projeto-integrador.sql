CREATE TABLE `tb_Usuário` (
	`Id` INT(30) NOT NULL AUTO_INCREMENT,
	`Nome Completo` varchar(50) NOT NULL,
	`E-mail` varchar(100) NOT NULL,
	`Senha` varchar(100) NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `tb_Tema` (
	`Id` INT(30) NOT NULL AUTO_INCREMENT,
	`Nome` varchar(255) NOT NULL,
	`Descrição` varchar(255) NOT NULL,
	`Status` BOOLEAN NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `tb_Postagem` (
	`Id` INT(30) NOT NULL AUTO_INCREMENT,
	`Título` varchar(255) NOT NULL,
	`Conteúdo` varchar(255) NOT NULL,
	`Referência` varchar(255) NOT NULL,
	`Data` DATETIME(10) NOT NULL,
	`id_tema` INT(30) NOT NULL,
	`id_usuario` INT(30) NOT NULL,
	PRIMARY KEY (`Id`)
);

ALTER TABLE `tb_Postagem` ADD CONSTRAINT `tb_Postagem_fk0` FOREIGN KEY (`id_tema`) REFERENCES `tb_Tema`(`Id`);

ALTER TABLE `tb_Postagem` ADD CONSTRAINT `tb_Postagem_fk1` FOREIGN KEY (`id_usuario`) REFERENCES `tb_Usuário`(`Id`);


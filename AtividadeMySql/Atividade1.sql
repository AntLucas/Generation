/*
Atividade 1
Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
trabalhará com as informações dos funcionaries desta empresa.
Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
Popule esta tabela com até 5 dados;
Faça um select que retorne os funcionaries com o salário maior do que 2000.
Faça um select que retorne os funcionaries com o salário menor do que 2000.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

-- DROP ´DATABASE db_rh;
-- criação do banco de dados
CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_funcs (
id BIGINT AUTO_INCREMENT NOT NULL,
nome VARCHAR(255),
telefone INT,
email VARCHAR(255),
endereco VARCHAR(255),
salario DECIMAL(10,2),

PRIMARY KEY(id)
);

INSERT INTO tb_funcs (nome, telefone, email, endereco, salario) 
VALUES ("Antonio",111111111,"email1@teste.com","Rua tal numero 1", 5000);
INSERT INTO tb_funcs (nome, telefone, email, endereco, salario) 
VALUES ("José",222222222,"email2@teste.com","Rua tal numero 2", 1500);
INSERT INTO tb_funcs (nome, telefone, email, endereco, salario) 
VALUES ("Letícia",333333333,"email3@teste.com","Rua tal numero 3", 3000);
INSERT INTO tb_funcs (nome, telefone, email, endereco, salario) 
VALUES ("Camila",444444444,"email4@teste.com","Rua tal numero 4", 9000);
INSERT INTO tb_funcs (nome, telefone, email, endereco, salario) 
VALUES ("Renato",555555555,"email5@teste.com","Rua tal numero 5", 1900);

SELECT nome, salario FROM tb_funcs WHERE salario > 2000; -- selecionando nome e salario dos funcionarios com salario maior que 2000

SELECT nome, salario FROM tb_funcs WHERE salario < 2000; -- selecionando nome e salario dos funcionarios com salario maior que 2000

UPDATE tb_funcs SET salario = 10000 WHERE id = 4; -- atualizando um dado da tabela

SELECT * FROM tb_funcs;


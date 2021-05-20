/*
Atividade 3
Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
informações dos alunos deste registro dessa escola.
Crie uma tabela alunos/a/e e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos alunos/a/e para se trabalhar com o serviço dessa escola.

Popule esta tabela com até 8 dados;
Faça um select que retorne o/as alunos/a/e com a nota maior do que 7.
Faça um select que retorne o/as alunos/a/e com a nota menor do que 7.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/
-- DROP DATABASE db_escola;
-- criação do banco de dados
CREATE DATABASE db_escola;

USE db_escola;

-- criação da tabela
CREATE TABLE tb_alunos(
id BIGINT AUTO_INCREMENT NOT NULL,
nome VARCHAR(255) NOT NULL,
ensino VARCHAR(255) NOT NULL,
reprovacoes INT NULL,
ano_ingress INT NOT NULL,
media DECIMAL(3,2) NULL DEFAULT 0,

PRIMARY KEY (id)
);


-- inserindo 8 valores
INSERT INTO tb_alunos(nome, ensino, reprovacoes, ano_ingress, media) 
VALUES 
("Antonio", "Médio", 0, 2011, 7.5),
("Bianca", "Fundamental", 0, 2013, 8),
("Cleber", "Médio", 2, 2010, 4.9),
("Maria", "Fundamental", 1, 2014, 5.2),
("José", "Fundamental", 0, 2016, 9),
("Igor", "Médio", 3, 2009, 4.2),
("Igor", "Médio", 3, 2009, 4.2),
("Letícia", "Médio", 0, 2013, 9.3),
("Leandra", "Fundamental", 0, 2011, 7.1);

SELECT * FROM tb_alunos WHERE media > 7; -- exibindo aqueles com a nota maior do que 7

SELECT * FROM tb_alunos WHERE media < 7; -- exibindo aqueles com a nota menor do que 7

UPDATE tb_alunos SET reprovacoes = 2, media = 3.9
WHERE id = 4; -- atualizando dados

SELECT * FROM tb_alunos;


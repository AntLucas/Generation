/*
Atividade 2
Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
informações dos produtos deste ecommerce.
Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
Popule esta tabela com até 8 dados;
Faça um select que retorne os produtos com o valor maior do que 500.
Faça um select que retorne os produtos com o valor menor do que 500.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

-- DROP DATABASE db_ecommerce;
-- criação do banco de dados
CREATE DATABASE db_ecommerce;

USE db_ecommerce;

-- criação da tabela
CREATE TABLE tb_produtos(
id BIGINT AUTO_INCREMENT NOT NULL,
nome VARCHAR(255),
tipo VARCHAR(255),
marca VARCHAR(255),
ano_lanc INT,
preco DECIMAL(6,2),

PRIMARY KEY (id)
);

-- inserindo 8 valores
INSERT INTO tb_produtos (nome, tipo, marca, ano_lanc, preco) 
VALUES("Mouse 1", "Mouse", "Marca 1", 2017, 49.50);
INSERT INTO tb_produtos (nome, tipo, marca, ano_lanc, preco) 
VALUES("Mouse 2", "Mouse", "Marca 4", 2021, 297.99);
INSERT INTO tb_produtos (nome, tipo, marca, ano_lanc, preco) 
VALUES("Teclado 1", "Teclado", "Marca 2", 2019, 195.75);
INSERT INTO tb_produtos (nome, tipo, marca, ano_lanc, preco) 
VALUES("Teclado 2", "Teclado", "Marca 1", 2018, 89.90);
INSERT INTO tb_produtos (nome, tipo, marca, ano_lanc, preco) 
VALUES("Headset 1", "Headset", "Marca 4", 2021, 515.80);
INSERT INTO tb_produtos (nome, tipo, marca, ano_lanc, preco) 
VALUES("Headset 2", "Headset", "Marca 3", 2020, 345);
INSERT INTO tb_produtos (nome, tipo, marca, ano_lanc, preco) 
VALUES("Webcam 1", "Webcam", "Marca 3", 2021, 1118.50);
INSERT INTO tb_produtos (nome, tipo, marca, ano_lanc, preco) 
VALUES("Webcam 2", "Webcam", "Marca 2", 2019, 219.99);

SELECT * FROM tb_produtos WHERE preco > 500; -- selecionando todos os produtos com o valor acima de 500

SELECT * FROM tb_produtos WHERE preco <500; -- selecionando todos os produtos com o valor abaixo de 500

UPDATE tb_produtos SET preco = 999.99 
WHERE id = 7; -- atualizando o preço de um produto da tabela

SELECT * FROM tb_produtos;



/*
Atividade 4

Crie um banco de dados para um serviço de um açougue ou uma quitanda, o nome do
banco deverá ter o seguinte nome db_cidade_das_carnes ou db_cidade_das_frutas, onde o
sistema trabalhará com as informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desse açougue.

Crie uma tabela de tb_produto e utilize a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço desse açougue(não esqueça de
criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo os Produtos com valor entre 3 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são aves ou legumes).

Salve as querys para cada uma dos requisitos do exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

-- criação do db
CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

-- criação da tb_categoria
CREATE TABLE tb_categoria(
id_categoria BIGINT AUTO_INCREMENT,
nome_categoria VARCHAR (255) NOT NULL,
estoque BIGINT,

PRIMARY KEY (id_categoria)
);

-- criação da tb_produto
CREATE TABLE tb_produto(
id_produto BIGINT AUTO_INCREMENT,
nome_animal VARCHAR (255) NOT NULL,
nome_corte VARCHAR(255) NOT NULL,
preco decimal(5,2),
id_categoria BIGINT,

FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria),
PRIMARY KEY (id_produto)
);


-- inserindo 5 valores na tb_categoria
INSERT INTO tb_categoria(nome_categoria, estoque)
VALUES
("Mamíferos",80),
("Peixes",60),
("Répteis",10),
("Anfíbios",5),
("Aves",60);

-- inserindo 8 valores na tb_produto
INSERT INTO tb_produto(nome_animal, nome_corte, preco, id_categoria)
VALUES
("Carne 1", "Corte 1", 15, 1),
("Carne 2", "Corte 1", 52, 1),
("Carne 3", "Corte 2", 17.5, 2),
("Carne 4", "Corte 3", 75, 3),
("Carne 5", "Corte 3", 12.5, 3),
("Carne 6", "Corte 4", 48.75, 4),
("Carne 7", "Corte 4", 55, 5),
("Carne 8", "Corte 5", 28.7, 5);

SELECT nome_animal, nome_corte, preco FROM tb_produto
WHERE preco > 50; -- select que retorna os Produtos com o valor com o valor maior do que 50 reais

SELECT nome_animal, nome_corte, preco FROM tb_produto
WHERE preco BETWEEN 3 AND 60;-- select que retorna os Produtos com valor entre 3 e 60 reais

SELECT nome_animal, preco FROM tb_produto
WHERE nome_animal LIKE "%C%";-- buscando os Produtos com a letra C

SELECT * FROM tb_produto
INNER JOIN tb_categoria
ON tb_produto.id_categoria = tb_categoria.id_categoria; -- select com Inner join entre tabela categoria e produto

SELECT * FROM tb_produto
INNER JOIN tb_categoria
ON tb_produto.id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.nome_categoria = "aves"; -- select que retorna todos os Produtos de uma categoria específica (aves)
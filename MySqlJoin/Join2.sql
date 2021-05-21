/*
Atividade 2

Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco
deverá ter o seguinte nome db_pizzaria_legal, onde o sistema trabalhará com as
informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.

siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.

Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de
criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela pizza com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 45 reais.

Faça um select trazendo os Produtos com valor entre 29 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre tabela categoria e pizza.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são pizza doce).
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

-- criação do db
CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

-- criação da tb_categoria
CREATE TABLE tb_categoria(
id_categoria BIGINT AUTO_INCREMENT,
nome_categoria VARCHAR (255) NOT NULL,
tipo VARCHAR(255),

PRIMARY KEY (id_categoria)
);

-- criação da tb_pizza
CREATE TABLE tb_pizza(
id_pizza BIGINT AUTO_INCREMENT,
nome_pizza VARCHAR (255) NOT NULL,
preco decimal(5,2),
tamanho VARCHAR(255) NOT NULL,
borda VARCHAR(255),
id_categoria BIGINT,

FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria),
PRIMARY KEY (id_pizza)
);

-- inserindo 5 valores na tb_categoria
INSERT INTO tb_categoria (nome_categoria, tipo)
VALUES 
("Doce", "Vegana"),
("Doce", "Não vegana"),
("Salgada", "Vegana"),
("Salgada", "Não vegana"),
("Esfirra", "Não vegana");

-- inserindo 8 valores na tb_pizza
INSERT INTO tb_pizza (nome_pizza, preco, tamanho, borda, id_categoria)
VALUES
("Pizza doce vegana 1", 49.90, "Grande", "Recheada", 1),
("Pizza doce vegana 2", 35.50, "Médio", "Recheada", 1),
("Pizza doce", 24.99, "Pequena", "Não recheada", 2),
("Pizza salgada vegana 1", 39.99, "Médio", "Recheada", 3),
("Pizza salgada", 40, "Grande", "Não recheada", 4),
("Pizza salgada 2", 29.90, "Pequena", "Recheada", 4),
("Esfirra de carne", 1.50, "Médio", "Não recheada", 5),
("Esfirra de frango com catupiry", 2.99, "Grande", "Não recheada", 5);

SELECT * FROM tb_pizza
WHERE preco > 45; -- select que retorna os Produtos com o valor maior do que 45 reais

SELECT * FROM tb_pizza
WHERE preco BETWEEN 29 AND 60;-- select que retorna os Produtos com valor entre 29 e 60 reais

SELECT * FROM tb_pizza
WHERE nome_pizza LIKE "%C%"; -- buscando os Produtos com a letra C

SELECT * FROM tb_pizza
INNER JOIN tb_categoria
ON tb_pizza.id_categoria = tb_categoria.id_categoria;-- select com Inner join entre tabela categoria e pizza

SELECT * FROM tb_pizza
INNER JOIN tb_categoria
ON tb_pizza.id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.nome_categoria = "doce"; -- select que retorna todos os Produtos de uma categoria específica (doce)
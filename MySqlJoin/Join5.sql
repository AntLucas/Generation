/*
Atividade 5

Crie um banco de dados para um serviço de uma loja de produtos de construção, o nome
do banco deverá ter o seguinte nome db_construindo_a_nossa_vida, onde o sistema
trabalhará com as informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

Siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce.

Crie uma tabela de tb_produto e utilize a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço de uma loja de produtos (não
esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo os Produtos com valor entre 3 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são da categoria hidráulica).

Salve as querys para cada uma dos requisitos do exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

-- criação do db
CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

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
nome_produto VARCHAR (255) NOT NULL,
preco decimal(5,2),
id_categoria BIGINT,

FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria),
PRIMARY KEY (id_produto)
);


-- inserindo 5 valores na tb_categoria

-- inserindo 8 valores na tb_produto

SELECT nome_produto, preco FROM tb_produto
WHERE preco > 50; -- select que retorna os Produtos com o valor com o valor maior do que 50 reais

SELECT nome_produto, preco FROM tb_produto
WHERE preco BETWEEN 3 AND 60;-- select que retorna os Produtos com valor entre 3 e 60 reais

SELECT nome_produto, preco FROM tb_produto
WHERE nome_produto LIKE "%C%";-- buscando os Produtos com a letra C

SELECT * FROM tb_produto
INNER JOIN tb_categoria
ON tb_produto.id_categoria = tb_categoria.id_categoria; -- select com Inner join entre tabela categoria e produto

SELECT * FROM tb_produto
INNER JOIN tb_categoria
ON tb_produto.id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.nome_categoria = "hidráulica"; -- select que retorna todos os Produtos de uma categoria específica (hidráulica)
/*
Atividade 6

Crie um banco de dados para um serviço de um site de cursos onlines, o nome do banco
deverá ter o seguinte nome db_cursoDaMinhaVida, onde o sistema trabalhará com as
informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_curso e tb_categoria.

siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste site de cursos onlines.

Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço de um site de cursos
onlines(não esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo os Produtos com valor entre 3 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra J.

Faça um um select com Inner join entre tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são da categoria Java).

Salve as querys para cada uma dos requisitos do exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

-- criação do db
CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

-- criação da tb_categoria
CREATE TABLE tb_categoria(
id_categoria BIGINT AUTO_INCREMENT,
nome_categoria VARCHAR (255) NOT NULL,
descricao VARCHAR(255) NOT NULL,
PRIMARY KEY (id_categoria)
);

-- criação da tb_curso
CREATE TABLE tb_curso(
id_curso BIGINT AUTO_INCREMENT,
nome_curso VARCHAR (255) NOT NULL,
preco DECIMAL(5,2),
duracao Decimal(5,2),
id_categoria BIGINT,

FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria),
PRIMARY KEY (id_curso)
);


-- inserindo 5 valores na tb_categoria
INSERT INTO tb_categoria (nome_categoria, descricao)
VALUES
	('Java', 'Curso de java'),
    ('Python', 'Curso de python'),
    ('HTML', 'Curso de HTML'),
    ('JavaScript', 'Curso de JavaScript'),
    ('PHP', 'Curso de PHP');
    
-- inserindo 8 valores na tb_produto
INSERT INTO tb_curso (nome_curso, preco, duracao, id_categoria)
VALUES
	('Curso Java', 80, 10 , 1),
    ('Curso 2', 70, 20, 1),
    ('Curso 3', 50.5, 60, 2),
    ('Curso 4', 77.8, 45, 3),
    ('Curso 5', 52.75, 35, 3),
    ('Curso 6', 45.8, 120, 3),
    ('Curso 7', 30.5, 430, 4),
    ('Curso 8', 55.70, 450, 5);

SELECT nome_curso, preco FROM tb_curso
WHERE preco > 50; -- select que retorna os Produtos com o valor com o valor maior do que 50 reais

SELECT nome_curso, preco FROM tb_curso
WHERE preco BETWEEN 3 AND 60;-- select que retorna os Produtos com valor entre 3 e 60 reais

SELECT nome_curso, preco FROM tb_curso
WHERE nome_curso LIKE "%J%";-- buscando os Produtos com a letra J

SELECT * FROM tb_curso
INNER JOIN tb_categoria
ON tb_curso.id_categoria = tb_categoria.id_categoria; -- select com Inner join entre tabela categoria e curso

SELECT * FROM tb_curso
INNER JOIN tb_categoria
ON tb_curso.id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.nome_categoria = "Java"; -- select que retorna todos os Produtos de uma categoria específica (Java)
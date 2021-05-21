/*
Atividade 1

Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter
o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as
informações dos personagens desse game.

O sistema trabalhará com 2 tabelas tb_personagem e tb_classe.

siga exatamente esse passo a passo:

Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos
relevantes da classe para se trabalhar com o serviço desse game Online.

Crie uma tabela tb_personagem e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online
(não esqueça de criar a foreign key de tb_classe nesta tabela).

Popule esta tabela classe com até 5 dados.

Popule esta tabela personagem com até 8 dados.

Faça um select que retorne os personagens com o poder de ataque maior do que 2000.

Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000.

Faça um select utilizando LIKE buscando os personagens com a letra C.

Faça um um select com Inner join entre tabela classe e personagem.

Faça um select onde traga todos os personagem de uma classe específica (exemplo todos
os personagens que são arqueiros).
salve as querys para cada uma dos requisitos do exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

-- criação do db
CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

-- criação da tb_classe
CREATE TABLE tb_classe(
id_classe BIGINT AUTO_INCREMENT,
nome_classe VARCHAR (255) NOT NULL,
funcao VARCHAR (255) NOT NULL,
armas VARCHAR (255),

PRIMARY KEY (id_classe)
);

-- criação da tb_personagem
CREATE TABLE tb_personagem(
id_personagem BIGINT AUTO_INCREMENT,
nome_personagem VARCHAR (255) NOT NULL,
ataque INT,
defesa INT,
agilidade INT,
magia INT,
id_classe BIGINT,

FOREIGN KEY (id_classe) REFERENCES tb_classe (id_classe),
PRIMARY KEY (id_personagem)
);

-- inserindo 5 valores na tb_classe
INSERT INTO tb_classe (nome_classe, funcao, armas)
VALUES 
("Guerreiro", "Tanque", "Espada e Escudo"),
("Sacerdote", "Curador", "Cajado"),
("Ladino", "DPS", "Adagas"),
("Caçador", "DPS", "Arco"),
("Mago", "DPS", "Cajado");

-- inserindo 8 valores na tb_personagem
INSERT INTO tb_personagem (nome_personagem, ataque, defesa, agilidade, magia, id_classe)
VALUES
("Antonio", 2500, 500, 3000, 50, 4),
("Cleber", 2300, 520, 3200, 70, 3),
("Vanessa", 500, 3000, 50, 30, 1),
("Leanda", 50, 1300, 40, 2100, 2),
("Henrique", 50, 300, 500, 2900, 5),
("Clovis", 2600, 480, 2800, 50, 4),
("Carla", 120, 1400, 30, 30, 1),
("Carlos", 400, 800, 50, 1800, 2);

SELECT * FROM tb_personagem 
WHERE ataque > 2000; -- selecionando todos os personagens com poder de ataque maior que 2000

SELECT * FROM tb_personagem 
WHERE defesa > 1000
AND defesa < 2000; -- selecionando todos os personagens com defesa entre 1000 e 2000

SELECT * FROM tb_personagem 
WHERE nome_personagem
LIKE "%c%"; -- buscando os personagens com a letra C

SELECT * FROM tb_personagem
INNER JOIN tb_classe where tb_personagem.id_classe = tb_classe.id_classe; -- select com Inner join entre tabela classe e personagem

SELECT * FROM tb_personagem 
INNER JOIN tb_classe
on tb_personagem.id_classe = tb_classe.id_classe
AND tb_classe.nome_classe = "Caçador"; -- Faça um select onde traga todos os personagem de uma classe específica (classe caçador)

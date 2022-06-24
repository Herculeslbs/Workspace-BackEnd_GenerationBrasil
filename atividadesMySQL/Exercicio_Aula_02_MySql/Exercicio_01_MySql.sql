/*Crie um banco de dados para um serviço de um Games Online. 
O nome do Banco de dados deverá ter o seguinte nome db_generation_game_online. 
O sistema trabalhará com as informações dos personagens do jogo. 
O sistema trabalhará com 2 tabelas tb_personagens e tb_classes, que deverão estar relacionadas.

Boas Práticas:

Crie a tabela tb_classes e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar os personagens do Game Online.
Crie a tabela tb_personagens e determine 4 atributos, além da Chave Primária, relevantes aos personagens do Game Online.
Não esqueça de criar a Foreign Key da tabela tb_classes na tabela tb_personagens.
Insira 5 registros na tabela tb_classes.
Insira 8 registros na tabela tb_personagens, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_classes.
Faça um SELECT que retorne todes os personagens cujo poder de ataque seja maior do que 2000.
Faça um SELECT que retorne todes os personagens cujo poder de defesa esteja no intervalo 1000 e 2000.
Faça um SELECT utilizando o operador LIKE, buscando todes os personagens que possuam a letra C no atributo nome.
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes.
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes, 
onde traga apenas os personagens que pertençam a uma classe específica (Exemplo: Todes os personagens da classe dos arqueiros).
Salve todas as queries para cada um dos requisitos do exercício em um único script (arquivo .SQL) e coloque no seu Github pessoal, 
no repositório que você criou sobre Banco de dados.**/

-- Banco de dados deverá ter o seguinte nome db_generation_game_online.
create database db_generation_game_online;

use db_generation_game_online;

-- Crie a tabela tb_classes e determine pelo menos 2 atributos
create table tb_classes(
	id bigint auto_increment,
    classe varchar (15),
    especialidade varchar (20),
    
    primary key (id)
);

-- Crie a tabela tb_personagens e determine 4 atributos e criar a Foreign Key da tabela tb_classes
create table tb_personagens(
	id bigint auto_increment,
    nome varchar (15),
    genero varchar (15),
    poder_ataque int (5),
    poder_defesa int (5),
    fk_classe_id bigint,
        
    primary key (id),
    foreign key (fk_classe_id) references tb_classes(id) 
);


-- Insira 5 registros na tabela tb_classes.
insert into tb_classes(classe, especialidade) value ("Medicos", "Cura"); 

-- Insira 8 registros na tabela tb_personagens, preenchendo a Foreign Key
insert into tb_personagens(nome, genero, poder_ataque, poder_defesa, fk_classe_id) value ("Ray", "Feminino", 1600, 6000, 5); 

-- SELECT para retornar todos os dados
select * from tb_personagens;

-- Faça um SELECT que retorne todes os personagens cujo poder de ataque seja maior do que 2000.
select id, nome, poder_ataque, fk_classe_id from tb_personagens WHERE poder_ataque > 2000;

-- Faça um SELECT que retorne todes os personagens cujo poder de defesa esteja no intervalo 1000 e 2000.
select id, nome, poder_defesa, fk_classe_id from tb_personagens where poder_defesa > 1000 and poder_defesa < 2000;

-- Faça um SELECT utilizando o operador LIKE, buscando todes os personagens que possuam a letra C no atributo nome.
select id, nome, poder_defesa, fk_classe_id from tb_personagens where nome like "%C%";

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes.
select tb_personagens.id, nome, poder_ataque, poder_defesa, tb_classes.classe, especialidade from tb_personagens inner join tb_classes
on tb_classes.id = tb_personagens.fk_classe_id;

/*Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes, 
onde traga apenas os personagens que pertençam a uma classe específica (Exemplo: Todes os personagens da classe dos arqueiros).**/
select tb_personagens.id, nome, poder_ataque, poder_defesa, tb_classes.classe, especialidade from tb_personagens inner join tb_classes
on tb_classes.id = tb_personagens.fk_classe_id and tb_classes.classe = "Arquieros";



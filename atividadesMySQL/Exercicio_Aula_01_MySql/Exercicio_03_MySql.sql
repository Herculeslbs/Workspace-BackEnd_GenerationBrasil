/*Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações dos estudantes deste registro dessa escola. 
Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos relevantes dos estudantes
 para se trabalhar com o serviço dessa escola.
Insira nesta tabela no mínimo 8 dados (registros).
Faça um SELECT que retorne todes o/a(s) estudantes com a nota maior do que 7.0.
Faça um SELECT que retorne todes o/a(s) estudantes com a nota menor do que 7.0.
Ao término atualize um registro desta tabela através de uma query de atualização.
Salve todas as queries para cada um dos requisitos do exercício em um único script (arquivo .SQL) e coloque no seu Github pessoal,
 no repositório que você criou sobre Banco de dados.**/

CREATE DATABASE db_escola;


USE db_escola;

CREATE TABLE tb_estudantes(

	id BIGINT auto_increment,
    nome VARCHAR(255),
	serie INT(1),
    turma  VARCHAR(1),
    periodo VARCHAR(255),
    nota DECIMAL(2,1),
    
    PRIMARY KEY (id)
);

INSERT INTO tb_estudantes(nome, serie, turma, periodo, nota)VALUE("Paulo angielloti", 6, "F", "Manhã", 9.0);

SELECT * FROM tb_estudantes;

SELECT * FROM tb_estudantes WHERE nota > 7.0;

SELECT * FROM tb_estudantes WHERE nota < 7.0;
 
UPDATE tb_estudantes
SET nota = "9.5"
WHERE id = 1
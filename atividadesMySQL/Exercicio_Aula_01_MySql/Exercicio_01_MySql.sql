/*Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos colaboradores desta empresa. 
Crie uma tabela de colaboradores e determine 5 atributos relevantes dos colaboradores para se trabalhar com o serviço deste RH.
Insira nesta tabela no mínimo 5 dados (registros).
Faça um SELECT que retorne todes os colaboradores com o salário maior do que 2000.
Faça um SELECT que retorne todes os colaboradores com o salário menor do que 2000.
Ao término atualize um registro desta tabela através de uma query de atualização.
Salve todas as queries para cada um dos requisitos do exercício em um único script (arquivo .SQL) e coloque no seu Github pessoal, 
no repositório que você criou sobre Banco de dados.
**/
-- comentario linha

CREATE DATABASE db_rhgeneration;

-- indica o banco de dados a ser utilizado/manipulado
USE db_rhgeneration;

CREATE TABLE tb_funcionarios(

	id BIGINT auto_increment, -- tambem da pra usar o primary key na mesma linha
    nome VARCHAR(255),
    -- podemos trabalhar com decimal, para dinheiro pois da pra definir
    -- quantidade casas depois da virgula  
    salario DECIMAL(9,2),
    setor VARCHAR(255),
    matricula INT(255),
    
    PRIMARY KEY (id)
);
-- traz todos os dados da tabela de funcionarios
SELECT * FROM tb_funcionarios;

SELECT * FROM tb_funcionarios WHERE salario > 2000;

SELECT * FROM tb_funcionarios WHERE salario < 2000;

-- para fazer uma busca especifica 
SELECT id, nome, setor, matricula, MAX(salario) AS MaiorSalario FROM tb_funcionarios;

-- para inserir info na tabela, deve seguir a ordem de criação da table 
INSERT INTO tb_funcionarios(nome, salario, setor, matricula)VALUE("João", 1600.60, "Tecnologia", 06);

-- para fazer atualização 
UPDATE tb_funcionarios
SET matricula = "04"
WHERE id = 3

-- para deletar 
-- DELETE FROM tb_funcionarios WHERE id = 2;
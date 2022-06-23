/*Crie um banco de dados para um e-commerce, onde o sistema trabalhará com as informações dos produtos deste e-commerce. 
Crie uma tabela de produtos e determine 5 atributos relevantes dos produtos para se trabalhar com o serviço deste e-commerce.
Insira nesta tabela no mínimo 8 dados (registros).
Faça um SELECT que retorne todes os produtos com o valor maior do que 500.
Faça um SELECT que retorne todes os produtos com o valor menor do que 500.
Ao término atualize um registro desta tabela através de uma query de atualização.
Salve todas as queries para cada um dos requisitos do exercício em um único script (arquivo .SQL) e coloque no seu Github pessoal, 
no repositório que você criou sobre Banco de dados.
**/
-- para criar banco de dados
CREATE DATABASE db_ecommerce;

-- indica o banco de dados a ser utilizado/manipulado
USE db_ecommerce;

-- criando tabela
CREATE TABLE tb_produtos(

	id BIGINT auto_increment, -- pode ser usado o primary key na mesma linha
    descrição VARCHAR(255),
	preço DECIMAL(9,2),
    quantidade INT(255),
    categoria VARCHAR(255),
    
    PRIMARY KEY (id)
);

-- para inserir info na tabela, deve seguir a ordem de criação da table 
INSERT INTO tb_produtos(descrição, preço, quantidade, categoria)VALUE("Celular", 1800.30, 2, "Eletroeletronico");

-- traz todos os dados da tabela de funcionarios
SELECT * FROM tb_produtos;


SELECT * FROM tb_produtos WHERE preço > 500;

SELECT * FROM tb_produtos WHERE preço < 500;

-- para fazer atualização 
UPDATE tb_produtos
SET quantidade = "04"
WHERE id = 1
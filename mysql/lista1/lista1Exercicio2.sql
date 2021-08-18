-- criação do banco de dados da loja
create database db_ecommerce;

-- criação da tabela com os produtos e seus atributos
use db_ecommerce;
create table tb_produtos (
	id bigInt (10) auto_increment,
    nome varchar (50) not null,
    marca varchar (50) not null,
    cor varchar (15) not null,
    anoFabricacao int (4) not null,
    localFabricacao varchar (20) not null,
    
    primary key (id)
);


-- acrescentando mais uma coluna na tabela
alter table tb_produtos add preco decimal(10,2); 

-- inserção de valores
insert into tb_produtos (nome, marca, cor, anoFabricacao, localFabricacao, preco) values ("tenis", "Nike","azul",2019,"Vietnã",499.99);
insert into tb_produtos (nome, marca, cor, anoFabricacao, localFabricacao, preco) values ("camisa", "Polo","preta",2018,"China",69.99);
insert into tb_produtos (nome, marca, cor, anoFabricacao, localFabricacao, preco) values ("tenis", "Adidas","preto",2017,"China",289.99);
insert into tb_produtos (nome, marca, cor, anoFabricacao, localFabricacao, preco) values ("bermuda", "Calvin Klein","cinza",2016,"China",399.99);
insert into tb_produtos (nome, marca, cor, anoFabricacao, localFabricacao, preco) values ("tenis", "Nike","vermelho",2019,"Vietnã",799.99);
insert into tb_produtos (nome, marca, cor, anoFabricacao, localFabricacao, preco) values ("caneta", "Bic","azul",2019,"Brasil",1.99);
insert into tb_produtos (nome, marca, cor, anoFabricacao, localFabricacao, preco) values ("smartphone", "Xiaomi","cinza",2015,"China",2999.90);
insert into tb_produtos (nome, marca, cor, anoFabricacao, localFabricacao, preco) values ("notebook", "Samsung","rosa",2018,"Coreia do Sul", 2599.90);

-- mostrar todos os produtos com preço acima de 500
select * from tb_produtos where preco > 500;

-- mostrar todos os produtos com preço abaixo de 500
select * from tb_produtos where preco < 500;

-- atualizando o preço do produto com o identificador 8
update tb_produtos set preco = 2499.90 where id = 8; 

-- mostrando a tabela atualizada
select * from tb_produtos;
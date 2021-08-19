-- criação do banco de dados
create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria  (
	id_categoria int(5) auto_increment,
    tipo varchar (30) not null,
    cor varchar (30) not null,
    validade boolean,
    
    primary key (id_categoria)
);

create table tb_produto (
	id_produto int(5) auto_increment,
    nome varchar (30) not null,
    preco decimal (4,2) not null,
    estoque boolean not null,
    estado varchar (30) not null,
    id_categoria int (5),
    
    primary key (id_produto),
    foreign key (id_categoria) references tb_categoria (id_categoria)
);

-- inserção de dados
insert into tb_categoria (tipo, cor, validade) values 
("fruta","vermelha",true),
("legume","verde",true),
("tubérculo","amarela",true),
("raíz","vermelha",false),
("verdura","verde",true);

insert into tb_produto (nome, preco, estoque, estado, id_categoria) values 
("pimentão ",10.00,true,"maduro",2),
("cenoura",15.00,true,"verde",4),
("alface",25.00,false,"verde",5),
("batata ",15.00,false,"maduro",3),
("cereja",45.00,false,"verde",1),
("morango",65.00,true,"maduro",1),
("abobrinha",5.00,false,"verde",2),
("maçã",30.00,true,"verde",1),
("mandioca",10.00,false,"maduro",4);

-- mostrando dados
select * from tb_produto where preco > 50;

select * from tb_produto where preco > 3 and preco < 60;

select * from tb_produto where nome like "c%";

-- mostrando com join
select * from tb_categoria
inner join tb_produto on tb_produto.id_categoria = tb_categoria.id_categoria;

select * from tb_produto where id_categoria = 5;

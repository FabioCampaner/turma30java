-- criação do banco de dados
create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria (
	id int(5) auto_increment,
    tipo varchar (30) not null,
    tamanho char (1) not null check (tipo ('P','M','G')) ,
    para_viagem boolean not null,
    
    primary key (id)
);

create table tb_pizza (
	id_pizza int(5) auto_increment,
    nome varchar (30) not null,
    preco decimal (4,2) not null,
    pimenta boolean not null,
    oregano boolean not null,
    id_categoria int (5),
    
    primary key (id_pizza),
    foreign key (id_categoria) references tb_categoria (id)
);

-- inserção de dados
insert into tb_categoria (tipo, tamanho, para_viagem) values 
("Doce","P",false),
("Vegana","M",false),
("Portuguesa","G",true),
("Quatro Queijos","P",false),
("Mussarela","M",false);

insert into tb_pizza (nome, preco, pimenta, oregano, id_categoria) values 
("Pizza da casa",60.00,false,true,4),
("Antiga",55.00,true,true,3),
("Natural",70.00,false,true,2),
("Pizza da casa",60.00,false,true,4),
("Pizza da casa",60.00,false,true,4),
("Suculenta",55.00,true,true,2),
("Ratoeira",45.00,false,true,4),
("Matadora",40.00,true,false,5),
("Chocopizza",30.00,false,false,1);

-- atualização de dados
update tb_pizza set nome = "Puro Sabor" where id_pizza = 4;
update tb_pizza set nome = "Selvagem" where id_pizza = 5;

-- mostrando dados
select * from tb_pizza where preco > 45;

select * from tb_pizza where preco > 29 and preco < 60;

select * from tb_pizza where nome like "c%";

-- mostrando com join
select * from tb_categoria
inner join tb_pizza on tb_pizza.id_categoria = tb_categoria.id;

select * from tb_pizza where id_categoria = 4;


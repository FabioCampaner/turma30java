-- criação do banco de dados
create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria  (
	id_categoria int(5) auto_increment,
    tipo varchar (30) not null,
    tarja char (1) not null check (tipo ('P','V','A')) ,
    prescricao boolean,
    
    primary key (id_categoria)
);

create table tb_produto (
	id_produto int(5) auto_increment,
    nome varchar (30) not null,
    preco decimal (4,2) not null,
    estoque boolean not null,
    uso varchar (30) not null,
    id_categoria int (5),
    
    primary key (id_produto),
    foreign key (id_categoria) references tb_categoria (id_categoria)
);

-- inserção de dados
insert into tb_categoria (tipo, tarja, prescricao) values 
("Xarope","A",false),
("Vacina","A",false),
("Antibiótico","P",true),
("Pomada","A",false),
("Colírio","A",true);

insert into tb_produto (nome, preco, estoque, uso, id_categoria) values 
("Bromexina ",70.00,false,"oral",1),
("Ampicilina",45.00,true,"oral",3),
("Hylo",75.00,false,"ocular",5),
("Lacrifilm ",35.00,false,"ocular",5),
("Isoconazol",45.00,false,"epitelial",4),
("Gelol",55.00,true,"epitelial",4),
("Coronavac",42.00,false,"subcutânea",2),
("Maleato",75.00,true,"ocular",5),
("Guaifenesina",60.00,false,"oral",1);

-- mostrando dados
select * from tb_produto where preco > 50;

select * from tb_produto where preco > 3 and preco < 60;

select * from tb_produto where nome like "b%";

-- mostrando com join
select * from tb_categoria
inner join tb_produto on tb_produto.id_categoria = tb_categoria.id_categoria;

select * from tb_produto where id_categoria = 5;


-- criação do banco de dados
create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria  (
	id_categoria int(5) auto_increment,
    tipo varchar (30) not null,
    cor varchar (30) not null,
    entrega boolean,
    
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
insert into tb_categoria (tipo, cor, entrega) values 
("ferramenta","azul ou preta",true),
("matéria-prima","cinza",false),
("utensílios","todas as cores",true),
("hidráulica","branca",false),
("elétrica","todas as cores",true);

insert into tb_produto (nome, preco, estoque, uso, id_categoria) values 
("cano",15.00,true,"interno",4),
("escada",75.00,true,"interno ou externo",3),
("fio",24.90,false,"interno",5),
("martelo",30.00,false,"interno ou externo",1),
("balde",10.00,false,"interno ou externo",3),
("chave de fenda",25.00,true,"interno ou externo",1),
("cimento",50.00,false,"externo",2),
("chave inglesa",30.00,true,"interno ou externo",1),
("banco",45.00,false,"interno ou externo",3);

-- mostrando dados
select * from tb_produto where preco > 50;

select * from tb_produto where preco > 3 and preco < 60;

select * from tb_produto where nome like "c%";

-- mostrando com join
select * from tb_categoria
inner join tb_produto on tb_produto.id_categoria = tb_categoria.id_categoria;

select * from tb_produto where id_categoria = 5;
-- criação do banco de dados
create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria  (
	id_categoria int(5) auto_increment,
    tipo varchar (30) not null,
    duracao varchar (30) not null,
    ead boolean,
    
    primary key (id_categoria)
);

create table tb_curso  (
	id_curso int(5) auto_increment,
    distribuicao varchar (30) not null,
    preco decimal (4,2) not null,
    disponivel boolean not null,
    nivel varchar (30) not null,
    id_categoria int (5),
    
    primary key (id_curso),
    foreign key (id_categoria) references tb_categoria (id_categoria)
);

-- inserção de dados
insert into tb_categoria (tipo, duracao, ead) values 
("Java","3 meses",false),
("Python","1 semestre",false),
("C#","1 ano",true),
("Javascript","1 semestre",true),
("PHP","3 meses",true);

insert into tb_curso  (distribuicao, preco, disponivel, nivel, id_categoria) values 
("IBM",20.00,true,"senior",3),
("Generation",00.00,true,"junior",1),
("Microsoft",30.00,true,"pleno",5),
("Oracle",20.00,false,"junior",2),
("Facebook",00.00,false,"pleno",3),
("Amazon",30.00,true,"senior",1),
("Google",20.00,true,"pleno",2),
("Bradesco",00.00,true,"junior",4),
("Harvard",00.00,false,"pleno",5);

-- mostrando dados
select * from tb_curso  where preco > 50;

select * from tb_curso  where preco > 3 and preco < 60;

select * from tb_curso  where nome like "j%";

-- mostrando com join
select * from tb_categoria
inner join tb_curso  on tb_curso .id_categoria = tb_categoria.id_categoria;

select * from tb_curso where id_categoria = 1;
-- criação do banco de dados
create database db_generation_game_online;

use db_generation_game_online;

-- criação da tabela classe
create table tb_classe (
	id int(10) auto_increment,
	nome_classe varchar(20),
	nivel tinyint(3),
	xp int(5),

	primary key(id) 

) engine = InnoDB;

desc tb_classe;

-- como esqueci de aplicar o not null, aqui está uma alteração das colunas
alter table tb_classe 
modify nome_classe varchar(20) not null, 
modify nivel tinyint(3) not null, 
modify xp int (5) not null;

-- criação da tabela de personagens
create table tb_personagem (
	id int(10),
    nome_personagem varchar (30),
    defesa int (6),
    ataque int (6),
    vida int (10),
    equipamentos varchar (100),
    id_classe int(10),
    
    primary key (id),
    foreign key (id_classe) references tb_classe(id) 

) engine = InnoDB;

-- alterações na tabela personagem
alter table tb_personagem
modify id int (10) auto_increment, 
modify nome_personagem varchar (30) not null, 
modify defesa int (6) not null, 
modify ataque int (6) not null, 
modify vida int (10) not null, 
modify equipamentos varchar (100) not null;

desc tb_personagem;
-- inserção de dados nas tabelas
insert into tb_classe (nome_classe,nivel,xp) values 
("arqueiro",30,1678),
("bárbaro",45,1920),
("mago",18,1390),
("bruxo",10,1133),
("paladino",20,1183);

insert into tb_personagem (nome_personagem,defesa,ataque,vida,equipamentos,id_classe) values
("Smith",200,300,1500,"martelo de forja",2),
("Scar",100,500,1200,"machado de fogo",2),
("Cassandra",500,100,1300,"escudo divino",5),
("Torin",100,200,1500,"massa",2),
("Legolas",300,500,900,"conjunto de flechas",1),
("Draco",300,400,700,"cajado",3),
("Carissius",900,50,200,"capa de proteção",4),
("Nosk",300,600,950,"facas",2);

update tb_personagem set defesa = 1700 where id = 8;

-- mostrando os dados
select * from tb_personagem where ataque > 2000;

select * from tb_personagem where defesa < 2000 and defesa > 1000;

select * from tb_personagem where nome_personagem like "c%";

select * from tb_classe 
inner join tb_personagem on tb_classe.id = tb_personagem.id_classe where tb_classe.id = 2;
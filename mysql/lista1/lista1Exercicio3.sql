-- criação do banco de dados da escola
create database db_escola;

-- tabela de estudantes
use db_escola;
create table tb_estudantes (
	 id bigint(10) auto_increment,
	 nomeCompleto varchar(50),
	 idade int(3),
	 classe varchar (10),
	 nota decimal (5,2),
     aprovacao boolean,
	 
	 primary key (id)
);

-- inserção de dados na tabela de estudantes
insert into tb_estudantes (nomeCompleto,idade,classe,nota,aprovacao) values ("Carolina Oliveira",14,"1ª Turma C",7.50,true);
insert into tb_estudantes (nomeCompleto,idade,classe,nota,aprovacao) values ("Eric Smith",15,"1ª Turma D",6.40,true);
insert into tb_estudantes (nomeCompleto,idade,classe,nota,aprovacao) values ("Ana Pereira",17,"2ª Turma B",5.50,false);
insert into tb_estudantes (nomeCompleto,idade,classe,nota,aprovacao) values ("Marcelo Palmas",17,"2ª Turma C",8.90,true);
insert into tb_estudantes (nomeCompleto,idade,classe,nota,aprovacao) values ("Luis Silva",14,"1ª Turma C",3.50,false);
insert into tb_estudantes (nomeCompleto,idade,classe,nota,aprovacao) values ("Joaquina Souza",15,"1ª Turma A",9.50,true);
insert into tb_estudantes (nomeCompleto,idade,classe,nota,aprovacao) values ("Marilia Santiago",18,"3ª Turma D",8.00,true);
insert into tb_estudantes (nomeCompleto,idade,classe,nota,aprovacao) values ("Leticia Coelho",16,"2ª Turma B",10.00,true);

-- mostrar estudantes com nota superior a 7
select * from tb_estudantes where nota > 7;

-- mostrar estudantes com nota inferior a 7
select * from tb_estudantes where nota < 7;

-- atualização da nota da aluna Ana Pereira
update tb_estudantes set nota = 6.00, aprovacao = true where id = 3;

-- mostrar a tabela atualizada
select * from tb_estudantes;
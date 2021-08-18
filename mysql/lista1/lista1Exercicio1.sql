-- criação do banco de dados do Rh
create database db_RH;

-- criação da tabela de funcionaries
use db_RH;
create table tb_funcionaries (
	id bigint(5) auto_increment,
	nome varchar(30) not null,
	idade int(3) not null,
	salario decimal (10,2) not null,
	funcao varchar(30) not null,
	cpf int(11) not null,
    
    primary key (id)
);

-- inserção de dados
INSERT INTO tb_funcionaries (nome,idade,salario,funcao,cpf) values ("Jonas",19,3000.00,"Desenvolvedor Java Junior",34556778);
INSERT INTO tb_funcionaries (nome,idade,salario,funcao,cpf) values ("Ivete",28,6000.00,"Desenvolvedora Java Pleno",25547581);
INSERT INTO tb_funcionaries (nome,idade,salario,funcao,cpf) values ("Maria",26,11000.00,"Desenvolvedora Java Sênior",45598009);
INSERT INTO tb_funcionaries (nome,idade,salario,funcao,cpf) values ("Thiago",35,3000.00,"Desenvolvedor Java Junior",44526902);
INSERT INTO tb_funcionaries (nome,idade,salario,funcao,cpf) values ("Mike",22,6000.00,"Desenvolvedor Java Pleno",11168908);

-- como inseri duas vezes o mesmo funcionário, deletarei:
delete from tb_funcionaries where id = 1;

-- mostrando apenas funcionaries com salário acima de 2000
select * from tb_funcionaries where salario > 2000;

-- mostrando apenas funcionaries com salário abaixo de 2000
select * from tb_funcionaries where salario < 2000;

-- atualizando a função e salário do funcionário Thiago
update tb_funcionaries set salario = 6000, funcao ="Desenvolvedor Java Pleno" 
where id = 5;

-- mostrando todos os funcionários novamente, com a atualização feita
select * from tb_funcionaries;
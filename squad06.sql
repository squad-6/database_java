create database squad06;
use squad06;
create table doacao(
id_doacao integer not null auto_increment,
id_parceiroFK integer,
id_escolaFK integer,
primary key (id_doacao)
);

create table escola(
id_escola integer not null auto_increment,
nome_escola varchar (100),
estado_escola varchar (50),
cidade_escola varchar (50),
telefone_escola varchar (50),
cep_escola varchar (50),
numero_escola varchar (50),
email_escola varchar (50),
senha_escola varchar (20),
id_doacaoFK integer,
primary key (id_escola)
);

create table parceiro(
id_parceiro integer not null auto_increment,
nome_parceiro varchar (100),
estado_parceiro varchar (50),
cidade_parceiro varchar (50),
email_parceiro varchar (50),
senha_parceiro varchar (20),
ramo_atividade_parceiro varchar (50),
item_parceiro varchar (50),
id_item_parceiro integer,
id_doacaoFK integer,
primary key (id_parceiro)
);

create table questionario(
id_questionario integer not null auto_increment,
id_escolaFK integer,
pergunta1 varchar (250),
pergunta2 varchar (250),
pergunta3 varchar (250),
pergunta4 varchar (250),
id_itens_gerados integer,
data_questionario date,
primary key (id_questionario)
);

alter table escola
add foreign key (id_doacaoFK)
references doacao (id_doacao);

alter table doacao
add foreign key (id_parceiroFK)
references parceiro (id_parceiro);

alter table doacao
add foreign key (id_escolaFK)
references escola (id_escola);

alter table parceiro
add foreign key (id_doacaoFK)
references doacao (id_doacao);

alter table questionario
add foreign key (id_escolaFK)
references escola (id_escola);

use squad06;

alter table doacao
add column item_doacao varchar (50) after id_doacao;

use squad06;
select*from escola;

alter table escola
rename column tel_esccola to tel_escola;

select*from doacao;
select*from parceiro;





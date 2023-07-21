create database booksDB;
use booksDB;

create table tbl_books(
b_code		VARCHAR(6)		NOT NULL	PRIMARY KEY ,
b_name		VARCHAR(125)	NOT NULL,		
b_auther	VARCHAR(125)	NOT NULL,		
b_comp		VARCHAR(125),			
b_year		INT				NOT NULL,		
b_iprice	INT	,		
b_rprice	INT				NOT NULL		
);
create table tbl_users(
u_code	VARCHAR(6)		NOT NULL	PRIMARY KEY	,
u_name	VARCHAR(125)	NOT NULL,		
u_tel	VARCHAR(125),			
u_addr	VARCHAR(125)			
);
create table tbl_rent_book(
r_seq	VARCHAR(15)		NOT NULL	PRIMARY KEY,
r_date	VARCHAR(255)	NOT NULL,	
r_edate	VARCHAR(20)		NOT NULL,	
r_bcode	VARCHAR(20)		NOT NULL,	
r_ucode	VARCHAR(15)	,	
r_nyes	VARCHAR(15)	,	
r_point		INT	
);

show tables;

insert into tbl_books(
b_code,b_name,b_auther,b_comp,b_year,b_iprice,b_rprice
) 
value(
'B0001','토지','박경리','민음사',2022,16000,5000
);
select  *from tbl_books;
insert into tbl_users(
u_code,u_name,u_tel,u_addr
)
value(
'U0001','변희선','010-8080-9887','광주광역시'
);
select* from tbl_users;

insert into tbl_rent_book(
r_seq,r_date,r_edate,r_bcode,r_ucode,r_nyes,r_point
)
value(
'1234','2023-07-21','2023-07-28','B0001','U0001','n',1
);
select*from tbl_rent_book;
select r_bcode ,b_code
from tbl_rent_book
left join tbl_books
on r_bcode = b_code;

alter table tbl_rent_book
add foreign key F_BOOKS(r_bcode)
references tbl_books(b_code);

alter table tbl_rent_book
add foreign key F_USER(r_ucode)
references tbl_users(u_code);

update tbl_users
set u_tel= '010-1111-5555',
u_name =' 희선'
where u_code ='U0001';

update tbl_books
set b_name='',
b_auther='',
b_comp='',
b_year='',
b_iprice='',
b_rprice=''
where u_code = '0001'
-- mycar root화면
create database mycarDB;
use mycarDB;
create table tbl_carmanager(
c_seq		bigint			PRIMARY KEY	AUTO_INCREMENT,
c_carnum	varchar(15)		NOT NULL	,	
c_qty		varchar(10)		NOT NULL	,	
c_username	varchar(20)		NOT NULL	,	
c_sdate		varchar(10)		NOT NULL	,	
c_stime		varchar(10)		NOT NULL	,	
c_goal		varchar(30)	,		
c_edate		varchar(10)	,		
c_etime		varchar(20)	,		
c_skm		int	,		
c_ekm		int	,		
c_cost		int			


);
insert into tbl_carmanager(
c_carnum,c_qty,c_username,c_sdate,c_stime,c_skm,c_ekm
)values
('001','출근','hee462','2023-07-01','07:00',3000,3010);
insert into tbl_carmanager(
c_carnum,c_qty,c_username,c_sdate,c_stime,c_skm,c_ekm
)values
('001','퇴근','hee462','2023-07-01','18:00',3010,3020);

insert into tbl_carmanager(
c_carnum,c_qty,c_username,c_sdate,c_stime,c_skm,c_ekm
)values
('002','서울출장','hee462','2023-07-01','07:00',10000,10300);
insert into tbl_carmanager(
c_carnum,c_qty,c_username,c_sdate,c_stime,c_skm,c_ekm
)values
('002','출장복귀','hee462','2023-07-01','18:00',10300,10600);

select *from tbl_carmanager
order by c_sdate desc, c_stime desc;
commit;

select *from tbl_carmanager
where c_carnum ='001'
order by c_sdate desc, c_stime desc
limit 1;

select *from tbl_carmanager;

create table tbl_users(
username	VARCHAR(15)		PRIMARY KEY,
password	VARCHAR(255)	NOT NULL,	
u_name		VARCHAR(20)		NOT NULL,	
u_nickname	VARCHAR(20)	,	
u_tel		VARCHAR(15)	,	
u_roll		VARCHAR(15)		NOT NULL	
);
drop table tbl_carmanager;

show tables;

drop table tbl_users;

insert into tbl_users(username, password, u_name,u_nickname,u_tel,u_roll)
values('hee462','12341234','변희선','희선','010-8080-9887','ADMIN');


select * from tbl_users;






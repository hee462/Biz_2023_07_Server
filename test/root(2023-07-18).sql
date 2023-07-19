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
--30 Dec Learning clustered index and creating schema 

CREATE DATABASE dbPractice;
use dbPractice;
create schema mypractice;  --By default dbo is the schema for default table
create table mypractice.Employee(id int,fname varchar(50),Lname varchar(50))
insert into mypractice.Employee values (1,'nishant','arora');
insert into mypractice.employee values (2,'manan','arora')

Alter table mypractice.EMPLOYEE add primary key (id)--FOR THIS, COLUMN SHOULD BE NON NULLABLE OTHERWISE IT 
													--WOULD THROW ERROR,ALSE NO DUPLICATE SHOULD EXIST
Alter table mypractice.EMPLOYEE alter column id INT NOT NULL

select * from mypractice.Employee where id=1;  --IT would search on default created index on primary key

--logic to insert 1000  records in total
DECLARE @COUNT INT
SET @COUNT=3
WHILE @COUNT<=1000
BEGIN
insert into mypractice.Employee values (@COUNT,'nishant','arora');
SET @COUNT=@COUNT+1
END

--dropping column
Alter table mypractice.EMPLOYEE drop column fname
select * from mypractice.Employee;
Alter table mypractice.EMPLOYEE drop column id --it will be failed because index depends on it
Alter table mypractice.EMPLOYEE drop CONSTRAINT  PK__Employee__3213E83F63C47FBE --FIRST DELETE CONSTRAINT
Alter table mypractice.EMPLOYEE drop column id --IT WILL WORK NOW :)


DELETE FROM mypractice.EMPLOYEE 
drop table mypractice.EMPLOYEE



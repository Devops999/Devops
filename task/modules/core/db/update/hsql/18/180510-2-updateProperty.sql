alter table TASK_PROPERTY add column AGE varchar(255) ^
update TASK_PROPERTY set AGE = '' where AGE is null ;
alter table TASK_PROPERTY alter column AGE set not null ;

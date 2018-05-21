alter table TASK_PROPERTY alter column AGE rename to AGE__U18663 ;
alter table TASK_PROPERTY alter column AGE__U18663 set null ;
alter table TASK_PROPERTY alter column TYPE_ rename to TYPE___U94177 ;
alter table TASK_PROPERTY alter column TYPE___U94177 set null ;
alter table TASK_PROPERTY add column CITY varchar(255) ;
alter table TASK_PROPERTY add column LOCALITY varchar(255) ;
alter table TASK_PROPERTY add column UNITS integer ^
update TASK_PROPERTY set UNITS = 10 where UNITS is null ;
alter table TASK_PROPERTY alter column UNITS set not null ;
alter table TASK_PROPERTY add column AREA_SQ_FT integer ;
alter table TASK_PROPERTY add column AGE_OF_CONSTRUCTION integer ;
alter table TASK_PROPERTY add column PRICE integer ^
update TASK_PROPERTY set PRICE = 0 where PRICE is null ;
alter table TASK_PROPERTY alter column PRICE set not null ;
alter table TASK_PROPERTY add column SELLER_ID varchar(36) ;
alter table TASK_PROPERTY add column ENQUIRY longvarchar ;
alter table TASK_PROPERTY add column TYPE_ integer ^
update TASK_PROPERTY set TYPE_ = 10 where TYPE_ is null ;
alter table TASK_PROPERTY alter column TYPE_ set not null ;

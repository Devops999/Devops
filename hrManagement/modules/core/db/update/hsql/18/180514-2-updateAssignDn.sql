-- alter table HRMANAGEMENT_ASSIGN_DN add column CODE_ID varchar(36) ^
-- update HRMANAGEMENT_ASSIGN_DN set CODE_ID = <default_value> ;
-- alter table HRMANAGEMENT_ASSIGN_DN alter column CODE_ID set not null ;
alter table HRMANAGEMENT_ASSIGN_DN add column CODE_ID varchar(36) not null ;

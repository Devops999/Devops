alter table HRMANAGEMENT_SALARY_DETAILS alter column ESTABLISHMENT_CODE rename to ESTABLISHMENT_CODE__U82292 ;
alter table HRMANAGEMENT_SALARY_DETAILS alter column ESTABLISHMENT_CODE__U82292 set null ;
-- alter table HRMANAGEMENT_SALARY_DETAILS add column CODE_ID varchar(36) ^
-- update HRMANAGEMENT_SALARY_DETAILS set CODE_ID = <default_value> ;
-- alter table HRMANAGEMENT_SALARY_DETAILS alter column CODE_ID set not null ;
alter table HRMANAGEMENT_SALARY_DETAILS add column CODE_ID varchar(36) not null ;

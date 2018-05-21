alter table EMS_BANK add column FROM_DATE date ^
update EMS_BANK set FROM_DATE = current_date where FROM_DATE is null ;
alter table EMS_BANK alter column FROM_DATE set not null ;
alter table EMS_BANK add column TO_DATE integer ^
update EMS_BANK set TO_DATE = 0 where TO_DATE is null ;
alter table EMS_BANK alter column TO_DATE set not null ;
alter table EMS_BANK add column BANK_CODE varchar(255) ^
update EMS_BANK set BANK_CODE = '' where BANK_CODE is null ;
alter table EMS_BANK alter column BANK_CODE set not null ;
alter table EMS_BANK add column BANK_SWITCH_CODE varchar(255) ^
update EMS_BANK set BANK_SWITCH_CODE = '' where BANK_SWITCH_CODE is null ;
alter table EMS_BANK alter column BANK_SWITCH_CODE set not null ;
alter table EMS_BANK add column BANK_NAME varchar(255) ^
update EMS_BANK set BANK_NAME = '' where BANK_NAME is null ;
alter table EMS_BANK alter column BANK_NAME set not null ;
alter table EMS_BANK add column BRANCH_NAME varchar(255) ^
update EMS_BANK set BRANCH_NAME = '' where BRANCH_NAME is null ;
alter table EMS_BANK alter column BRANCH_NAME set not null ;
alter table EMS_BANK add column ACCOUNT_TYPE integer ^
update EMS_BANK set ACCOUNT_TYPE = 10 where ACCOUNT_TYPE is null ;
alter table EMS_BANK alter column ACCOUNT_TYPE set not null ;
alter table EMS_BANK add column ACCOUNT_NO varchar(255) ^
update EMS_BANK set ACCOUNT_NO = '' where ACCOUNT_NO is null ;
alter table EMS_BANK alter column ACCOUNT_NO set not null ;
alter table EMS_BANK add column EMPLOYEE_ID varchar(36) ;

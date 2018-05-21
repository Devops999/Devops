alter table EMS_EMPLOYEE add column MANAGER_ID varchar(36) ;
alter table EMS_EMPLOYEE add column USER_ID varchar(36) ;
alter table EMS_EMPLOYEE add column START_DATE date ^
update EMS_EMPLOYEE set START_DATE = current_date where START_DATE is null ;
alter table EMS_EMPLOYEE alter column START_DATE set not null ;
alter table EMS_EMPLOYEE add column TERMINATION_DATE date ^
update EMS_EMPLOYEE set TERMINATION_DATE = current_date where TERMINATION_DATE is null ;
alter table EMS_EMPLOYEE alter column TERMINATION_DATE set not null ;
alter table EMS_EMPLOYEE add column RESIGNATION_DATE varchar(255) ^
update EMS_EMPLOYEE set RESIGNATION_DATE = '' where RESIGNATION_DATE is null ;
alter table EMS_EMPLOYEE alter column RESIGNATION_DATE set not null ;
alter table EMS_EMPLOYEE add column ANNUAL_SALARY decimal(19, 2) ^
update EMS_EMPLOYEE set ANNUAL_SALARY = 0 where ANNUAL_SALARY is null ;
alter table EMS_EMPLOYEE alter column ANNUAL_SALARY set not null ;

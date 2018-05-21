alter table EMS_EMPLOYEE alter column RESIGNATION_DATE rename to RESIGNATION_DATE__U08807 ;
alter table EMS_EMPLOYEE alter column RESIGNATION_DATE__U08807 set null ;
alter table EMS_EMPLOYEE add column RESIGNATION_DATE date ^
update EMS_EMPLOYEE set RESIGNATION_DATE = current_date where RESIGNATION_DATE is null ;
alter table EMS_EMPLOYEE alter column RESIGNATION_DATE set not null ;

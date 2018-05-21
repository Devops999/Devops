alter table EMS_COUNTRY add column COUNTRY_CODE varchar(255) ^
update EMS_COUNTRY set COUNTRY_CODE = '' where COUNTRY_CODE is null ;
alter table EMS_COUNTRY alter column COUNTRY_CODE set not null ;
alter table EMS_COUNTRY add column COUNTRY_NAME varchar(255) ^
update EMS_COUNTRY set COUNTRY_NAME = '' where COUNTRY_NAME is null ;
alter table EMS_COUNTRY alter column COUNTRY_NAME set not null ;

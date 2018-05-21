alter table EMS_CITY add column CITY_CODE varchar(255) ^
update EMS_CITY set CITY_CODE = '' where CITY_CODE is null ;
alter table EMS_CITY alter column CITY_CODE set not null ;
alter table EMS_CITY add column CITY_NAME varchar(255) ^
update EMS_CITY set CITY_NAME = '' where CITY_NAME is null ;
alter table EMS_CITY alter column CITY_NAME set not null ;
-- alter table EMS_CITY add column STATE_ID varchar(36) ^
-- update EMS_CITY set STATE_ID = <default_value> ;
-- alter table EMS_CITY alter column STATE_ID set not null ;
alter table EMS_CITY add column STATE_ID varchar(36) not null ;

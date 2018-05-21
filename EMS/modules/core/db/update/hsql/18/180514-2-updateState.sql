alter table EMS_STATE add column STATE_CODE varchar(255) ^
update EMS_STATE set STATE_CODE = '' where STATE_CODE is null ;
alter table EMS_STATE alter column STATE_CODE set not null ;
alter table EMS_STATE add column STATE_NAME varchar(255) ^
update EMS_STATE set STATE_NAME = '' where STATE_NAME is null ;
alter table EMS_STATE alter column STATE_NAME set not null ;
-- alter table EMS_STATE add column COUNTRY_ID varchar(36) ^
-- update EMS_STATE set COUNTRY_ID = <default_value> ;
-- alter table EMS_STATE alter column COUNTRY_ID set not null ;
alter table EMS_STATE add column COUNTRY_ID varchar(36) not null ;

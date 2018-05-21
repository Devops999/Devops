-- alter table EMS_ADDRESS add column CITY_ID varchar(36) ^
-- update EMS_ADDRESS set CITY_ID = <default_value> ;
-- alter table EMS_ADDRESS alter column CITY_ID set not null ;
alter table EMS_ADDRESS add column CITY_ID varchar(36) not null ;
-- alter table EMS_ADDRESS add column STATE_ID varchar(36) ^
-- update EMS_ADDRESS set STATE_ID = <default_value> ;
-- alter table EMS_ADDRESS alter column STATE_ID set not null ;
alter table EMS_ADDRESS add column STATE_ID varchar(36) not null ;
-- alter table EMS_ADDRESS add column ZIP_CODE_ID varchar(36) ^
-- update EMS_ADDRESS set ZIP_CODE_ID = <default_value> ;
-- alter table EMS_ADDRESS alter column ZIP_CODE_ID set not null ;
alter table EMS_ADDRESS add column ZIP_CODE_ID varchar(36) not null ;
alter table EMS_ADDRESS add column CONTACT_ID varchar(36) ;

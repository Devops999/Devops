alter table EMS_CONTACT add column CONTACT_FIRST_NAME varchar(255) ^
update EMS_CONTACT set CONTACT_FIRST_NAME = '' where CONTACT_FIRST_NAME is null ;
alter table EMS_CONTACT alter column CONTACT_FIRST_NAME set not null ;
alter table EMS_CONTACT add column CONTACT_LAST_NAME varchar(255) ^
update EMS_CONTACT set CONTACT_LAST_NAME = '' where CONTACT_LAST_NAME is null ;
alter table EMS_CONTACT alter column CONTACT_LAST_NAME set not null ;
alter table EMS_CONTACT add column HOME_PHONE_NUMBER varchar(255) ^
update EMS_CONTACT set HOME_PHONE_NUMBER = '' where HOME_PHONE_NUMBER is null ;
alter table EMS_CONTACT alter column HOME_PHONE_NUMBER set not null ;
alter table EMS_CONTACT add column CELL_PHONE_NUMBER varchar(255) ^
update EMS_CONTACT set CELL_PHONE_NUMBER = '' where CELL_PHONE_NUMBER is null ;
alter table EMS_CONTACT alter column CELL_PHONE_NUMBER set not null ;
alter table EMS_CONTACT add column EMAIL varchar(255) ^
update EMS_CONTACT set EMAIL = '' where EMAIL is null ;
alter table EMS_CONTACT alter column EMAIL set not null ;

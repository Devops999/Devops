alter table EMS_ADDRESS add column FROM_DATE date ^
update EMS_ADDRESS set FROM_DATE = current_date where FROM_DATE is null ;
alter table EMS_ADDRESS alter column FROM_DATE set not null ;
alter table EMS_ADDRESS add column TO_DATE date ^
update EMS_ADDRESS set TO_DATE = current_date where TO_DATE is null ;
alter table EMS_ADDRESS alter column TO_DATE set not null ;
alter table EMS_ADDRESS add column ADDRESS_TYPE integer ^
update EMS_ADDRESS set ADDRESS_TYPE = 10 where ADDRESS_TYPE is null ;
alter table EMS_ADDRESS alter column ADDRESS_TYPE set not null ;
alter table EMS_ADDRESS add column ADDRESS_LINE1 longvarchar ^
update EMS_ADDRESS set ADDRESS_LINE1 = '' where ADDRESS_LINE1 is null ;
alter table EMS_ADDRESS alter column ADDRESS_LINE1 set not null ;
alter table EMS_ADDRESS add column ADDRESSLINE2 longvarchar ^
update EMS_ADDRESS set ADDRESSLINE2 = '' where ADDRESSLINE2 is null ;
alter table EMS_ADDRESS alter column ADDRESSLINE2 set not null ;
alter table EMS_ADDRESS add column PERSON_ID varchar(36) ;
alter table EMS_ADDRESS add column ORGANIZATION_ID varchar(36) ;
alter table EMS_ADDRESS add column BANK_ID varchar(36) ;

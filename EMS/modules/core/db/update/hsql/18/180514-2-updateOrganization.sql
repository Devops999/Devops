alter table EMS_ORGANIZATION add column LEGAL_NAME varchar(255) ^
update EMS_ORGANIZATION set LEGAL_NAME = '' where LEGAL_NAME is null ;
alter table EMS_ORGANIZATION alter column LEGAL_NAME set not null ;
alter table EMS_ORGANIZATION add column INCORPORATIONDATE date ^
update EMS_ORGANIZATION set INCORPORATIONDATE = current_date where INCORPORATIONDATE is null ;
alter table EMS_ORGANIZATION alter column INCORPORATIONDATE set not null ;
alter table EMS_ORGANIZATION add column BUSINESS_START_DATE varchar(255) ^
update EMS_ORGANIZATION set BUSINESS_START_DATE = '' where BUSINESS_START_DATE is null ;
alter table EMS_ORGANIZATION alter column BUSINESS_START_DATE set not null ;

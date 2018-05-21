alter table EMS_PERSON add column VERSION integer ^
update EMS_PERSON set VERSION = 0 where VERSION is null ;
alter table EMS_PERSON alter column VERSION set not null ;
alter table EMS_PERSON add column CREATE_TS timestamp ;
alter table EMS_PERSON add column CREATED_BY varchar(50) ;
alter table EMS_PERSON add column UPDATE_TS timestamp ;
alter table EMS_PERSON add column UPDATED_BY varchar(50) ;
alter table EMS_PERSON add column DELETE_TS timestamp ;
alter table EMS_PERSON add column DELETED_BY varchar(50) ;
alter table EMS_PERSON add column DTYPE varchar(31) ;

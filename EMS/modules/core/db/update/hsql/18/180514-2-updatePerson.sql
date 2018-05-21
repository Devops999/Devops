alter table EMS_PERSON add column FIRST_NAME varchar(255) ^
update EMS_PERSON set FIRST_NAME = '' where FIRST_NAME is null ;
alter table EMS_PERSON alter column FIRST_NAME set not null ;
alter table EMS_PERSON add column LAST_NAME varchar(255) ^
update EMS_PERSON set LAST_NAME = '' where LAST_NAME is null ;
alter table EMS_PERSON alter column LAST_NAME set not null ;
alter table EMS_PERSON add column MIDDLE_NAME varchar(255) ^
update EMS_PERSON set MIDDLE_NAME = '' where MIDDLE_NAME is null ;
alter table EMS_PERSON alter column MIDDLE_NAME set not null ;
alter table EMS_PERSON add column SURNAME varchar(255) ^
update EMS_PERSON set SURNAME = '' where SURNAME is null ;
alter table EMS_PERSON alter column SURNAME set not null ;
alter table EMS_PERSON add column DATE_OF_BIRTH date ^
update EMS_PERSON set DATE_OF_BIRTH = current_date where DATE_OF_BIRTH is null ;
alter table EMS_PERSON alter column DATE_OF_BIRTH set not null ;
alter table EMS_PERSON add column GENDER integer ^
update EMS_PERSON set GENDER = 10 where GENDER is null ;
alter table EMS_PERSON alter column GENDER set not null ;
alter table EMS_PERSON add column HEIGHT decimal(19, 2) ^
update EMS_PERSON set HEIGHT = 0 where HEIGHT is null ;
alter table EMS_PERSON alter column HEIGHT set not null ;
alter table EMS_PERSON add column WEIGHT decimal(19, 2) ^
update EMS_PERSON set WEIGHT = 0 where WEIGHT is null ;
alter table EMS_PERSON alter column WEIGHT set not null ;
alter table EMS_PERSON add column EMAIL varchar(255) ^
update EMS_PERSON set EMAIL = '' where EMAIL is null ;
alter table EMS_PERSON alter column EMAIL set not null ;
alter table EMS_PERSON add column HOME_PHONE_NUMBER varchar(255) ^
update EMS_PERSON set HOME_PHONE_NUMBER = '' where HOME_PHONE_NUMBER is null ;
alter table EMS_PERSON alter column HOME_PHONE_NUMBER set not null ;
alter table EMS_PERSON add column CELL_PHONE_NUMBER varchar(255) ^
update EMS_PERSON set CELL_PHONE_NUMBER = '' where CELL_PHONE_NUMBER is null ;
alter table EMS_PERSON alter column CELL_PHONE_NUMBER set not null ;

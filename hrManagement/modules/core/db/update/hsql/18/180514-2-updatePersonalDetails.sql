-- alter table HRMANAGEMENT_PERSONAL_DETAILS add column CODE_ID varchar(36) ^
-- update HRMANAGEMENT_PERSONAL_DETAILS set CODE_ID = <default_value> ;
-- alter table HRMANAGEMENT_PERSONAL_DETAILS alter column CODE_ID set not null ;
alter table HRMANAGEMENT_PERSONAL_DETAILS add column CODE_ID varchar(36) not null ;

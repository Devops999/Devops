-- alter table HRMANAGEMENT_EXPERIENCE_DETAILS add column CODE_ID varchar(36) ^
-- update HRMANAGEMENT_EXPERIENCE_DETAILS set CODE_ID = <default_value> ;
-- alter table HRMANAGEMENT_EXPERIENCE_DETAILS alter column CODE_ID set not null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS add column CODE_ID varchar(36) not null ;

-- alter table HRMANAGEMENT_NOMINEES_DETAILS add column MINOR_NOMINEE_ID varchar(36) ^
-- update HRMANAGEMENT_NOMINEES_DETAILS set MINOR_NOMINEE_ID = <default_value> ;
-- alter table HRMANAGEMENT_NOMINEES_DETAILS alter column MINOR_NOMINEE_ID set not null ;
alter table HRMANAGEMENT_NOMINEES_DETAILS add column MINOR_NOMINEE_ID varchar(36) not null ;

-- alter table HRMANAGEMENT_TRAINING_DETAILS_PRIOR_TO_JOINING add column CODE_ID varchar(36) ^
-- update HRMANAGEMENT_TRAINING_DETAILS_PRIOR_TO_JOINING set CODE_ID = <default_value> ;
-- alter table HRMANAGEMENT_TRAINING_DETAILS_PRIOR_TO_JOINING alter column CODE_ID set not null ;
alter table HRMANAGEMENT_TRAINING_DETAILS_PRIOR_TO_JOINING add column CODE_ID varchar(36) not null ;

alter table HRMANAGEMENT_EXPERIENCE_DETAILS add column CONTACT_NUMBER integer ^
update HRMANAGEMENT_EXPERIENCE_DETAILS set CONTACT_NUMBER = 0 where CONTACT_NUMBER is null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS alter column CONTACT_NUMBER set not null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS add column EMAIL varchar(255) ^
update HRMANAGEMENT_EXPERIENCE_DETAILS set EMAIL = '' where EMAIL is null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS alter column EMAIL set not null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS add column DESIGNATION varchar(255) ^
update HRMANAGEMENT_EXPERIENCE_DETAILS set DESIGNATION = '' where DESIGNATION is null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS alter column DESIGNATION set not null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS add column DATE_OF_JOINING date ^
update HRMANAGEMENT_EXPERIENCE_DETAILS set DATE_OF_JOINING = current_date where DATE_OF_JOINING is null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS alter column DATE_OF_JOINING set not null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS add column DATE_OF_LEAVING date ^
update HRMANAGEMENT_EXPERIENCE_DETAILS set DATE_OF_LEAVING = current_date where DATE_OF_LEAVING is null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS alter column DATE_OF_LEAVING set not null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS add column LAST_SALARY integer ^
update HRMANAGEMENT_EXPERIENCE_DETAILS set LAST_SALARY = 0 where LAST_SALARY is null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS alter column LAST_SALARY set not null ;
alter table HRMANAGEMENT_EXPERIENCE_DETAILS alter column EMPLOYER_ADDRESS set data type longvarchar ;

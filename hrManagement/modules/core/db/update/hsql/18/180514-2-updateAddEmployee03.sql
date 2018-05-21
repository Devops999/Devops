alter table HRMANAGEMENT_ADD_EMPLOYEE alter column ESTABLISHMENT_CODE rename to ESTABLISHMENT_CODE__U95319 ;
alter table HRMANAGEMENT_ADD_EMPLOYEE alter column ESTABLISHMENT_CODE__U95319 set null ;
alter table HRMANAGEMENT_ADD_EMPLOYEE add column CODE integer ^
update HRMANAGEMENT_ADD_EMPLOYEE set CODE = 0 where CODE is null ;
alter table HRMANAGEMENT_ADD_EMPLOYEE alter column CODE set not null ;

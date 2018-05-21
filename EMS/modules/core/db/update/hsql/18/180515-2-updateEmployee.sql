alter table EMS_EMPLOYEE alter column USER_ID rename to USER_ID__U30241 ;
drop index IDX_EMS_EMPLOYEE_USER ;
alter table EMS_EMPLOYEE drop constraint FK_EMS_EMPLOYEE_USER ;

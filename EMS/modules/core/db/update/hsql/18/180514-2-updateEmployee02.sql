alter table EMS_EMPLOYEE add constraint FK_EMS_EMPLOYEE_USER foreign key (USER_ID) references SEC_USER(ID);
create index IDX_EMS_EMPLOYEE_USER on EMS_EMPLOYEE (USER_ID);

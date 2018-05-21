alter table EMS_BANK add constraint FK_EMS_BANK_EMPLOYEE foreign key (EMPLOYEE_ID) references EMS_EMPLOYEE(ID);
create index IDX_EMS_BANK_EMPLOYEE on EMS_BANK (EMPLOYEE_ID);

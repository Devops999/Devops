alter table HRMANAGEMENT_ASSIGN_DN add constraint FK_HRMANAGEMENT_ASSIGN_DN_CODE foreign key (CODE_ID) references HRMANAGEMENT_ADD_EMPLOYEE(ID);
create index IDX_HRMANAGEMENT_ASSIGN_DN_CODE on HRMANAGEMENT_ASSIGN_DN (CODE_ID);

alter table HRMANAGEMENT_SALARY_DETAILS add constraint FK_HRMANAGEMENT_SALARY_DETAILS_CODE foreign key (CODE_ID) references HRMANAGEMENT_ADD_EMPLOYEE(ID);
create index IDX_HRMANAGEMENT_SALARY_DETAILS_CODE on HRMANAGEMENT_SALARY_DETAILS (CODE_ID);
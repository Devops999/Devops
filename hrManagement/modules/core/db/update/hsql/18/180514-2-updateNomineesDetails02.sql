alter table HRMANAGEMENT_NOMINEES_DETAILS add constraint FK_HRMANAGEMENT_NOMINEES_DETAILS_MINOR_NOMINEE foreign key (MINOR_NOMINEE_ID) references HRMANAGEMENT_M_INR_NOMINEE(ID);
create index IDX_HRMANAGEMENT_NOMINEES_DETAILS_MINOR_NOMINEE on HRMANAGEMENT_NOMINEES_DETAILS (MINOR_NOMINEE_ID);
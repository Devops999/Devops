alter table EMS_STATE add constraint FK_EMS_STATE_COUNTRY foreign key (COUNTRY_ID) references EMS_COUNTRY(ID);
create index IDX_EMS_STATE_COUNTRY on EMS_STATE (COUNTRY_ID);

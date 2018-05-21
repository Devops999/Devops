alter table EMS_CITY add constraint FK_EMS_CITY_STATE foreign key (STATE_ID) references EMS_CITY(ID);
create index IDX_EMS_CITY_STATE on EMS_CITY (STATE_ID);

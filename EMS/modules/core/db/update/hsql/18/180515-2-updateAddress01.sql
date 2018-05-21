alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_CITY foreign key (CITY_ID) references EMS_CITY(ID);
create index IDX_EMS_ADDRESS_CITY on EMS_ADDRESS (CITY_ID);

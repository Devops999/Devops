alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_PERSON foreign key (PERSON_ID) references EMS_PERSON(ID);
create index IDX_EMS_ADDRESS_PERSON on EMS_ADDRESS (PERSON_ID);

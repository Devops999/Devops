alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_CONTACT foreign key (CONTACT_ID) references EMS_CONTACT(ID);
create index IDX_EMS_ADDRESS_CONTACT on EMS_ADDRESS (CONTACT_ID);

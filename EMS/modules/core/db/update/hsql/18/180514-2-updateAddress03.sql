alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_BANK foreign key (BANK_ID) references EMS_BANK(ID);
create index IDX_EMS_ADDRESS_BANK on EMS_ADDRESS (BANK_ID);

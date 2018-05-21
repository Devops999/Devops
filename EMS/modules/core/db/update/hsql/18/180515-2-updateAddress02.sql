alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_STATE foreign key (STATE_ID) references EMS_STATE(ID);
create index IDX_EMS_ADDRESS_STATE on EMS_ADDRESS (STATE_ID);

alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_ORGANIZATION foreign key (ORGANIZATION_ID) references EMS_ORGANIZATION(ID);
create index IDX_EMS_ADDRESS_ORGANIZATION on EMS_ADDRESS (ORGANIZATION_ID);
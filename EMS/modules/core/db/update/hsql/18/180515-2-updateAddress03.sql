alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_ZIP_CODE foreign key (ZIP_CODE_ID) references EMS_ZIP_CODE(ID);
create index IDX_EMS_ADDRESS_ZIP_CODE on EMS_ADDRESS (ZIP_CODE_ID);

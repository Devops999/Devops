alter table APP_PROPERTY add constraint FK_APP_PROPERTY_IMAGE_FILE foreign key (IMAGE_FILE_ID) references SYS_FILE(ID);
create index IDX_APP_PROPERTY_IMAGE_FILE on APP_PROPERTY (IMAGE_FILE_ID);

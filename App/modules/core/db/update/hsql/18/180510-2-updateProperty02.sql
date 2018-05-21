alter table APP_PROPERTY alter column IMAGE_FILE_ID rename to IMAGE_FILE_ID__U27344 ;
drop index IDX_APP_PROPERTY_IMAGE_FILE ;
alter table APP_PROPERTY drop constraint FK_APP_PROPERTY_IMAGE_FILE ;

alter table APP_PROPERTY add constraint FK_APP_PROPERTY_SELLER foreign key (SELLER_ID) references APP_SELLER(ID);
create index IDX_APP_PROPERTY_SELLER on APP_PROPERTY (SELLER_ID);

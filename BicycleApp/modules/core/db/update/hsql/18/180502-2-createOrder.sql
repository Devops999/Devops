alter table BICYCLEAPP_ORDER add constraint FK_BICYCLEAPP_ORDER_CLIENT foreign key (CLIENT_ID) references BICYCLEAPP_CLIENT(ID);
alter table BICYCLEAPP_ORDER add constraint FK_BICYCLEAPP_ORDER_MECHANICS foreign key (MECHANICS_ID) references BICYCLEAPP_MECHANIC(ID);
alter table BICYCLEAPP_ORDER add constraint FK_BICYCLEAPP_ORDER_PARTS foreign key (PARTS_ID) references BICYCLEAPP_SPARE_PART(ID);
create index IDX_BICYCLEAPP_ORDER_CLIENT on BICYCLEAPP_ORDER (CLIENT_ID);
create index IDX_BICYCLEAPP_ORDER_MECHANICS on BICYCLEAPP_ORDER (MECHANICS_ID);
create index IDX_BICYCLEAPP_ORDER_PARTS on BICYCLEAPP_ORDER (PARTS_ID);
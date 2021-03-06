-- begin BICYCLEAPPS2_CLIENT
create unique index IDX_BICYCLEAPPS2_CLIENT_UNIQ_PHONE_NUMBER on BICYCLEAPPS2_CLIENT (PHONE_NUMBER) ^
create unique index IDX_BICYCLEAPPS2_CLIENT_UNIQ_EMAIL on BICYCLEAPPS2_CLIENT (EMAIL) ^
-- end BICYCLEAPPS2_CLIENT
-- begin BICYCLEAPPS2_MECHANIC
alter table BICYCLEAPPS2_MECHANIC add constraint FK_BICYCLEAPPS2_MECHANIC_USER foreign key (USER_ID) references SEC_USER(ID)^
create index IDX_BICYCLEAPPS2_MECHANIC_USER on BICYCLEAPPS2_MECHANIC (USER_ID)^
-- end BICYCLEAPPS2_MECHANIC
-- begin BICYCLEAPPS2_SPARE_PART
create unique index IDX_BICYCLEAPPS2_SPARE_PART_UNIQ_TITLE on BICYCLEAPPS2_SPARE_PART (TITLE) ^
-- end BICYCLEAPPS2_SPARE_PART
-- begin BICYCLEAPPS2_ORDER
alter table BICYCLEAPPS2_ORDER add constraint FK_BICYCLEAPPS2_ORDER_CLIENT foreign key (CLIENT_ID) references BICYCLEAPPS2_CLIENT(ID)^
alter table BICYCLEAPPS2_ORDER add constraint FK_BICYCLEAPPS2_ORDER_MECHANIC foreign key (MECHANIC_ID) references BICYCLEAPPS2_MECHANIC(ID)^
create index IDX_BICYCLEAPPS2_ORDER_CLIENT on BICYCLEAPPS2_ORDER (CLIENT_ID)^
create index IDX_BICYCLEAPPS2_ORDER_MECHANIC on BICYCLEAPPS2_ORDER (MECHANIC_ID)^
-- end BICYCLEAPPS2_ORDER
-- begin BICYCLEAPPS2_ORDER_SPARE_PART_LINK
alter table BICYCLEAPPS2_ORDER_SPARE_PART_LINK add constraint FK_ORDSPAPAR_ORDER foreign key (ORDER_ID) references BICYCLEAPPS2_ORDER(ID)^
alter table BICYCLEAPPS2_ORDER_SPARE_PART_LINK add constraint FK_ORDSPAPAR_SPARE_PART foreign key (SPARE_PART_ID) references BICYCLEAPPS2_SPARE_PART(ID)^
-- end BICYCLEAPPS2_ORDER_SPARE_PART_LINK

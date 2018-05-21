-- begin BICYCLEAPPS1_CLIENT
create unique index IDX_BICYCLEAPPS1_CLIENT_UNIQ_EMAIL on BICYCLEAPPS1_CLIENT (EMAIL) ^
-- end BICYCLEAPPS1_CLIENT
-- begin BICYCLEAPPS1_MECHANICS
alter table BICYCLEAPPS1_MECHANICS add constraint FK_BICYCLEAPPS1_MECHANICS_USER foreign key (USER_ID) references SEC_USER(ID)^
create index IDX_BICYCLEAPPS1_MECHANICS_USER on BICYCLEAPPS1_MECHANICS (USER_ID)^
-- end BICYCLEAPPS1_MECHANICS
-- begin BICYCLEAPPS1_SPARE_PART
create unique index IDX_BICYCLEAPPS1_SPARE_PART_UNIQ_TITLE on BICYCLEAPPS1_SPARE_PART (TITLE) ^
-- end BICYCLEAPPS1_SPARE_PART
-- begin BICYCLEAPPS1_ODER
alter table BICYCLEAPPS1_ODER add constraint FK_BICYCLEAPPS1_ODER_CLIENT foreign key (CLIENT_ID) references BICYCLEAPPS1_CLIENT(ID)^
alter table BICYCLEAPPS1_ODER add constraint FK_BICYCLEAPPS1_ODER_MECHANICS foreign key (MECHANICS_ID) references BICYCLEAPPS1_MECHANICS(ID)^
create index IDX_BICYCLEAPPS1_ODER_CLIENT on BICYCLEAPPS1_ODER (CLIENT_ID)^
create index IDX_BICYCLEAPPS1_ODER_MECHANICS on BICYCLEAPPS1_ODER (MECHANICS_ID)^
-- end BICYCLEAPPS1_ODER
-- begin BICYCLEAPPS1_ODER_SPARE_PART_LINK
alter table BICYCLEAPPS1_ODER_SPARE_PART_LINK add constraint FK_ODESPAPAR_ODER foreign key (ODER_ID) references BICYCLEAPPS1_ODER(ID)^
alter table BICYCLEAPPS1_ODER_SPARE_PART_LINK add constraint FK_ODESPAPAR_SPARE_PART foreign key (SPARE_PART_ID) references BICYCLEAPPS1_SPARE_PART(ID)^
-- end BICYCLEAPPS1_ODER_SPARE_PART_LINK

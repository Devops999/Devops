alter table BICYCLEAPPS2_ORDER_SPARE_PART_LINK add constraint FK_ORDSPAPAR_ORDER foreign key (ORDER_ID) references BICYCLEAPPS2_ORDER(ID);
alter table BICYCLEAPPS2_ORDER_SPARE_PART_LINK add constraint FK_ORDSPAPAR_SPARE_PART foreign key (SPARE_PART_ID) references BICYCLEAPPS2_SPARE_PART(ID);

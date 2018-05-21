create table BICYCLEAPPS2_ORDER_SPARE_PART_LINK (
    ORDER_ID varchar(36) not null,
    SPARE_PART_ID varchar(36) not null,
    primary key (ORDER_ID, SPARE_PART_ID)
);

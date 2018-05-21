create table BICYCLEAPPS1_ODER_SPARE_PART_LINK (
    ODER_ID varchar(36) not null,
    SPARE_PART_ID varchar(36) not null,
    primary key (ODER_ID, SPARE_PART_ID)
);

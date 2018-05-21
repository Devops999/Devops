-- begin BICYCLEAPPS1_CLIENT
create table BICYCLEAPPS1_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PHONE varchar(20) not null,
    EMAIL varchar(50) not null,
    --
    primary key (ID)
)^
-- end BICYCLEAPPS1_CLIENT
-- begin BICYCLEAPPS1_MECHANICS
create table BICYCLEAPPS1_MECHANICS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID varchar(36) not null,
    HOURLY_RATE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end BICYCLEAPPS1_MECHANICS
-- begin BICYCLEAPPS1_SPARE_PART
create table BICYCLEAPPS1_SPARE_PART (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    DESCRIPTION longvarchar not null,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end BICYCLEAPPS1_SPARE_PART
-- begin BICYCLEAPPS1_ODER
create table BICYCLEAPPS1_ODER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CLIENT_ID varchar(36) not null,
    MECHANICS_ID varchar(36) not null,
    DESCRIPTION longvarchar not null,
    HOURS_SPENT integer,
    AMOUNT decimal(19, 2),
    STATUS integer,
    PALVISHA integer,
    --
    primary key (ID)
)^
-- end BICYCLEAPPS1_ODER
-- begin BICYCLEAPPS1_ODER_SPARE_PART_LINK
create table BICYCLEAPPS1_ODER_SPARE_PART_LINK (
    ODER_ID varchar(36) not null,
    SPARE_PART_ID varchar(36) not null,
    primary key (ODER_ID, SPARE_PART_ID)
)^
-- end BICYCLEAPPS1_ODER_SPARE_PART_LINK

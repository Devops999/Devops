-- begin BICYCLEAPP_CLIENT
create table BICYCLEAPP_CLIENT (
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
    PHONE_NUMBER varchar(20) not null,
    EMAIL varchar(50) not null,
    --
    primary key (ID)
)^
-- end BICYCLEAPP_CLIENT
-- begin BICYCLEAPP_MECHANIC
create table BICYCLEAPP_MECHANIC (
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
-- end BICYCLEAPP_MECHANIC
-- begin BICYCLEAPP_SPARE_PART
create table BICYCLEAPP_SPARE_PART (
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
    DESCRIPTION longvarchar,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end BICYCLEAPP_SPARE_PART
-- begin BICYCLEAPP_ORDER
create table BICYCLEAPP_ORDER (
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
    DESCRIPTION longvarchar,
    HOURS_SPENT integer not null,
    PARTS_ID varchar(36),
    STATUS integer not null,
    --
    primary key (ID)
)^
-- end BICYCLEAPP_ORDER

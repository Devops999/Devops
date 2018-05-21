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
    AMOUNT decimal(19, 2) not null,
    PARTS_ID varchar(36) not null,
    STATUS integer not null,
    --
    primary key (ID)
);

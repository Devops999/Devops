create table TASK_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LASTNAME varchar(255) not null,
    EMAIL varchar(255) not null,
    DOB date,
    CITY varchar(255),
    STATE varchar(255),
    COUNTRY varchar(255),
    --
    primary key (ID)
);

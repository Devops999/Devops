create table HRMANAGEMENT_ADD_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE integer not null,
    FIRST_NAME varchar(255) not null,
    MIDDLE_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    --
    primary key (ID)
);

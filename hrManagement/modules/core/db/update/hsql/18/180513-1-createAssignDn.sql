create table HRMANAGEMENT_ASSIGN_DN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SELECT_EMPLOYEE_ID varchar(36) not null,
    DOMAIN_NAME varchar(255) not null,
    EMAIL_ID varchar(255) not null,
    --
    primary key (ID)
);

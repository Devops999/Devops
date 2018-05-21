create table HRMANAGEMENT_VERIFY_EMP_STATUS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE_ID varchar(36) not null,
    FULL_NAME varchar(255) not null,
    REPORT varchar(255),
    SUBMIT varchar(255),
    --
    primary key (ID)
);

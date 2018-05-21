create table HRMANAGEMENT_SALARY_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ESTABLISHMENT_CODE integer not null,
    FIXED_CTC integer not null,
    EXTRA integer not null,
    DATE_OF_IMPLEMENTATION date not null,
    --
    primary key (ID)
);

create table HRMANAGEMENT_EXPERIENCE_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMPLOYER_NAME varchar(255) not null,
    EMPLOYER_ADDRESS varchar(255) not null,
    --
    primary key (ID)
);

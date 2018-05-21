create table HRMANAGEMENT_NOMINEES_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPES_OF_SCHEME integer not null,
    NAME varchar(255) not null,
    RELATIONSHIP integer not null,
    ADDRESS longvarchar not null,
    SHARE_ integer not null,
    DATE_OF_BIRTH date not null,
    MINOR_NOMINEE integer not null,
    GURDIAN_NAME varchar(255) not null,
    GURDIAN_ADDRESS longvarchar,
    --
    primary key (ID)
);

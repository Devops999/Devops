create table HRMANAGEMENT_M_INR_NOMINEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    YES varchar(255),
    NO_ varchar(255),
    --
    primary key (ID)
);

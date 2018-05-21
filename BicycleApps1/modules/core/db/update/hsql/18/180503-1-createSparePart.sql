create table BICYCLEAPPS1_SPARE_PART (
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
    DESCRIPTION longvarchar not null,
    PRIVE decimal(19, 2) not null,
    --
    primary key (ID)
);

create table TASK_SALES_LISTING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    APPARTMENTS varchar(255),
    LAND_SITES varchar(255),
    OTHERS_ varchar(255),
    LOCATION varchar(255),
    --
    primary key (ID)
);

create table APP_PROPERTY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_ varchar(255) not null,
    CITY varchar(255) not null,
    LOCALITY varchar(255) not null,
    BHK integer not null,
    AGE_OF_CONSTRUCTION varchar(255) not null,
    PRICE integer not null,
    SELLER_ID varchar(36) not null,
    --
    primary key (ID)
);

-- begin APP_CUSTOMER
create table APP_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CONTACT integer,
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end APP_CUSTOMER
-- begin APP_SELLER
create table APP_SELLER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CONTACT integer not null,
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end APP_SELLER
-- begin APP_PROPERTY
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
    IMAGE_FILE_ID varchar(36),
    TYPE_ integer not null,
    CITY varchar(255) not null,
    LOCALITY varchar(255) not null,
    BHK integer not null,
    AREA_SQ_FT integer not null,
    AGE_OF_CONSTRUCTION varchar(255) not null,
    PRICE integer not null,
    SELLER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end APP_PROPERTY
-- begin APP_BOOKING
create table APP_BOOKING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end APP_BOOKING
-- begin APP_ENQUIRY
create table APP_ENQUIRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FROM_ varchar(255) not null,
    TO_ varchar(255) not null,
    QUERY longvarchar not null,
    --
    primary key (ID)
)^
-- end APP_ENQUIRY
-- begin APP_TRANSACTION
create table APP_TRANSACTION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end APP_TRANSACTION
-- begin APP_OFFICE
create table APP_OFFICE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end APP_OFFICE

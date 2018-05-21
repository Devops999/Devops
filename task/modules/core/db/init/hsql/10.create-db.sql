-- begin TASK_PROPERTY
create table TASK_PROPERTY (
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
    CITY varchar(255),
    LOCALITY varchar(255),
    UNITS integer not null,
    AREA_SQ_FT varchar(255),
    AGE_OF_CONSTRUCTION varchar(255),
    PRICE varchar(255),
    SELLER_ID varchar(36),
    ENQUIRY longvarchar,
    --
    primary key (ID)
)^
-- end TASK_PROPERTY
-- begin TASK_CUSTOMER
create table TASK_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LASTNAME varchar(255) not null,
    EMAIL varchar(255) not null,
    DOB date,
    CITY varchar(255),
    STATE varchar(255),
    COUNTRY varchar(255),
    --
    primary key (ID)
)^
-- end TASK_CUSTOMER
-- begin TASK_SELLER
create table TASK_SELLER (
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
    EMAIL varchar(255) not null,
    CONTACT varchar(255) not null,
    --
    primary key (ID)
)^
-- end TASK_SELLER
-- begin TASK_BOOKING
create table TASK_BOOKING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SELLER_INFO_ID varchar(36),
    --
    primary key (ID)
)^
-- end TASK_BOOKING
-- begin TASK_ENQUIRY
create table TASK_ENQUIRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FROM_ varchar(255),
    TO_ varchar(255),
    QUERY longvarchar,
    --
    primary key (ID)
)^
-- end TASK_ENQUIRY
-- begin TASK_TRANSACTION
create table TASK_TRANSACTION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TRANSACTION_TYPE varchar(255),
    LOCATION varchar(255),
    --
    primary key (ID)
)^
-- end TASK_TRANSACTION
-- begin TASK_OFFICE
create table TASK_OFFICE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HEAD_OFFICE varchar(255),
    OWN_PROFILE varchar(255),
    REPORTS longvarchar,
    MORTAGE varchar(255),
    --
    primary key (ID)
)^
-- end TASK_OFFICE
-- begin TASK_SALES_LISTING
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
    TRANSACTION_ID varchar(36),
    --
    primary key (ID)
)^
-- end TASK_SALES_LISTING
-- begin TASK_BROKER
create table TASK_BROKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SCHEMES varchar(255),
    LOCATION_WIDE varchar(255),
    --
    primary key (ID)
)^
-- end TASK_BROKER

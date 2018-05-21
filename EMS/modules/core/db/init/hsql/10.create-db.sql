-- begin EMS_PERSON
create table EMS_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    MIDDLE_NAME varchar(255) not null,
    SURNAME varchar(255) not null,
    DATE_OF_BIRTH date not null,
    GENDER integer not null,
    HEIGHT decimal(19, 2) not null,
    WEIGHT decimal(19, 2) not null,
    EMAIL varchar(255) not null,
    HOME_PHONE_NUMBER varchar(255) not null,
    CELL_PHONE_NUMBER varchar(255) not null,
    --
    primary key (ID)
)^
-- end EMS_PERSON
-- begin EMS_ORGANIZATION
create table EMS_ORGANIZATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LEGAL_NAME varchar(255) not null,
    INCORPORATIONDATE date not null,
    BUSINESS_START_DATE varchar(255) not null,
    --
    primary key (ID)
)^
-- end EMS_ORGANIZATION
-- begin EMS_BANK
create table EMS_BANK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FROM_DATE date not null,
    TO_DATE integer not null,
    BANK_CODE varchar(255) not null,
    BANK_SWITCH_CODE varchar(255) not null,
    BANK_NAME varchar(255) not null,
    BRANCH_NAME varchar(255) not null,
    ACCOUNT_TYPE integer not null,
    ACCOUNT_NO varchar(255) not null,
    EMPLOYEE_ID varchar(36),
    ORGANIZATION_ID varchar(36),
    --
    primary key (ID)
)^
-- end EMS_BANK
-- begin EMS_EMPLOYEE
create table EMS_EMPLOYEE (
    ID varchar(36) not null,
    --
    MANAGER_ID varchar(36),
    USER_ID varchar(36),
    START_DATE date not null,
    TERMINATION_DATE date not null,
    RESIGNATION_DATE date not null,
    ANNUAL_SALARY decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end EMS_EMPLOYEE
-- begin EMS_CONTACT
create table EMS_CONTACT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CONTACT_FIRST_NAME varchar(255) not null,
    CONTACT_LAST_NAME varchar(255) not null,
    HOME_PHONE_NUMBER varchar(255) not null,
    CELL_PHONE_NUMBER varchar(255) not null,
    EMAIL varchar(255) not null,
    PERSON_ID varchar(36),
    ORGANIZATION_ID varchar(36),
    --
    primary key (ID)
)^
-- end EMS_CONTACT
-- begin EMS_ADDRESS
create table EMS_ADDRESS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    FROM_DATE date not null,
    TO_DATE date not null,
    ADDRESS_TYPE integer not null,
    ADDRESS_LINE1 longvarchar not null,
    ADDRESSLINE2 longvarchar not null,
    PERSON_ID varchar(36),
    ORGANIZATION_ID varchar(36),
    BANK_ID varchar(36),
    CITY_ID varchar(36) not null,
    STATE_ID varchar(36) not null,
    ZIP_CODE_ID varchar(36) not null,
    CONTACT_ID varchar(36),
    --
    primary key (ID)
)^
-- end EMS_ADDRESS
-- begin EMS_COUNTRY
create table EMS_COUNTRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COUNTRY_CODE varchar(255) not null,
    COUNTRY_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end EMS_COUNTRY
-- begin EMS_STATE
create table EMS_STATE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STATE_CODE varchar(255) not null,
    STATE_NAME varchar(255) not null,
    COUNTRY_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end EMS_STATE
-- begin EMS_CITY
create table EMS_CITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CITY_CODE varchar(255) not null,
    CITY_NAME varchar(255) not null,
    STATE_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end EMS_CITY
-- begin EMS_ZIP_CODE
create table EMS_ZIP_CODE (
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
-- end EMS_ZIP_CODE

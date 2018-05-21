create table HRMANAGEMENT_PERSONAL_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_OF_BIRTH date not null,
    GENDER integer not null,
    NATIONALITY integer not null,
    BLOOD_GROUP integer not null,
    MARITAL_STATUS integer not null,
    DRIVING_LICENSE_NUMBER varchar(255),
    --
    primary key (ID)
);

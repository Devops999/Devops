create table HRMANAGEMENT_TRAINING_DETAILS_PRIOR_TO_JOINING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_OF_TRAINING integer not null,
    FACULTY varchar(255),
    DURATION varchar(255) not null,
    YEAR_OF_TRAINING date not null,
    --
    primary key (ID)
);

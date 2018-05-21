create table HRMANAGEMENT_QUALIFICATION_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LEVEL_ integer not null,
    DEGREE varchar(255) not null,
    SCHOOL_OR_COLLAGE varchar(255),
    BOARD_OF_UNIVERSITY varchar(255),
    YEAR_OF_QUALIFICATION integer,
    DIVISSION integer not null,
    PERCENTAGE varchar(255),
    --
    primary key (ID)
);

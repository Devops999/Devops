-- begin HRMANAGEMENT_ADD_EMPLOYEE
create table HRMANAGEMENT_ADD_EMPLOYEE (
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
    CODE integer not null,
    FIRST_NAME varchar(255) not null,
    MIDDLE_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end HRMANAGEMENT_ADD_EMPLOYEE
-- begin HRMANAGEMENT_ASSIGN_DN
create table HRMANAGEMENT_ASSIGN_DN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE_ID varchar(36) not null,
    SELECT_EMPLOYEE_ID varchar(36) not null,
    DOMAIN_NAME varchar(255) not null,
    EMAIL_ID varchar(255) not null,
    --
    primary key (ID)
)^
-- end HRMANAGEMENT_ASSIGN_DN
-- begin HRMANAGEMENT_PERSONAL_DETAILS
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
    CODE_ID varchar(36) not null,
    DATE_OF_BIRTH date not null,
    GENDER integer not null,
    NATIONALITY integer not null,
    BLOOD_GROUP integer not null,
    MARITAL_STATUS integer not null,
    DRIVING_LICENSE_NUMBER varchar(255),
    --
    primary key (ID)
)^
-- end HRMANAGEMENT_PERSONAL_DETAILS
-- begin HRMANAGEMENT_QUALIFICATION_DETAILS
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
    CODE_ID varchar(36) not null,
    LEVEL_ integer not null,
    DEGREE varchar(255) not null,
    SCHOOL_OR_COLLAGE varchar(255),
    BOARD_OF_UNIVERSITY varchar(255),
    YEAR_OF_QUALIFICATION integer,
    DIVISSION integer not null,
    PERCENTAGE varchar(255),
    --
    primary key (ID)
)^
-- end HRMANAGEMENT_QUALIFICATION_DETAILS
-- begin HRMANAGEMENT_TRAINING_DETAILS_PRIOR_TO_JOINING
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
    CODE_ID varchar(36) not null,
    TYPE_OF_TRAINING integer not null,
    FACULTY varchar(255),
    DURATION varchar(255) not null,
    YEAR_OF_TRAINING date not null,
    --
    primary key (ID)
)^
-- end HRMANAGEMENT_TRAINING_DETAILS_PRIOR_TO_JOINING
-- begin HRMANAGEMENT_EXPERIENCE_DETAILS
create table HRMANAGEMENT_EXPERIENCE_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE_ID varchar(36) not null,
    EMPLOYER_NAME varchar(255) not null,
    EMPLOYER_ADDRESS longvarchar not null,
    CONTACT_NUMBER integer not null,
    EMAIL varchar(255) not null,
    DESIGNATION varchar(255) not null,
    DATE_OF_JOINING date not null,
    DATE_OF_LEAVING date not null,
    LAST_SALARY integer not null,
    --
    primary key (ID)
)^
-- end HRMANAGEMENT_EXPERIENCE_DETAILS
-- begin HRMANAGEMENT_NOMINEES_DETAILS
create table HRMANAGEMENT_NOMINEES_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE_ID varchar(36),
    TYPES_OF_SCHEME integer not null,
    NAME varchar(255) not null,
    RELATIONSHIP integer not null,
    MINOR_NOMINEE integer not null,
    ADDRESS longvarchar not null,
    SHARE_ integer not null,
    DATE_OF_BIRTH date not null,
    GURDIAN_NAME varchar(255) not null,
    GURDIAN_ADDRESS longvarchar,
    --
    primary key (ID)
)^
-- end HRMANAGEMENT_NOMINEES_DETAILS
-- begin HRMANAGEMENT_SALARY_DETAILS
create table HRMANAGEMENT_SALARY_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE_ID varchar(36) not null,
    FIXED_CTC integer not null,
    EXTRA integer not null,
    DATE_OF_IMPLEMENTATION date not null,
    --
    primary key (ID)
)^
-- end HRMANAGEMENT_SALARY_DETAILS
-- begin HRMANAGEMENT_VERIFY_EMP_STATUS
create table HRMANAGEMENT_VERIFY_EMP_STATUS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE_ID varchar(36) not null,
    FULL_NAME varchar(255) not null,
    REPORT varchar(255),
    SUBMIT varchar(255),
    --
    primary key (ID)
)^
-- end HRMANAGEMENT_VERIFY_EMP_STATUS
-- begin HRMANAGEMENT_REPORT_TO_DETAILS
create table HRMANAGEMENT_REPORT_TO_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SELECT_CODE integer not null,
    --
    primary key (ID)
)^
-- end HRMANAGEMENT_REPORT_TO_DETAILS

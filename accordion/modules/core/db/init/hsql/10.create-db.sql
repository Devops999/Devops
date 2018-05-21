-- begin ACCORDION_PALVISHA
create table ACCORDION_PALVISHA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end ACCORDION_PALVISHA
-- begin SEC_USER
alter table SEC_USER add column PALVISHA_ID varchar(36) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'accordion$ExtUser' where DTYPE is null ^
-- end SEC_USER

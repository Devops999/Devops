-- begin VIDEO4_CUSTOMER
create table VIDEO4_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    EMAIL varchar(50) not null,
    --
    primary key (ID)
)^
-- end VIDEO4_CUSTOMER
-- begin VIDEO4_ORDER
create table VIDEO4_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ timestamp not null,
    AMOUNT decimal(19, 2) not null,
    CUSTOMER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end VIDEO4_ORDER
-- begin VIDEO4_PRODUCT
create table VIDEO4_PRODUCT (
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
    PRICE decimal(19, 3) not null,
    --
    primary key (ID)
)^
-- end VIDEO4_PRODUCT
-- begin VIDEO4_ORDER_LINE
create table VIDEO4_ORDER_LINE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID varchar(36) not null,
    PRODUCT_ID varchar(36) not null,
    QUANTITY decimal(19, 3) not null,
    --
    primary key (ID)
)^
-- end VIDEO4_ORDER_LINE

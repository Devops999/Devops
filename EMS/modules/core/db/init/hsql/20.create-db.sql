-- begin EMS_BANK
alter table EMS_BANK add constraint FK_EMS_BANK_EMPLOYEE foreign key (EMPLOYEE_ID) references EMS_EMPLOYEE(ID)^
alter table EMS_BANK add constraint FK_EMS_BANK_ORGANIZATION foreign key (ORGANIZATION_ID) references EMS_ORGANIZATION(ID)^
create index IDX_EMS_BANK_EMPLOYEE on EMS_BANK (EMPLOYEE_ID)^
create index IDX_EMS_BANK_ORGANIZATION on EMS_BANK (ORGANIZATION_ID)^
-- end EMS_BANK
-- begin EMS_EMPLOYEE
alter table EMS_EMPLOYEE add constraint FK_EMS_EMPLOYEE_MANAGER foreign key (MANAGER_ID) references EMS_EMPLOYEE(ID)^
alter table EMS_EMPLOYEE add constraint FK_EMS_EMPLOYEE_USER foreign key (USER_ID) references SEC_USER(ID)^
alter table EMS_EMPLOYEE add constraint FK_EMS_EMPLOYEE_ID foreign key (ID) references EMS_PERSON(ID)^
create index IDX_EMS_EMPLOYEE_MANAGER on EMS_EMPLOYEE (MANAGER_ID)^
create index IDX_EMS_EMPLOYEE_USER on EMS_EMPLOYEE (USER_ID)^
-- end EMS_EMPLOYEE
-- begin EMS_CONTACT
alter table EMS_CONTACT add constraint FK_EMS_CONTACT_PERSON foreign key (PERSON_ID) references EMS_PERSON(ID)^
alter table EMS_CONTACT add constraint FK_EMS_CONTACT_ORGANIZATION foreign key (ORGANIZATION_ID) references EMS_ORGANIZATION(ID)^
create index IDX_EMS_CONTACT_PERSON on EMS_CONTACT (PERSON_ID)^
create index IDX_EMS_CONTACT_ORGANIZATION on EMS_CONTACT (ORGANIZATION_ID)^
-- end EMS_CONTACT
-- begin EMS_ADDRESS
alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_PERSON foreign key (PERSON_ID) references EMS_PERSON(ID)^
alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_ORGANIZATION foreign key (ORGANIZATION_ID) references EMS_ORGANIZATION(ID)^
alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_BANK foreign key (BANK_ID) references EMS_BANK(ID)^
alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_CITY foreign key (CITY_ID) references EMS_CITY(ID)^
alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_STATE foreign key (STATE_ID) references EMS_STATE(ID)^
alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_ZIP_CODE foreign key (ZIP_CODE_ID) references EMS_ZIP_CODE(ID)^
alter table EMS_ADDRESS add constraint FK_EMS_ADDRESS_CONTACT foreign key (CONTACT_ID) references EMS_CONTACT(ID)^
create index IDX_EMS_ADDRESS_PERSON on EMS_ADDRESS (PERSON_ID)^
create index IDX_EMS_ADDRESS_ORGANIZATION on EMS_ADDRESS (ORGANIZATION_ID)^
create index IDX_EMS_ADDRESS_BANK on EMS_ADDRESS (BANK_ID)^
create index IDX_EMS_ADDRESS_CITY on EMS_ADDRESS (CITY_ID)^
create index IDX_EMS_ADDRESS_STATE on EMS_ADDRESS (STATE_ID)^
create index IDX_EMS_ADDRESS_ZIP_CODE on EMS_ADDRESS (ZIP_CODE_ID)^
create index IDX_EMS_ADDRESS_CONTACT on EMS_ADDRESS (CONTACT_ID)^
-- end EMS_ADDRESS
-- begin EMS_STATE
alter table EMS_STATE add constraint FK_EMS_STATE_COUNTRY foreign key (COUNTRY_ID) references EMS_COUNTRY(ID)^
create index IDX_EMS_STATE_COUNTRY on EMS_STATE (COUNTRY_ID)^
-- end EMS_STATE
-- begin EMS_CITY
alter table EMS_CITY add constraint FK_EMS_CITY_STATE foreign key (STATE_ID) references EMS_CITY(ID)^
create index IDX_EMS_CITY_STATE on EMS_CITY (STATE_ID)^
-- end EMS_CITY

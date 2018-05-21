alter table EMS_CONTACT add constraint FK_EMS_CONTACT_PERSON foreign key (PERSON_ID) references EMS_PERSON(ID);
create index IDX_EMS_CONTACT_PERSON on EMS_CONTACT (PERSON_ID);

-- begin SEC_USER
alter table SEC_USER add constraint FK_SEC_USER_PALVISHA foreign key (PALVISHA_ID) references ACCORDION_PALVISHA(ID)^
create index IDX_SEC_USER_PALVISHA on SEC_USER (PALVISHA_ID)^
-- end SEC_USER

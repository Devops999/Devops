alter table APP_PROPERTY add column TYPE_ integer ^
update APP_PROPERTY set TYPE_ = 10 where TYPE_ is null ;
alter table APP_PROPERTY alter column TYPE_ set not null ;

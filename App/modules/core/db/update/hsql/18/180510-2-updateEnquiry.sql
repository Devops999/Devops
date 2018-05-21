alter table APP_ENQUIRY add column FROM_ varchar(255) ^
update APP_ENQUIRY set FROM_ = '' where FROM_ is null ;
alter table APP_ENQUIRY alter column FROM_ set not null ;
alter table APP_ENQUIRY add column TO_ varchar(255) ^
update APP_ENQUIRY set TO_ = '' where TO_ is null ;
alter table APP_ENQUIRY alter column TO_ set not null ;
alter table APP_ENQUIRY add column QUERY longvarchar ^
update APP_ENQUIRY set QUERY = '' where QUERY is null ;
alter table APP_ENQUIRY alter column QUERY set not null ;

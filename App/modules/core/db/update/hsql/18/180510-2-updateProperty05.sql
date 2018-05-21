alter table APP_PROPERTY add column AREA_SQ_FT integer ^
update APP_PROPERTY set AREA_SQ_FT = 0 where AREA_SQ_FT is null ;
alter table APP_PROPERTY alter column AREA_SQ_FT set not null ;

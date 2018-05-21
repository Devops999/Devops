alter table BICYCLEAPPS2_ORDER add column PALVISHA integer ;
update BICYCLEAPPS2_ORDER set STATUS = 10 where STATUS is null ;
alter table BICYCLEAPPS2_ORDER alter column STATUS set not null ;

alter table BICYCLEAPPS2_ORDER add column ANMOL integer ;
update BICYCLEAPPS2_ORDER set AMOUNT = 0 where AMOUNT is null ;
alter table BICYCLEAPPS2_ORDER alter column AMOUNT set not null ;

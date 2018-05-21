alter table BICYCLEAPPS1_SPARE_PART alter column PRIVE rename to PRIVE__U40332 ;
alter table BICYCLEAPPS1_SPARE_PART alter column PRIVE__U40332 set null ;
alter table BICYCLEAPPS1_SPARE_PART add column PRICE decimal(19, 2) ^
update BICYCLEAPPS1_SPARE_PART set PRICE = 0 where PRICE is null ;
alter table BICYCLEAPPS1_SPARE_PART alter column PRICE set not null ;

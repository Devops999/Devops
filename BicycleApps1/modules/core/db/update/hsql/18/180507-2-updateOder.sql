alter table BICYCLEAPPS1_ODER alter column PARTS_ID rename to PARTS_ID__U47756 ;
alter table BICYCLEAPPS1_ODER alter column PARTS_ID__U47756 set null ;
drop index IDX_BICYCLEAPPS1_ODER_PARTS ;
alter table BICYCLEAPPS1_ODER drop constraint FK_BICYCLEAPPS1_ODER_PARTS ;

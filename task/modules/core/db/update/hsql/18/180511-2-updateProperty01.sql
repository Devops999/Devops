alter table TASK_PROPERTY alter column PRICE rename to PRICE__U65023 ;
alter table TASK_PROPERTY alter column PRICE__U65023 set null ;
alter table TASK_PROPERTY alter column AREA_SQ_FT rename to AREA_SQ_FT__U53536 ;
alter table TASK_PROPERTY add column AREA_SQ_FT varchar(255) ;
alter table TASK_PROPERTY add column PRICE varchar(255) ;

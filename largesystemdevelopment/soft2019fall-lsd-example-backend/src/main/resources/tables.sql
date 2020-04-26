drop table PEOPLE; -- will error first time

drop sequence Person_sequence restrict;

create sequence Person_sequence as int start with 10000 increment by 1;

create table PEOPLE (
    ID int primary key,
    FIRST_NAME varchar(40) not null,
    LAST_NAME varchar(40) not null,
    EMAIL varchar(40)
    );


create database namebook;

create schema account;


create table account.person (
    person_id           int8,
    password            varchar(32) not null,
    gender_code         varchar(1),
    date_of_birth       date,
    intl_tel_code       varchar(4),
    login_mobile        varchar(12),
    login_email         varchar(60),
    create_time         timestamp,
    update_time         timestamp,

    primary key (person_id)
);

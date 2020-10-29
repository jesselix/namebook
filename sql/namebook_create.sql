create database namebook;

create schema account;


create table account.person (
    person_id           int8            not null,
    password            varchar(32)     not null,
    gender_code         varchar(1)      not null,
    date_of_birth       date,
    intl_tel_code       varchar(4)      not null,
    login_mobile        varchar(12)     not null,
    login_email         varchar(60)     not null,
    create_time         timestamp       not null,
    update_time         timestamp       not null,

    primary key (person_id)
);

create table account.person_name (
    person_name_id      int8            not null,
    person_id           int8            not null,
    language_code       varchar(5)      not null,
    given_name          varchar(50)     not null,
    middle_name         varchar(50),
    surname             varchar(50),
    create_time         timestamp       not null,
    update_time         timestamp       not null,

    primary key (person_name_id)
);


use namebook_account;

# create

create table if not exists person (
    person_id char(16) not null primary key,
    password char(32) not null,
    gender char(1),
    date_of_birth date,
    intl_tel_code char(4),
    primary_mobile char(15),
    primary_email varchar(50),
    create_time datetime,
    update_time datetime
);

create table if not exists person_name (
    person_name_id char(16) not null primary key,
    person_id char(16) not null,
    language_code char(5) not null,
    given_name char(30) not null,
    middle_name char(30),
    surname char(30) not null,
    create_time datetime,
    update_time datetime
);


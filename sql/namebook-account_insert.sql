use namebook_account;

select * from person;
select * from person_name;

-- # insert

insert into
    person(person_id, password, gender, date_of_birth, intl_tel_code, primary_mobile, primary_email, create_time, update_time)
values (
        'person_id_0001',
        'password_0001',
        'm',
        date('1981-10-22'),
        '86',
        '18923050001',
        'jes@live.com',
        now(),
        now()
       );

insert into
    person_name(person_name_id, person_id, language_code, given_name, surname, create_time, update_time)
#     person_name(person_name_id, person_id, language_code, given_name, surname, create_time, update_time)
values (
        'pn_id_0001',
        'person_id_0001',
        'eng',
        'jesse',
        'li',
        now(),
        now()
       );

use namebook_account;

select * from person;
select * from person_name;

-- # select
select * from person;

select
    p.person_id, p.gender, p.date_of_birth, p.intl_tel_code, p.primary_mobile, p.primary_email, pn.language_code, pn.given_name, pn.middle_name, pn.surname
from
    person p
left join
    person_name pn
on
    p.person_id = pn.person_id
where
    p.person_id = 'person_id_0001'
and
    pn.language_code = 'eng' limit 1;
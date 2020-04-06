use namebook_account;

-- # select

select
    p.person_id, p.gender, p.date_of_birth, p.intl_tel_code, p.primary_mobile, p.primary_email, pn.language_code, pn.given_name, pn.middle_name, pn.surname
from
    person p
left join
    person_name pn
on
    p.person_id = pn.person_id
where
    p.person_id = ''
and
    pn.language_code = ''
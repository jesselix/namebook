
select * from person where person_id = 1;

select * from person_name;

select (
           case (select t0 from test0 limit 1)
               when '00' then 'x00'
               when '01' then 'x01'
               else 'y' end
           ) ddd
from person;

select * from test0;
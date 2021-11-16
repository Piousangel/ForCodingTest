select ANIMAL_ID, NAME
from animal_ins
where animal_type = 'dog' and name like "%EL%"
order by name
--  9/25 11/16
-- select animal_id, name
-- from animal_ins
-- where name like '%el%' and animal_type like 'Dog'
-- order by name
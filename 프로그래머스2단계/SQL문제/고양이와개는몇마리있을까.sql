select animal_type, count(animal_type) as count
from animal_ins
group by animal_type
having count(animal_type) >= 1
order by animal_type

select animal_type, count(animal_type) as count
from animal_ins
group by animal_type
order by animal_type asc

--9/26 11/16 11/19 1/10 3/22

-- select animal_type, count(animal_type) as count
-- from animal_ins
-- group by animal_type
-- order by animal_type

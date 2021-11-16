select animal_type, count(animal_type) as count
from animal_ins
group by animal_type
having count(animal_type) >= 1
order by animal_type

--9/26 11/16

-- select animal_type, count(animal_type) as count
-- from animal_ins
-- group by animal_type
-- order by animal_type

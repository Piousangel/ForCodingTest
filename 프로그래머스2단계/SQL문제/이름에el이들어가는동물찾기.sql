select ANIMAL_ID, NAME
from animal_ins
where animal_type = 'dog' and name like "%EL%"
order by name
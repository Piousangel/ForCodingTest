select animal_id, name
from animal_ins
where INTAKE_CONDITION != 'aged'
order by animal_id asc
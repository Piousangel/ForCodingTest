-- 9/18 11/16
select animal_id, name
from animal_ins
where intake_condition != "Aged"
order by animal_id
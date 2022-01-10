-- 9/18 11/16 1/5
select animal_id, name
from animal_ins
where intake_condition = "Sick"
order by animal_id asc

-- select animal_id, name
-- from animal_ins
-- where intake_condition like 'sick'
-- order by animal_id
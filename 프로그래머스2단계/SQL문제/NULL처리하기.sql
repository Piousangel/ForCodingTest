select animal_type, IF NULL(NAME, "No name") AS NAME, sex_upon_intake
from animal_ins
order by animal_id

--9/25
-- # select animal_type, replace(NAME, 'NULL' , 'No name') AS NAME, sex_upon
-- # from animal_ins
-- # order by animal_id
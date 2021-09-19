select animal_type, IFNULL(NAME, "No name") AS NAME, sex_upon_intake
from animal_ins
order by animal_id


-- # select animal_type, replace(NAME, 'NULL' , 'No name') AS NAME, sex_upon
-- # from animal_ins
-- # order by animal_id
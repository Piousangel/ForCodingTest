select animal_type, IFNULL(NAME, "No name") AS NAME, sex_upon_intake
from animal_ins
order by animal_id

-- 9/25 11/16 1/5 이프널 기억 3/22
-- //틀린답
-- # select animal_type, replace(NAME, 'NULL' , 'No name') AS NAME, sex_upon_intake
-- # from animal_ins
-- # order by animal_id
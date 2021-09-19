select ANIMAL_ID, NAME, SEX_UPON_INTAKE
from animal_ins
where NAME in ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')

-- 밑에 코드는 안대요 where like 쓰면 String 포함하고 있는 모든 이름을 뽑아내서 안되는건가요?

-- select animal_id, name, sex_upon_intake
-- from animal_ins
-- where
--         name like '%Lucy%'
--     OR
--         name like '%Ella%'
--     OR
--         name like '%Pickle%'
--     OR
--         name like '%Rogan%'
--     OR
--         name like '%Sabrina%'
--     OR
--         name like '%Mitty%'
-- order by animal_id 
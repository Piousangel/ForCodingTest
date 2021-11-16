--left joinm = 교집합
--  9/26 11/16
SELECT B.ANIMAL_ID, B.NAME
from animal_outs as B
left join animal_ins as A on A.animal_id = B.animal_id
where A.animal_id is null
order by B.ANIMAL_ID

-- SELECT animal_outs.ANIMAL_ID, animal_outs.NAME
-- from animal_outs
-- left join animal_ins on animal_ins.animal_id = animal_outs.animal_id
-- where animal_ins.animal_id is null
-- order by animal_outs.ANIMAL_ID
-- 11/16 11/19 11/24 12/5 1/10 3/12
select A.animal_id, A.animal_type, A.name
from animal_ins as A join animal_outs as B
where A.animal_id = B.animal_id and A.sex_upon_intake != B.sex_upon_outcome
order by A.animal_id

-- select B.animal_id, B.animal_type, B.name
-- from animal_outs as B
-- left join animal_ins as A on A.animal_id = B.animal_id
-- where A.sex_upon_intake != B.sex_upon_outcome
-- order by B.animal_id

-- select B.animal_id, B.animal_type, B.name
-- from animal_outs as B
-- left join animal_ins as A on A.animal_id = B.animal_id
-- where A.sex_upon_intake != B.sex_upon_outcome
-- order by B.animal_id
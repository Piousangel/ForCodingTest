// 11/16
select A.animal_id, A.animal_type, A.name
from animal_ins as A join animal_outs as B
where A.animal_id = B.animal_id and A.sex_upon_intake != B.sex_upon_outcome
order by A.animal_id
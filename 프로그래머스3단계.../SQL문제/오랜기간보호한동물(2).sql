select A.animal_id, A.name
from animal_ins as A
left join animal_outs as B on A.animal_id = B.animal_id
where B.datetime is not null
order by B.datetime - A.datetime desc limit 2

-- 11/19
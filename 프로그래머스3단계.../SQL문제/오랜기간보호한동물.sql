SELECT A.name as NAME, A.datetime
from animal_ins as A
left join animal_outs as B on A.animal_id = B.animal_id
where B.animal_id is null
order by A.datetime
limit 3

--left join = 교집합 11/19
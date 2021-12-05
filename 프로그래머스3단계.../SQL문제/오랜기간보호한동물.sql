SELECT A.name as NAME, A.datetime
from animal_ins as A
left join animal_outs as B on A.animal_id = B.animal_id
where B.animal_id is null
order by A.datetime
limit 3

--left join = 왼쪽 기준 오른쪽 교집합 때림, 없으면 널값으로 채움 11/19 11/19 11/24 12/5


-- select A.name, A.datetime
-- from animal_ins as A
-- left join animal_outs as B on A.animal_id = B.animal_id
-- where B.animal_id is null
-- order by A.datetime limit 3
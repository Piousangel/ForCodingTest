select A.animal_id, A.name
from animal_ins as A
left join animal_outs as B on A.animal_id = B.animal_id
where B.datetime is not null
order by B.datetime - A.datetime desc limit 2

-- 11/19 11/24 밑에걸로 짰는데 더 짧당

-- select B.animal_id, B.name
-- from animal_outs as B
-- left join animal_ins as A on A.animal_id = B.animal_id
-- order by B.datetime - A.datetime desc limit 2
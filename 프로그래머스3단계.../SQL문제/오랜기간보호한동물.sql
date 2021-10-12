SELECT animal_ins.name as NAME, animal_ins.datetime
from animal_ins
left join animal_outs on animal_ins.animal_id = animal_outs.animal_id
where animal_outs.animal_id is null
order by animal_ins.datetime
limit 3

--left join = 교집합
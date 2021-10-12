SELECT animal_outs.ANIMAL_ID, animal_outs.NAME
from animal_outs
left join animal_ins on animal_ins.animal_id = animal_outs.animal_id
where animal_ins.animal_id is null
order by animal_outs.ANIMAL_ID

--left joinm = 교집합
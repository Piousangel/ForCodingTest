SELECT animal_outs.ANIMAL_ID, animal_outs.NAME
from animal_ins, animal_outs
where animal_ins.animal_id = animal_outs.animal_id
        and animal_ins.datetime >= animal_outs.datetime

order by animal_ins.datetime
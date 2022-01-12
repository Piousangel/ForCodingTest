-- 11/19 11/24 12/5 12/11 1/12
select A.animal_id, A.name
from animal_ins as A
left join animal_outs as B on A.animal_id = B.animal_id
where A.datetime > B.datetime
order by A.datetime

-- SELECT animal_outs.ANIMAL_ID, animal_outs.NAME
-- from animal_ins, animal_outs
-- where animal_ins.animal_id = animal_outs.animal_id
--         and animal_ins.datetime >= animal_outs.datetime

-- order by animal_ins.datetime  -- 시작일이 빠른순으로 조회




--left joinm = 교집합
--  9/26 11/16 11/19 11/24 12/5 1/10 2/7
SELECT B.ANIMAL_ID, B.NAME
from animal_outs as B
left join animal_ins as A on A.animal_id = B.animal_id
where A.animal_id is null
order by B.ANIMAL_ID

-- SELECT animal_outs.ANIMAL_ID, animal_outs.NAME
-- from animal_outs
-- left join animal_ins on animal_ins.animal_id = animal_outs.animal_id
-- where animal_ins.animal_id is null
-- order by animal_outs.ANIMAL_ID

-- LEFT OUTER JOIN은 왼쪽에 오는 테이블을 기준으로, 오른쪽에 오는 테이블과 비교하여 조건에 맞는 값이 있으면 JOIN하여 가져오고, 값이 없으면 null 값을 표시합니다.
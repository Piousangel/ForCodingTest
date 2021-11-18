-- 11/16 7~19까지밖에 안찍힘 -> 0~23으로 늘리는 작업해야함 다시..
-- 11/19
select date_format(datetime, '%H') as HOUR, count(animal_type) as COUNT
from animal_outs
group by HOUR having 0 <= HOUR and HOUR <= 23
order by HOUR asc
-- 9/25
select hour(datetime) as HOUR, count(datetime) as COUNT
from animal_outs
where
    hour(datetime) >= 9
    and
    hour(datetime) < 20
group by hour(datetime)
order by hour asc

-- 11/16
-- select date_format(datetime, '%H') AS hour, count(animal_id) as count
-- from animal_outs
-- group by hour having 9 <= hour and hour <= 19
-- order by hour asc
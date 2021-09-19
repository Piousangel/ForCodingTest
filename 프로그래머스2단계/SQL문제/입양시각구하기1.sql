select hour(datetime) as HOUR, count(datetime) as COUNT
from animal_outs
where
    hour(datetime) >= 9
    and
    hour(datetime) < 20
group by hour(datetime)
order by hour asc
select name, count(name) as COUNT
from animal_ins
group by name having COUNT > 1
order by name

--  9/25 11/16 11/19 3/22
-- group by having
-- select name, count(name) as Count
-- from animal_ins
-- group by name having Count > 1
-- order by name asc
-- 9/25 11/16
select count(distinct name) as count
from animal_ins
where name is not null

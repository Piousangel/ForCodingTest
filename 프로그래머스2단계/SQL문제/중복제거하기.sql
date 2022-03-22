-- 9/25 11/16 3/22
select count(distinct name) as count
from animal_ins
where name is not null

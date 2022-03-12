-- 11/19 11/24 12/5 12/11 1/12 2/7 3/12
select id, name, host_id
from places
where host_id in(
    select host_id
    from places
    group by host_id having count(host_id) > 1
)
order by id

# MySQL에서의 GROUP BY는 특정 컬럼 이름을 지정(column-names)해주면 그 컬럼의 UNIQUE한 값에 따라서 데이터를 그룹 짓고, 중복된 열은 제거됩니다. 
# HAVING은 간단하게 생각해서 GROUP BY한 결과에 조건을 붙이고 싶을때, 즉 GROUP BY의 WHERE 절과도 같다고 볼 수 있습니다.

-- select * from places
-- where host_id in(
--     select host_id
--     from places
--     group by host_id
--     having count(*) > 1
-- )
-- order by id

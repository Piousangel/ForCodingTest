-- 11/16 7~19까지밖에 안찍힘 -> 0~23으로 늘리는 작업해야함 다시..
-- 11/19
-- 쿼리문에서 로컬 변수를 활용하는 문제
-- select date_format(datetime, '%H') as HOUR, count(animal_type) as COUNT
-- from animal_outs
-- group by HOUR having 0 <= HOUR and HOUR <= 23
-- order by HOUR asc


-- 이건 처음 보는 거라... 변수 선언하는 것은 반복적으로 봐야할듯... 11/19 X3 11/22 11/24

set @hour := -1;

select (@hour := @hour+1) as HOUR,
    (select count(*)
     from animal_outs
     where HOUR(datetime) = @HOUR
    )
from animal_outs
where @hour < 23

-- SET @hour := -1; -- 변수 선언

-- SELECT (@hour := @hour + 1) as HOUR,
-- (SELECT COUNT(*) FROM ANIMAL_OUTS WHERE HOUR(DATETIME) = @hour) as COUNT
-- FROM ANIMAL_OUTS
-- WHERE @hour < 23
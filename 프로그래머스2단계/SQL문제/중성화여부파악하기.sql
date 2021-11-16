Select animal_id, name,
case
    when sex_upon_intake like '%Neutered%' or sex_upon_intake like '%Spayed%'
    then 'O'
    else 'X'
end as '중성화'
from animal_ins
order by animal_id asc

--9/25 11/16
-- %가 앞뒤로 붙으면 앞이나 뒤에 N(0포함)개의 글자가 올수있음
-- _는 _개수만큼 온다는 것
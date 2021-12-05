-- inner join 11/16 11/19 11/22 11/24 12/5
select distinct A.cart_id
from cart_products as A, cart_products as B
where A.cart_id = B.cart_id
    and (A.name = 'milk' and B.name = 'yogurt')
        order by A.cart_id

-- 조인할때 임의로 테이블을 하나더 만들어서 이러식으로 비교 할 수 있음

-- select A.cart_id
-- from cart_products as A, cart_products as B
-- where A.cart_id = B.cart_id
-- and(A.name = 'Milk' and B.name = 'Yogurt')
-- order by A.cart_id
-- inner join 11/16
select distinct A.cart_id
from cart_products as A, cart_products as B
where A.cart_id = B.cart_id
    and (A.name = 'milk' and B.name = 'yogurt')
        order by A.cart_id
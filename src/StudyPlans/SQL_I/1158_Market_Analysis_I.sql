/* Write your PL/SQL query statement below */
SELECT u.user_id buyer_id,
       to_char(u.join_date,'yyyy-mm-dd') join_date,
       count(b.item_id) orders_in_2019
FROM Users u
LEFT JOIN (SELECT *
           FROM Orders
           WHERE order_date LIKE '2019%') b ON b.buyer_id = u.user_id
GROUP BY u.user_id, to_char(u.join_date,'yyyy-mm-dd')
ORDER BY u.user_id;
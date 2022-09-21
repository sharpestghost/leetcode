/* Write your PL/SQL query statement below */
SELECT customer_number
FROM (
    SELECT customer_number, count(order_number) count
    FROM orders
    GROUP BY customer_number
    ORDER BY count(order_number) DESC
)
WHERE ROWNUM < 2;
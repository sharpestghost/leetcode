/* Write your PL/SQL query statement below */
SELECT DISTINCT to_char(sell_date, 'yyyy-mm-dd') sell_date,  COUNT(*) num_sold, listagg(product, ',') WITHIN GROUP
    (ORDER BY sell_date) products
    FROM (SELECT DISTINCT sell_date, product FROM Activities)
    GROUP BY sell_date
    ORDER BY sell_date;
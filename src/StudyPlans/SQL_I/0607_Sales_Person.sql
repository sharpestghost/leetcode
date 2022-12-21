/* Write your PL/SQL query statement below */
SELECT name FROM SalesPerson
WHERE sales_id NOT IN (
SELECT DISTINCT o.sales_id FROM Orders o
INNER JOIN Company c ON c.com_id = o.com_id
    WHERE c.name = 'RED');

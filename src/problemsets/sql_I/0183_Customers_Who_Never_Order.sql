/* Write your PL/SQL query statement below */
SELECT c.name AS Customers FROM Customers c
WHERE c.id NOT IN (SELECT o.customerId FROM Orders o )

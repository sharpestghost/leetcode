/* Write your PL/SQL query statement below */
SELECT u.name, NVL(SUM(r.distance),0) travelled_distance
FROM Users u LEFT JOIN Rides r ON r.user_id = u.id
GROUP BY u.id, u.name
ORDER BY travelled_distance DESC NULLS LAST, name
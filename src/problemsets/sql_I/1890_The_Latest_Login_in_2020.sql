/* Write your PL/SQL query statement below */
SELECT user_id, MAX(time_stamp) last_stamp
FROM Logins
WHERE extract(year FROM time_stamp) = 2020
GROUP BY user_id;

/* Write your PL/SQL query statement below */
SELECT player_id, to_char(min(event_date), 'yyyy-mm-dd') first_login
FROM Activity
GROUP BY player_id

/* Write your PL/SQL query statement below  src: https://leetcode.com/problems/rising-temperature */
SELECT today.id FROM Weather today INNER JOIN Weather yest ON yest.recordDate + 1 = today.recordDate
WHERE today.temperature > yest.temperature
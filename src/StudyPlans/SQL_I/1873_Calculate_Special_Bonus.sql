/* Write your PL/SQL query statement below  src: https://leetcode.com/problems/calculate-special-bonus/submissions/ */
SELECT employee_id,
CASE WHEN mod(employee_id, 2) = 1 AND name NOT LIKE 'M%' THEN salary ELSE 0 END as bonus FROM employees
ORDER BY employee_id asc /* or order by 1 asc */

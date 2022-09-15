/* Write your PL/SQL query statement below */
SELECT (
 SELECT salary
        FROM (SELECT DISTINCT
              salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS salary_rank
             FROM Employee)
        WHERE salary_rank = 2
    ) AS SecondHighestSalary FROM dual
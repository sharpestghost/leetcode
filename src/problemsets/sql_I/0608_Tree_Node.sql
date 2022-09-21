/* Write your PL/SQL query statement below */
SELECT id, CASE WHEN p_id IS NULL
                THEN 'Root'
                ELSE CASE WHEN id IN (SELECT DISTINCT p_id FROM Tree)
                     THEN 'Inner'
                     ELSE 'Leaf'
                     END
                END as "type"
FROM Tree;
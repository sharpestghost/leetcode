/* Write your PL/SQL query statement below */
SELECT to_char(date_id, 'yyyy-mm-dd') date_id, make_name,
        COUNT(DISTINCT lead_id) unique_leads, COUNT(DISTINCT partner_id) unique_partners
FROM DailySales
GROUP BY date_id, make_name
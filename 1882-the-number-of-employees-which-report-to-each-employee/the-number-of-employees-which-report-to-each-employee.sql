# Write your MySQL query statement below
SELECT t.employee_id,t.name,COUNT(*) AS reports_count,ROUND(AVG(age)) AS average_age FROM(SELECT e.employee_id,e.name,d.reports_to,d.age FROM 
Employees e
JOIN Employees d ON e.employee_id=d.reports_to) t GROUP BY employee_id ORDER BY employee_id;
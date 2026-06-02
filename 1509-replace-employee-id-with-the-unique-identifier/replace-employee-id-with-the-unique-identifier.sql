# Write your MySQL query statement below
SELECT n.unique_id,e.name from Employees e LEFT JOIN EmployeeUNI as n ON e.id=n.id;
# Write your MySQL query statement below
SELECT d.name as Department,e.name as Employee,e.salary as Salary FROM Employee e JOIN Department d ON e.departmentId=d.id
JOIN (SELECT departmentId,MAX(salary) as salary FROM Employee GROUP BY departmentId) t ON 
e.salary=t.salary AND e.departmentId=t.departmentId; 
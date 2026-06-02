# Write your MySQL query statement below
SELECT  name FROM  Employee e JOIN (SELECT managerId from Employee GROUP BY managerId having COUNT(*)>=5) as t ON e.id=t.managerId;
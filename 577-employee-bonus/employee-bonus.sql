# Write your MySQL query statement below
SELECT name , bonus from Employee e LEFT JOIN Bonus b ON e.empId=b.empId where b.bonus IS NULL OR b.bonus<1000;
# Write your MySQL query statement below
SELECT x,y,z,(CASE WHEN max<x+y AND max<x+z AND max<y+z THEN 'Yes' ELSE 'No' END) as triangle FROM (SELECT x,y,z,(CASE WHEN 
x>y AND x>z THEN x WHEN y>x AND y>z THEN y ELSE z  END) AS max FROM Triangle)t;
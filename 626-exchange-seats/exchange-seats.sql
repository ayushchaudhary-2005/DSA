# Write your MySQL query statement below
SELECT a.id,COALESCE(b.student,a.student) as student FROM Seat a LEFT JOIN Seat b ON ((a.id%2=1 AND a.id=b.id-1)
OR (a.id%2=0 AND a.id=b.id+1)) ORDER BY a.id; 
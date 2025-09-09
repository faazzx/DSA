# Write your MySQL query statement below
select f.name from Employee f
join Employee s
on f.id= s.managerId
group by f.id , f.name
having count(s.id)>=5;
select  a.name as employee
from employee  as a
inner join employee as b 
where a.managerId= b.id and a.salary>b.salary;
 

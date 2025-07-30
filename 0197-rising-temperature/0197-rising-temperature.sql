# Write your MySQL query statement below
select w.id from Weather w ,Weather w2 where datediff(w.recordDate , w2.recordDate) =1 and w.temperature> w2.temperature;
# Write your MySQL query statement below
select p.firstName as firstName,p.lastName as lastName,a.city as city, a.state as state from person as p
left join address as a
on p.personID = a.personID

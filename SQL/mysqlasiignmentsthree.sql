1.WAQ to display all the employee whose name and job is having  exactly 5 character.

ANS:select * from emp where fname like '_____' and job like '_____';

2.WAQ to display the employee whose job starts whith soft

ANS:select * emp where job like 'soft%';

3.WAQ to display the maximum salary for each job

ANS:select max(salary) from emp group by job; 	

4.WAQ to display the dept number along with the number of employee in working it.

ANS:select deptno, count(empID) from emp group by deptno; 

5.WAQ to display the minimum salary for each job excluding all the emp whose name ends with 's'.
	
ANS:select max(salary) from emp group by job where fname not like '%s';	

6.WAQ to display the list of emp who is working in 'admin' dept.

ANS:select * from emp e where e.deptno=(select d.deptno from dept where dname='admin');

7.WAQ to display the list of the dept names that are working in as software developer.

ANS:select dname from dept d where d.deptno=(select * from emp e where e.job='software developer');

8.WAQ to display the 2nd maximum salary.

ANS:select max(salary) from emp where salary<>(select max(salary) from emp);

9.WAQ to display the 3rd maximum salary.

ANS:select max(salary) from emp where salary<>(select max(salary) from emp where salary<>(select max(salary) from emp));

10.WAQ to display the 4th least salary.

ANS:select min(salary) from emp where salary<>(select min(salary) from emp where salary<>(select min(salary) from emp where salary<>(select min(salary) from emp)));


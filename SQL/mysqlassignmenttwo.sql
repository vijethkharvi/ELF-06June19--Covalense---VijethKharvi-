1.WAQ to display all the details of the software developer in dept 30

ans:select * from emp where job='Softwaredeveloper' and deptno='30';


2:WAQ to display the list for all the software developer in dept no 40 and having salary greater than 5000.

ans:select * from emp where job='Softwaredeveloper' and deptno='30';   


3.WAQ to display the list for all employees except those who are working in dept 10 and 20

ans:select *  from emp where deptno not IN(10,20);


4.WAQ to display list the employees who are not working as software developer and clerks in dept 10 and 20 with a salary in the range of 1000 to 3000

ans: select * from emp where job NOT IN ('softwaredevelpoer','clerk')  and sal between 1000 and 3000;


5.WAQ to display the list of employees whoose salary is not in range of 10000 to 20000 in dept 10,20,30 except all salesman

ans:select * from emp where sal not between 10000 and 20000 and deptno not in(10,20,30) and job not in('salesman');


6.WAQ to arrange all the employees by their salary in descending order;

ans:select * from emp group by sal desc;


7.WAQ to display the maximum salary, minimum salary and total salary from employee

ans:select max(sal),min(sal),sum(sal) from emp;


8.WAQ to display the list of number of software developer in department 20

ans:select count(*) from emp where job='CLERK' and deptno=20;


9.WAQ to display the list of the highest and lowest salary earned by salesman

ans: select min(sal),max(sal) from emp where job='salesman';


10.WAQ to display total salary of all departments

ans:select deptno,sum(salary) from employee group by deptno
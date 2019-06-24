1.WAQ to display the employees working in dept 20

ANS:select * from employee_details where department_no=20;

2.WAQ to display the employees earnings more than rs 2500

ANS:select * from employee_details where salary>2500;

3.WAQ to display all the employee whoose job type is softwaredeveloper

ANS:select * from employee_details where department='software engineer';

4.WAQ to display the employees working in dept 10,20 & 40

ANS:select * from employee_details where department_no=10 and department_no=20 and department_no=40;

5.WAQ to display all employees whoose name starts with 's'

ANS:SELECT * FROM employee WHERE name LIKE 'S%';

6.WAQ to display the the employees whoose first name is having letter 'L' as second character.

ANS:SELECT * FROM employee WHERE name LIKE 'S%';

7.WAQ to display the employees whoose first name is having atleast 2 'A' character.

ANS:SELECT * FROM employee WHERE Fname LIKE '%A%A%';


8.WAQ to display the employees whoose last name is having letter 'E' as the second last character.

ANS:SELECT * FROM employee WHERE Lname LIKE 'E_%';


9.WAQ to display the all employees who are having exactly 5 characters in their last name.

ANS:SELECT * FROM employee WHERE Lname LIKE '_____';


10. WAQ to display the employees whoose salary is between 20000 and 30000.

ANS:SELECT * FROM employee WHERE salary BETWEEN 20000 AND 30000;
 
 


 

 
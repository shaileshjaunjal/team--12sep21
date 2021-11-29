/* Group by clause*/
use lecture;
select sum(sal) from emp;

select sum(sal) from emp where deptno=1;

select deptno 'DEPARTMENT NO',sum(sal) from emp group by deptno;

select deptno, sum(sal) from emp;/* o/p is meaning less*/

select sum(sal) from emp group by deptno;/* it gives o/p dept column is not printing*/

select deptno 'DEPART', sum(sal) from emp where sal>7000 group by deptno;
------------------------------/*check block*/-------------------------------------------------------------------- 
select deptno 'DEPART',job,sum(sal) from emp group by deptno,job order by 1;

select job,deptno 'DEPART',sum(sal) from emp group by job,deptno;/* not showing expected o/p*/
select deptno,job,sum(sal) from emp group by job,deptno order by 2;/*we can use order by clause tu get expected output*/

------------------------/*having clause*/-----------------------------------------------------

select deptno,sum(sal) from emp group by deptno having sum(sal)>10000;
select deptno,sum(sal) from emp group by deptno having sum(sal)>17000;

----------------------- /* --order --by clause */ ---------------------------------------------

select deptno ,sum(sal) from emp group by deptno order by sum(sal);
select deptno ,sum(sal) from emp group by deptno order by 1;
select deptno ,sal from emp group by deptno order by sal;

select deptno,sum(sal) from emp group by deptno having sum(sal)>10000 order by 1;

------------------------------------------------------------------------------------------------
select sum(sal) from emp group by deptno;

select max(SUM_SAL) from (select sum(sal) SUM_SAL from emp group by deptno ) as save;
select max(SUM_SAL) from (select sum(sal) SUM_SAL from emp group by deptno ) as tempp;

/*--------------------------JOIN -----------------------------------------------------------*/
/*EQUIJOIN*/
select dname,ename from dept,emp 
where emp.deptno=dept.deptno;/*faster coz dept have lesser rows*/
select dname,ename from emp,dept 
where emp.deptno=dept.deptno;/* slower coz emp have more rows*/

select * from emp,dept
where emp.deptno=dept.deptno;/*this will print deptno table twice*/

select deptno,dname,ename from emp,dept 
where emp.deptno=dept.deptno;/*error coz name ambiguity*/

select emp.deptno,dname,ename from emp,dept 
where emp.deptno=dept.deptno;/*NO name ambiguity*/

select emp.deptno,dname,empno,ename,job,loc,sal from emp,dept 
where emp.deptno=dept.deptno;/*to print all table without repeating  deptno column*/

select dept.deptno,dname,ename from emp,dept 
where emp.deptno=dept.deptno;/*NO name ambiguity*/

select dname, ename from emp,dept 
where emp.deptno=dept.deptno
order by 1;/*1 is stand for column no*/

select dname, ename ,loc ,job,sal from emp,dept 
where emp.deptno=dept.deptno
order by 5;/*1 is stand for column no*/
--------------------------------------------
/*group by*/
select deptno,sum(sal) from emp
group by deptno;

/*Group by +  join*/
select dname, ename , sum(sal) from emp,dept
where emp.deptno= dept.deptno
group by dname;

select upper(dname), ename, sum(sal) from emp,dept
where dept.deptno=emp.deptno
group by upper(dname)
having sum(sal) >10000
order by 1;

/*Equijoin -natural join*/

select dname, ename from emp, dept
where emp.deptno=dept.deptno
order by 2;


/*Inequijoin  -Non equijoin*/

select dname,ename from emp,dept
where emp.deptno!=dept.deptno
order by 1;

/*outer join  right outer join*/
create table emp1(
empno int(4),
ename varchar(20),
sal int(4),
deptno int(4),
job varchar(5),
Mgr int(4));

insert into emp1 values(6,'Scott',6000,4,Null,Null);
select * from dept;

select dname,ename from emp1 right outer join dept
on (dept.deptno=emp1.deptno);

select dname,ename from dept right outer join emp1
on (dept.deptno=emp1.deptno);


/*left outer join*/
select dname,ename from emp1 left outer join dept
on (dept.deptno=emp1.deptno);

select dname,ename from dept left outer join emp1
on (dept.deptno=emp1.deptno);

select dname,ename from dept left outer join emp1
on (dept.deptno=emp1.deptno);

/*full join*/

select dname,ename from emp1 right outer join dept
on(emp1.deptno=dept.deptno)
union
select dname,ename from emp1 left outer join dept
on(emp1.deptno=dept.deptno);

/* Cartesian join - cross join*/

select dname,ename from emp1, dept;
select dname,ename from dept,emp1;/* this order of table makes select statement slow*/

/*Self join*/

select a.ename,b.ename from emp a, emp b /* Here aliasing is used*/
where a.mgr=b.empno;


/* join 3 or more clm*/

create table depthead(deptno int(4), dhead varchar(20));
insert into depthead values(1,'Arun'),(2,'Jack');
select * from depthead;/* our third table*/

select dname,ename,dhead from emp,dept,depthead
where emp.deptno=dept.deptno and dept.deptno=depthead.deptno;



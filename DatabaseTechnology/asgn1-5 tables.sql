use cdacmumbai;

select * from customers;

select * from orders;

select *from salespeople;

SELECT Onum, amt, date_format(odate,'%d-%b-%Y') from orders;

select * from salespeople where Snum=1001;

select city,sname,snum,comm from salespeople;	/*case doesnt matter*/

select cname,rating from customers where city='San Jose';

select distinct snum from orders;

select * from orders where amt>1000.00;

select * from salespeople where comm>0.10;

select * from customers where rating>100 and city!='Rome';
--------------------------------------------------------------------------

Select * from orders where (amt < 1000 OR NOT(odate='1990-10-03' AND cnum > 2003));

Select * from Orders where NOT ((odate = '1990-10-03' OR snum >1006) AND amt >= 1500); 

select * from salespeople;
---------------------------------------------------------------------------

select * from orders where odate='1990-10-03';
select * from orders where odate='1990-10-04';


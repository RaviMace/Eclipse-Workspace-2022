import java.util.Scanner;

class Emp1
{
String ename;
int ID;
double sal;
float deptno;
Emp1(String ename,int ID,double sal,float deptno)
{
this.ename=ename;
this.ID=ID;
this.sal=sal;
this.deptno=deptno;
}
void edet()
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Employee Name is               "+ename);
System.out.println("Employee ID is                 "+ID);
System.out.println("Employee Salary is             "+sal);
System.out.println("Employee Department Number is  "+deptno);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Employee Name ");
String ename=sc.nextLine();
System.out.println("Enter Employee ID ");
int ID=sc.nextInt();
System.out.println("Enter Employee Salary ");
double sal=sc.nextDouble();
System.out.println("Enter Employee Department Number ");
float deptno=sc.nextFloat();
sc.nextLine();

Emp1 a=new Emp1(ename,ID,sal,deptno);

System.out.println("_______________________________________");
System.out.println("Enter Employee Name ");
 ename=sc.nextLine();
System.out.println("Enter Employee ID ");
 ID=sc.nextInt();
System.out.println("Enter Employee Salary ");
 sal=sc.nextDouble();
System.out.println("Enter Employee Department Number ");
 deptno=sc.nextFloat();

Emp1 b=new Emp1(ename,ID,sal,deptno);

a.edet();
b.edet();
}
}
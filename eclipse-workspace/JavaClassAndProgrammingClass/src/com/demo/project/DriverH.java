//Parent class for Hicrarchical Inheritance
class Per
{
String name;
int age;
}
//Child class 1
class Std extends Per
{
int sid;
String stm;
Std(String name, int age, int sid, String stm)
{
this.name=name;
this.age=age;
this.sid=sid;
this.stm=stm;
}
void dStd()
{
System.out.println("Details of Students");
System.out.println("Name of the Student   "+name);
System.out.println("Age of the Student    "+age);
System.out.println("ID of the Student     "+sid);
System.out.println("Stream of the Student "+stm);
System.out.println();
}
}
//Child class 2
class Trn extends Per
{
int eid;
String desg;
double sal;
Trn(String name, int age, int eid, String desg, double sal)
{
this.name=name;
this.age=age;
this.eid=eid;
this.desg=desg;
this.sal=sal;
}
void dTrn()
{
System.out.println("Details of Trainer");
System.out.println("Name of the Trainer        "+name);
System.out.println("Age of the Trainer         "+age);
System.out.println("ID of the Trainer          "+eid);
System.out.println("Designation of the Trainer "+desg);
System.out.println("Salary of the Trainer      "+sal);
System.out.println();
}
}
//Child class 3
class Tra extends Per
{
int emid;
String fc;
double sala;
Tra(String name, int age, int emid, String fc, double sala)
{
this.name=name;
this.age=age;
this.emid=emid;
this.fc=fc;
this.sala=sala;
}
void dTra()
{
System.out.println("Details of Tracker Boy");
System.out.println("Name of the Tracker            "+name);
System.out.println("Age of the Tracker             "+age);
System.out.println("ID of the Tracker              "+emid);
System.out.println("Floor in-charge of the Tracker "+fc);
System.out.println("Salary of the Tracker          "+sala);
System.out.println();
}
}
//Main Class
class DriverH
{
public static void main(String[]args)
{
Std s=new Std("Rahul",21,1199,"SDET");
s.dStd();
Trn t=new Trn("Sruthi",45,6987,"Java Trainer for Exp",200000d);
t.dTrn();
Tra w=new Tra("Karthi",29,3498,"JSpider Building 1st floor",30000d);
w.dTra();
}
}
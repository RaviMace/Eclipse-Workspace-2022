class Student1
{
String name;
int ID;
int age;
long phno;
Student1(String name, int ID, int age, long phno)
{
this.name=name;
this.ID=ID;
this.age=age;
this.phno=phno;
}
Student1(String name, int age, long phno)
{
this.name=name;
this.age=age;
this.phno=phno;
}
Student1(String name, long phno)
{
this.name=name;
this.phno=phno;
}
void details()
{
System.out.println("*******************************");
System.out.println("Student Name is         "+name);
System.out.println("Student ID is           "+ID);
System.out.println("Student Age is          "+age);
System.out.println("Student Phone Number is "+phno);
}
public static void main(String[]args)
{
Student1 a=new Student1("Raja",25,9443685245l);
Student1 b=new Student1("Rani",2588,27,9436852450l);
Student1 c=new Student1("Rajesh",9443682405l);
Student1 d=new Student1("Ramki",2787,24,9468542020l);
Student1 e=new Student1("Roja",23,9443686756l);
a.details();
b.details();
c.details();
d.details();
e.details();
}
}
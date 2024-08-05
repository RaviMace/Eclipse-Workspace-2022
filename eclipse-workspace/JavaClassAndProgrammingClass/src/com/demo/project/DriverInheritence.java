// Parent class
class Person
{
String name;
int age;
void displayPerson()
{
System.out.println("Name of the Person is       |"+name);
System.out.println("Age of the Person is        |"+age);
}
}

// Child class
class Student extends Person
{
int sid;
Student(String name, int age, int sid)
{
this.name=name;
this.age=age;
this.sid=sid;
}
void displayStudent()
{

System.out.println();
System.out.println("After updating the data base with Student ID");
displayPerson();
//System.out.println("Name of the person is "+name);
//System.out.println("Age of the person is "+age);
System.out.println("Student ID of the person is |"+sid);
}
}

// Execution classjava
class DriverInheritence
{
public static void main(String[]args)
{
Student ob=new Student("McRoy",25,401);
ob.displayPerson();
ob.displayStudent();
}
}
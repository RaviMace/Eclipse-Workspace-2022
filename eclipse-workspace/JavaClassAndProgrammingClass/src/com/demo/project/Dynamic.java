import java.util.Scanner;

class Dynamic
{
public static void main(String[]args)
{
Scanner ob=new Scanner(System.in);

System.out.println("Enter Name");
String name=ob.nextLine();

System.out.println("Enter Age");
int age=ob.nextInt();
ob.nextLine();

System.out.println("Enter Place");
String place=ob.nextLine();

System.out.println("Enter Salary");
double salary=ob.nextDouble();

System.out.println("Enter Percentage");
float p=ob.nextFloat();

System.out.println("Enter Boolean Value");
boolean b=ob.nextBoolean();

System.out.println("Enter Single Character");
char c=ob.next().charAt(2);

System.out.println("************");
System.out.println(name);
System.out.println(place);
System.out.println(age);
System.out.println(salary);
System.out.println(p);
System.out.println(b);
System.out.println(c);
System.out.println("***********");
}
}
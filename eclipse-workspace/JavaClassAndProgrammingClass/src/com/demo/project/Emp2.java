import java.util.Scanner;

class Emp2
{
String brand;
float price;
String type;
Emp2(String brand,float price,String type)
{
this.brand=brand;
this.price=price;
this.type=type;
}
void edet()
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Brand Name      "+brand);
System.out.println("Price is        "+price);
System.out.println("Type is         "+type);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Brand Name ");
String brand=sc.nextLine();
System.out.println("Enter Price ");
float price=sc.nextFloat();
System.out.println("Enter Type ");
String type=sc.nextLine();
sc.nextLine();

Emp2 a=new Emp2(brand,price,type);

System.out.println("_______________________________________");
System.out.println("Enter Brand Name ");
 brand=sc.nextLine();
System.out.println("Enter Price ");
 price=sc.nextFloat();
System.out.println("Enter Type ");
 type=sc.nextLine();
sc.nextLine();

Emp2 b=new Emp2(brand,price,type);

a.edet();
b.edet();
}
}
class Carconst
{
String brand;
String color;
double price;
public Carconst(String b, String c, double p)
{
brand=b;
color=c;
price=p;
}
public void display()
{
System.out.println("Brand is "+brand);
System.out.println("Color is "+color);
System.out.println("Price is "+price);
}
public static void main(String[]args)
{
Carconst ob=new Carconst("Honda","White",7000000d);
Carconst c=new Carconst("BMW","Black",40000000d);
Carconst d=new Carconst("Ford","Red",180000000d);
ob.display();
c.display();
d.display();
}
}
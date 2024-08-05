class Product
{
static String Company="Horlicks";
String type;
String quantity;
float price;
public Product(String t, String q, float p)
{
type=t;
quantity=q;
price=p;
}
public void display()
{
System.out.println();
System.out.println("Company is "+Company);
System.out.println("Type is "+type);
System.out.println("Quantity is "+quantity);
System.out.println("Price is "+price);
System.out.println();
}
public static void main(String[]args)
{
Product a=new Product("Junior Horlicks","500g",450f);
Product b=new Product("Mother Horlicks","250g",350f);
Product c=new Product("Womer Horlicks","750g",999f);
Product d=new Product("Horlicks Biscut","150g",20f);
a.display();
b.display();
c.display();
d.display();
}
}
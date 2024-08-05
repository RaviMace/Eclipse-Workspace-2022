/*WJP to 
create a parent class gadget
create child class smartwatch
declr variable in parent brand price color
declr a variable in child class also
create a method for printing all the details
create driver class
create only 1 object for child class
call the method
*/

class Gadget
{
String brand;
String color;
void DGadget()
{
System.out.println("Name of the Brand  "+brand);
System.out.println("Color of the Brand "+color);
}
}

class SmartWatch extends Gadget
{
long price;
SmartWatch(String brand, String color, long price)
{
this.brand=brand;
this.color=color;
this.price=price;
}
void DSmartWatch()
{
System.out.println("After Updating");
DGadget();
System.out.println("Price of the Brand  "+price);
}
}

class DriveG
{
public static void main(String[]args)
{
SmartWatch ob=new SmartWatch("IWatch 6","Apple Watch",150000l);
SmartWatch ab=new SmartWatch("Galaxy 7","Samsung",75000l);
ob.DGadget();
System.out.println();
ob.DSmartWatch();
System.out.println();
ab.DGadget();
System.out.println();
ab.DSmartWatch();
}
} 
//G.Parent class
class Vech
{
String brand;
String color;
double price;
Vech(String brand, String color, double price)
{
this.brand=brand;
this.color=color;
this.price=price;
}
void dVech()
{
System.out.println("Brand Name is "+brand);
System.out.println("Color of the Vechicle "+color);
System.out.println("Price of the Vechicle "+price);
}
}
//Parent class
class Car extends Vech
{
String model;
Car(String brand, String color, double price, String model)
{
super(brand,color,price);
this.model=model;
}
void dCar()
{
dVech();
System.out.println("Model of the Vechicle "+model);
}
}
//Child class
class ElectricCar extends Car
{
String ChargeCap;
ElectricCar(String brand, String color, double price, String model, String ChargeCap)
{
super(brand,color,price,model);
this.ChargeCap=ChargeCap;
}
void dElectricCar()
{
dCar();
System.out.println("Charge capacity of the Vechicle "+ChargeCap);
}
}

//Main Class
class DriverMain
{
public static void main(String args[])
{
ElectricCar ob=new ElectricCar("Tata","Black",5150000d,"Nexus","860W");
ob.dElectricCar();
}
}

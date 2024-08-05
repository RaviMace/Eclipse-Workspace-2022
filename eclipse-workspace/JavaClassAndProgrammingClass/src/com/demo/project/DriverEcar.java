//Parent class
class Vec
{
String brand;
String color;
double price;
Vec(String brand,String color,double price)
{
this.brand=brand;
this.color=color;
this.price=price;
}
Vec(String brand,String color)
{
this(brand,color,0.0d);
}
void dVec()
{
System.out.println("Brand is "+brand);
System.out.println("Color is "+color);
System.out.println("Price is "+price);
}
}

//Child class
class ECar extends Vec
{
String model;
ECar(String brand,String color,double price,String model)
{
super(brand,color,price);
this.model=model;
}
ECar(double price)
{
this(null,null,price,null);
}
ECar(String brand,String color,String model)
{
this(brand,color,0.0d,model);
}
ECar(String brand)
{
this(brand,null,null);
}
void dECar()
{
dVec();
System.out.println("Model is "+model);
}
}

//Main class
class DriverEcar
{
public static void main(String[]args)
{
ECar sc=new ECar(900000d);
sc.dECar();
}
}
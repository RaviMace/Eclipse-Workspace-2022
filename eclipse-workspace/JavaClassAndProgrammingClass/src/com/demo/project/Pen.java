class Pen
{
String Brand;
String Color;
float Price;
Pen(String Brand, String Color, float Price)
{
this.Brand=Brand;
this.Color=Color;
this.Price=Price;
}
void details()
{
System.out.println("*******************");
System.out.println("Brand is "+Brand);
System.out.println("Color is "+Color);
System.out.println("Price is "+Price);
System.out.println("*******************");
}
public static void main(String[]args)
{
Pen x=new Pen("Reynolds","Black",30f);
Pen y=new Pen("Cellos","Blue",25f);
Pen z=new Pen("Flair","Red",40f);
x.details();
y.details();
z.details();
}
}
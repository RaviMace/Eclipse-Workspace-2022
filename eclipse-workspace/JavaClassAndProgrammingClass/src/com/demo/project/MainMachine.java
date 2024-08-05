/*
import java.util.Scanner;

//parent class
abstract class VendingMachine
{
abstract void Ing();
abstract void Product();
} 
//child class
class TeaV extends VendingMachine
{
void Ing()
{
System.out.println("Tea Powder");
System.out.println("Milk");
System.out.println("Sugar");
System.out.println("Boiling and Mixing");
}
void Product()
{
System.out.println("Tea is Ready");
}
}
//child class
class CoffeeV extends VendingMachine
{
void Ing()
{
System.out.println("Coffee Powder");
System.out.println("Milk");
System.out.println("Sugar");
System.out.println("Mixing (Cold Coffee)");
}
void Product()
{
System.out.println("Coffee is Ready");
}
}
//Main class
class MainVMachine
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter your choice Press 1 for Coffee (or) Press 2 for Tea : ");
int choice=sc.nextInt();
switch(choice)
{
case 1:
	{
	VendingMachine a=new TeaV();
	TeaV ob=(TeaV)a;
	ob.Ing();
	ob.Product();
	}
break;
case 2:
	{
	VendingMachine b=new CoffeeV();
	CoffeeV obj=(CoffeeV)b;
	obj.Ing();
	obj.Product();
	}
break;
default: System.out.println("Invalid Input");
}
}
}
*/


import java.util.Scanner;

//parent class
abstract class VendingMachine
{
abstract void Ing();
abstract void Product();
}
 
//child class 1
class TeaV extends VendingMachine
{
void Ing()
{
System.out.println("Tea Powder");
System.out.println("Milk");
System.out.println("Sugar");
System.out.println("Boiling and Mixing");
}
void Product()
{
System.out.println("Tea is Ready");
}
void show()
{
System.out.println("Enjoy your Tea");
}
}

//child class
class CoffeeV extends VendingMachine
{
void Ing()
{
System.out.println("Coffee Powder");
System.out.println("Milk");
System.out.println("Sugar");
System.out.println("Mixing (Cold Coffee)");
}
void Product()
{
System.out.println("Coffee is Ready");
}
void show()
{
System.out.println("Enjoy your Coffee");
}
}
//Main class
class MainVMachine
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter your choice Press 1 for Coffee (or) Press 2 for Tea : ");
int choice=sc.nextInt();
switch(choice)
{
case 1:
	{
	VendingMachine a=new TeaV();			//upcasting
	a.Ing();
	a.Product();
	TeaV ob=(TeaV)a;				//downcasting
	ob.show();
	}
break;
case 2:
	{
	VendingMachine b=new CoffeeV();
	b.Ing();					//upcasting
	b.Product();
	CoffeeV obj=(CoffeeV)b;				//downcasting
	obj.show();
	}
break;
default: System.out.println("Invalid Input");
}
}
}
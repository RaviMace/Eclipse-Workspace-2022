/* Polymorphism example programs
all five methods*/
//Variable Hiding and Shadowing
class A
{
static int a =12;
}
//
class B extends A
{
float a=85.2f;
void print()
{
int a=111;
System.out.println(a);
System.out.println(super.a);//Variable Shadowing (to shadow the child class global/local variable and to print parent class variable)
//System.out.println(A.a);
System.out.println(this.a);//Variable Hiding (to hide the local variable and to print the global variable)
}
public static void main(String []args)
{
B ob=new B();
ob.print();
System.out.println(ob.a);
//B.print();
}
}

/*
*/
//Method hiding or shadowing
class C
{
static int add()
{
int x=150,y=250,z;
System.out.println(z=x+y);
System.out.println("Parent class");
return z;
}
}
//
class D extends C
{
static int add()
{
int a=10;
int b=20;
System.out.println("Child class");
return a+b;
}
public static void main(String[]args)
{
int d=D.add();//Method Shadowing and Hiding (it hides the parent class method)
System.out.println(d);
C.add();
}
}

/*
*/
class ParentC
{
static void print(int a)
{
System.out.println(a);
}
}
//
class ChildC extends ParentC
{
static void print(int x)
{
System.out.println(x+2);
}
public static void main(String[]args)
{
ChildC.print(200);
ParentC.print(300);
}
}

/*
*/
class TestYantra //parent class
{
static void payM()
{
System.out.println("Managed by Qspider itslef");
}
}
//
class TechnoE extends TestYantra //child class
{
static void payM()
{
System.out.println("Managed by Test Yantra");
System.out.println("child company of TY");
}
}
//
class Qspiders extends TestYantra // child class
{
static void payM()
{
System.out.println("Managed by Qspiders itslef");
}
//
public static void main(String[]args)
{
Qspiders.payM();
TestYantra.payM();
TechnoE.payM();
payM();
}
}

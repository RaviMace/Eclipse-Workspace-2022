class Account
{
String AccH;
long Accno;
private int pin;
private double bal;
Account(String AccH, long Accno, int pin, double bal)
{
this.AccH=AccH;
this.Accno=Accno;
this.pin=pin;
System.out.println("Pin before changes "+pin);
this.bal=bal;
} 
public int getpin()
{
return pin;
}
public void setpin(int pin,int newpin)
{
if(this.pin == pin)
{
this.pin=newpin;
}
else
{
System.out.println("Entered pin is incorrecr");
}
}
public double getbal()
{
return bal;
}
public void setbal(double amt)
{
if(this.pin =! pin)
{
System.out.println("Balance Before credited "+bal);
bal+=amt;
System.out.println("Amount credited to your account");
}
else
{
System.out.println("Incorrect Pin");
}
}
}

class DAccount
{
public static void main(String[]args)
{
Account ob=new Account("Ravi",1110003334l,1120,50000d);
ob.setbal(10000d);
System.out.println(ob.getbal());

ob.setpin(1120,8199);
System.out.println(ob.getpin());
}
}
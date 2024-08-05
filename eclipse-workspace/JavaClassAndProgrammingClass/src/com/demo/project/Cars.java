class Car
{
String carname;
String numplate;
String engnnum;
String chsnum;
int carprice;
int yearreleased;
static String carbrand="Audi";
public void details()
{
System.out.println("Car Name is "+carname);
System.out.println("Car Number Plate is "+numplate);
System.out.println("Car Engine Number is "+engnnum);
System.out.println("Car Chase Number is "+chsnum);
System.out.println("Car Brand/Company Name is "+carbrand);
System.out.println("Car Price is "+carprice);
System.out.println("Car Year of Release is "+yearreleased);
}
public static void main(String[]args)
{
Car A = new Car();
Car Q = new Car();
A.carname="A8";
A.numplate="TN 27 H 2875";
A.engnnum="ABCD10005";
A.chsnum="EFGH20005";
A.carprice=20000000;
A.yearreleased=2010;
Q.carname="Q7";
Q.numplate="TN 27 H 3758";
Q.engnnum="ABCD50001";
Q.chsnum="EFGH70005";
Q.carprice=8000000;
Q.yearreleased=2015;
System.out.println();
A.details();
System.out.println();
Q.details();
}
}

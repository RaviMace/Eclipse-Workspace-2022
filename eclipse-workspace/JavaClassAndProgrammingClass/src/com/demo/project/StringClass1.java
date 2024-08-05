//toString method and String class
class StringC1
{
int empid;
String name;
public StringC1(int empid, String name)
{
this.empid=empid;
this.name=name;
}
public static void main(String[]args)
{
StringC1 ob1=new StringC1(1234,"Rama");
StringC1 ob2=new StringC1(4321,"Raja");
System.out.println(ob1);
System.out.println(ob2);
}
public String toString()
{
return name+" "+empid;
}
}
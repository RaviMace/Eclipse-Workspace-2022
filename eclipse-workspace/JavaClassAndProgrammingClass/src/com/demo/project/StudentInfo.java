// toString method and using Object class/Supermost class with equals method
class StudentInfo
{
int id;
String name;
StudentInfo(int id, String name)
{
this.id=id;
this.name=name;
}
public static void main(String[]args)
{
StudentInfo s1=new StudentInfo(101,"Raghu");
StudentInfo s2=new StudentInfo(102,"Ramki");
System.out.println(s1);
System.out.println(s2);
System.out.println(s1.equals(s2));
}
public String toString()
{
return name+" "+id;
}
public boolean equals(Object o)
{
StudentInfo ob=(StudentInfo)o;
if(this.id==ob.id || this.name.equals(ob.name))
  return true;
else
  return false;
}
}
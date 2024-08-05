//String class program examples

class StringC
{
String n;
public static void main(String[]args)
{
System.out.println("First Example with same reference/image");
String s1="java";
String s2="java";
System.out.println(s1);
System.out.println(s2);
System.out.println(s1==s2);

System.out.println("Second Example with different reference/image");
s1="Data Base";
System.out.println(s1);
System.out.println(s2);
System.out.println(s1==s2);
System.out.println(s1.equals(s2));

System.out.println("Third Example with same object reference/");
String ob1 = new String("BTM");
String ob2 = new String("BTM");
System.out.println(ob1);
System.out.println(ob2);
System.out.println(ob1==ob2);
System.out.println(ob1.equals(ob2));

String s=new String("Spiderman");
System.out.println(s);

StringC ob=new StringC("Spiderman");
System.out.println();
System.out.println("To print address of object reference");
System.out.println(ob);
}
StringC(String n)
{
System.out.println();
System.out.println("To print the image reference");
System.out.println(n);
}
}
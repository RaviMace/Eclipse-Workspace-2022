class Arithmetic
{
public static void main(String args[])
{
int a=100;
float k=25.8f, j=35.6f;
//int c=a+b, d=a-b, e=a*b, f=a/b, g=a%b;
float c=(k+j)+a;
System.out.println("Addition " + c);
c=k-j-a;
System.out.println("Subtraction " + c);
c=k*j*a;
System.out.println("Multiplication " + c);
c=k/j/a;
System.out.println("Division " + c);
c=k%j%a;
System.out.println("Modulas (reminder) " + c);
}
}
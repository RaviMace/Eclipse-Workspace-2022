class MethodPara
{
public static void main(String[]args)
{
int n=8;
printNum(n);
printNum(50);
}
public static void printNum(int p)
{
for(int k=1; k<=p; k++)
{
System.out.println(k);
}
}
}

class MethodPara1
{
public static void main(String[]args)
{
int stage=2;
String place="BTM";
values(place,stage);
}
public static void values(String p, int s)
{
System.out.println("Place Name  "+p);
System.out.println("Stage is  "+s);
}
}

class MethodPara2
{
public static void main(String[]args)
{
int Mark1=75, Mark2=50, Mark3=85;
values(Mark1, Mark2, Mark3);
}
public static void values(int m1, int m2, int m3)
{
int Total = m1+m2+m3;
System.out.println("Total is = "+Total);
}
}

class MethodPara3
{
public static void main(String[]args)
{
int Mark1=75, Mark2=50, Mark3=85;
int t;
values(Mark1, Mark2, Mark3);
}
public static void values(int m1, int m2, int m3)
{
int Total = m1+m2+m3;
total(Total);
}
public static void total(int Total)
{
System.out.println(Total);
}
}
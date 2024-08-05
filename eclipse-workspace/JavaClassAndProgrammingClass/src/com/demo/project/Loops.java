class Loops
{
public static void main(String[]args)
{
for(int i=1; i<=20; i++)
{
System.out.println("Learn Java");
System.out.println("Java is easy");
}
}
}

class Loops1
{
public static void main(String[]args)
{
for(int i=20; i>=1; i--)
{
System.out.println("i value is  " + i);
//System.out.println("Java is easy");
}
}
}

class Loops2
{
public static void main(String[]args)
{
for(int i=1; i<=50; i++)
{
if(i%2==0)
{
System.out.println("i value is  " + i);
//System.out.println("Java is easy");
}
}
}
}

class Loops3
{
public static void main(String[]args)
{
int a=2;
for(int i=1; i<=10; i++)
{
System.out.println(i + " * " + a + " = " + (i*a));
//System.out.println("Java is easy");
}
}
}

class Loops4
{
public static void main(String[]args)
{
for(int i=1; i<=10; i++)
{
for(int j=1; j<=10; j++)
{
System.out.println(j + " * " + i + " = " + (j*i));
}
System.out.println();
}
}
}

class Loops5
{
public static void main(String[]args)
{
int i = 1;
while(i<=10)
{
System.out.println(i + "* 3 =" + i*3);
i++;
}
}
}

class Loops6
{
public static void main(String[]args)
{
int i = 1;
do
{
System.out.println(i + "* 3 =" + i*3);
++i;
}
while(i%2==0);
}
}
class Swith
{
public static void main(String[]args)
{
int day=7;
switch(day)
{
case 1 : System.out.println("Monday");
break; 
case 2 : System.out.println("Tuesday");
break;
case 3 : System.out.println("Wednesday");
break; 
case 4 : System.out.println("Thursday");
break; 
case 5 : System.out.println("Friday");
break; 
case 6 : System.out.println("Saturday");
break;
case 7 : System.out.println("Sunday");
break;  
default : System.out.println("Invalid Entry");
}
}
}

class Swith1
{
public static void main(String[]args)
{
int month=7;
switch(month)
{
case 1 : System.out.println("Jan has 31 days");
break; 
case 2 : System.out.println("Feb has 28 days");
	 System.out.println("Feb has 29 days in every 4 years that is called Leap year");
break;
case 3 : System.out.println("Mar has 31 days");
break; 
case 4 : System.out.println("Apl has 30 days");
break; 
case 5 : System.out.println("May has 31 days");
break; 
case 6 : System.out.println("Jun has 30 days");
break;
case 7 : System.out.println("Jul has 31 days");
break;
case 8 : System.out.println("Aug has 31 days");
break;
case 9 : System.out.println("Sep has 30 days");
break; 
case 10 : System.out.println("Oct has 31 days");
break; 
case 11 : System.out.println("Nov has 30 days");
break; 
case 12 : System.out.println("Dec has 31 days");
break;    
default : System.out.println("Invalid Entry");
}
}
}

class Swith2
{
public static void main(String[]args)
{
int a=10, b=20;
int input = 6;
switch(input)
{
case 1 : System.out.println(a+b);
break;
case 2 : System.out.println(a-b);
break;
case 3 : System.out.println(a*b);
break;
case 4 : System.out.println(a/b);
break;
case 5 : System.out.println(a%b);
break;
default : System.out.println("Invalid Input");
}
}
}

class Swith3
{
public static void main(String[]args)
{
int month=7;
switch(month)
{
case 1 : 
case 3 : 
case 5 : 
case 7 : 
case 8 : 
case 10 :
case 12 : System.out.println("This Month has 31 days");
break;    
case 4 : 
case 6 : 
case 9 : 
case 11 : System.out.println("This Month has 30 days");
break; 
case 2 : System.out.println("Feb has 28 days");
	 System.out.println("Feb has 29 days in every 4 years that is called Leap year");
break;
default : System.out.println("Invalid Entry");
}
}
}

class Swith4
{
public static void main(String[]args)
{
int input = 65;
switch(input)
{
case 'A' : System.out.println(a+b);
break;
case 'B' : System.out.println(a-b);
break;
case 'C' : System.out.println(a*b);
break;
case 'D' : System.out.println(a/b);
break;
case 'E' : System.out.println(a%b);
break;
default : System.out.println("Invalid Input");
}
}
}
class Elseif
{
	public static void main(String[]args)
	{
		int m=56;
		if(m<=100 && m>90)
		{
			System.out.println("Excelent");
		}
		else if(m<=90 && m>80)
		{
			System.out.println("Very Good");
		}
		else if(m<=80 && m>70)
		{
			System.out.println("Very Good");
		}
		else if(m<=70 && m>55)
		{
			System.out.println("Good");
		}
		else if(m<=55 && m>40)
		{
			System.out.println("Legend");
		}
		else
		{
			System.out.println("Ultra Legend");
		}
	}
}

class Elseifladder
{
	public static void main(String[]args)
	{
		int m = -12;
		if(m > 0)
			{
			System.out.println("+ve");
			}
		else if(m < 0)
			{
			System.out.println("-ve");
			}
		else
			{
			System.out.println("Zero");
			}
	}
}

class Elseifladder1
{
	public static void main(String[]args)
	{
		int d=3;
		if(d==1)
		{
			System.out.println("Sunday");
		}
		else if(d==2)
		{
			System.out.println("Monday");
		}
		else if(d==3)
		{
			System.out.println("Tuesday");
		}
		else if(d==4)
		{
			System.out.println("Wednesday");
		}
		else if(d==5)
		{
			System.out.println("Thursday");
		}
		else if(d==6)
		{
			System.out.println("Friday");
		}
		else if(d==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid Entry");
		}
	}
}

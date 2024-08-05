class Increament
{
public static void main(String args[])
{
	int p1=500, p2=500, p3=500, p4=500;
	int q1=++p1, q2=p2++, q3=--p3, q4=p4-- ;
	System.out.println("Value of variable q pre-inc is  "+q1);
	System.out.println("Value of variable p pre-inc is  "+p1);
	System.out.println("Value of variable q post-inc is  "+q2);
	System.out.println("Value of variable p post-inc is  "+p2);
	System.out.println("Value of variable q pre-dec is  "+q3);
	System.out.println("Value of variable p pre-dec is  "+p3);
	System.out.println("Value of variable q post-dec is  "+q4);
	System.out.println("Value of variable p post-dec is  "+p4);
}
}
import java.util.Scanner;
import java.lang.Math;
class Quadratic
{
    public static void main (String[] args)
{ 
    double a,b,c;
    double d,r1,r2;
    Scanner in =new Scanner(System.in);
    System.out.println("enter the coeffecient of a");
    a=in.nextDouble();
    System.out.println("enter the coeffecient of b");
    b=in.nextDouble();
    System.out.println("enter the coeffecient of c");
    c=in.nextDouble();
    if(a==0)
    {
     System.out.println("not a quadratic equation");
     System.out.println("enter new non zero value of a");
     a=in.nextDouble();
    }
    
    d= b*b - 4*a*c;
    if(d==0)
    {
        r1 = (-b)/(2*a);
        System.out.println("roots are real and equal");
        System.out.println(r1);
    }
    else if (d>0)
    {
        r1 = ((-b) + (Math.sqrt(d)))/(double)(2*a);
        r2 = ((-b) - (Math.sqrt(d)))/(double)(2*a);
        System.out.println("roots are real and unequal");
        System.out.println(r1);
        System.out.println(r2);
    }
    else if (d<0)
    {
        System.out.println("Roots are imaginary");
        r1 = (-b)/(2*a);
        r2 = Math.sqrt(-d)/(2*a);
        System.out.println(r1);
        System.out.println(r2);

    }
}
}
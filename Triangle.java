import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Rabia
 */
public class Yeni {

    public static void main (String[] args)
{
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a, b, and c: ");
    int a =scan.nextInt();
    int b =scan.nextInt();
    int c =scan.nextInt();
    
    if (a+b<c||b+c<a||c+a<b)
      System.out.println("Not a triangle.");
    else
    {
      System.out.println("A triangle.");
      if (a>b&&b>c)
       System.out.println("A right triangle.");
      if (a==c)
      {
        System.out.println("An isosceles triangle.");
          if (a==b&&b==c)
            System.out.println("An equilateral triangle.");
          }
          else if (c>b&&b>a)
            System.out.println("A left triangle.");
          }
    }

}
}

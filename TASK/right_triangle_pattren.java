import java.util.*;
public class right_triangle_pattren{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=i;s++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
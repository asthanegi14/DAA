import java.util.*;

public class FiboMemoization {
    static int Max =100;
    static int[] lookup = new int[Max];

    void ini()
    {
        for(int i=0;i<Max;i++)
        {
            lookup[i]=-1;
        }
    }

    static int fibo(int n)
    {
        if(lookup[n]==-1)
        {
            if(n<=1)
            {
                lookup[n] = n;
            }
            else
            {
                lookup[n] = fibo(n-1)+fibo(n-2);
            }
        }
            return lookup[n];
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int x = sc.nextInt();
        FiboMemoization f = new FiboMemoization();
        f.ini();
        System.out.println("fibonacci number is "+fibo(x));
    }
}

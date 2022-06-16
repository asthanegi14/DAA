import java.util.Scanner;

public class FiboTabulation {
    static int fibo(int n)
    {
        int f[] = new int[n+1];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++)
        {
            f[i] = f[i-1]+f[i-2];
        }
        return f[n];
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int x = sc.nextInt();
        System.out.println("fibonacci number is "+fibo(x));
    }

}

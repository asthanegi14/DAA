import java.util.*;

public class FloydWarshall {
    public static void main(String arg[])
    {
        int[][] mat =   {{0,3,1000000,7},
                        {8,0,2,1000000},
                        {5,10000000,0,1},
                        {2,1000000,1000000,0}};
        for(int k=0;k<4;k++)
        {
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    if(mat[i][j]>mat[i][k]+mat[k][j])
                    {
                        mat[i][j]=mat[i][k]+mat[k][j];
                    }
                }
            }
        }
        System.out.println("sorest path is : ");
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

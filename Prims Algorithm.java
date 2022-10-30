import java.lang.reflect.Array;
import java.util.*;

class Node{
    int data;
    int weight;
    Node(int d,int w)
    {
        data = d;
        weight = w;
    }
    Node(){}
    int getData()
    {
        return data;
    }
    int getWeight()
    {
        return weight;
    }
}
public class PrimsAlgoShortestPath {
    static ArrayList<ArrayList<Node>> adj;
    static void path(ArrayList<ArrayList<Node>> adj, int node)
    {
        boolean mst[]= new boolean[node];
        int par[]=new int[node];
        int key[]=new int[node];

        for(int i=0;i<node;i++)
        {
            mst[i]=false;
            key[i]=10000000;
        }
        key[0]=0;
        par[0]=-1;
        for(int i=0;i<node-1;i++)
        {
            int min = 10000000,u=0;
            for(int j=0;j<node;j++)
            {
                if(mst[j]==false && key[j]<min)
                {
                    min=key[j];
                    u=j;
                }
            }
            mst[u]=true;

            for(Node k:adj.get(u))
            {
                if(mst[k.getData()]==false && key[k.getData()]>k.getWeight())
                {
                    key[k.getData()]=k.getWeight();
                    par[k.getData()]=u;
                }
            }
        }
        System.out.print("shortest path is: ");
        for(int i=1;i<node;i++)
        {
            System.out.println(par[i]+" to "+i);
        }
    }
    public static void main(String arg[])
    {
        adj = new ArrayList<ArrayList<Node>>();
        for(int i=0;i<5;i++)
        {
            adj.add(new ArrayList<Node>());
        }
        adj.get(0).add(new Node(1,2));
        adj.get(0).add(new Node(3,6));
        adj.get(1).add(new Node(0,2));
        adj.get(1).add(new Node(3,8));
        adj.get(1).add(new Node(2,3));
        adj.get(1).add(new Node(4,5));
        adj.get(2).add(new Node(1,3));
        adj.get(2).add(new Node(4,7));
        adj.get(3).add(new Node(0,6));
        adj.get(3).add(new Node(1,8));
        adj.get(4).add(new Node(1,5));
        adj.get(4).add(new Node(2,7));

        path(adj,5);
    }
}

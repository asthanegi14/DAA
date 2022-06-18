package daalab;

import java.util.*;

class NewNode{
    char c;
    int data;
    NewNode left;
    NewNode right;
}
class NewComparator implements Comparator<NewNode>{
    public int compare(NewNode x, NewNode y)
    {
        return x.data - y.data;
    }
}
public class Huffman {
    static void printCode(NewNode root, String s){
        if(root.left==null && root.right == null && Character.isLetter(root.c)){
            System.out.println(root.c+" : "+s);
            return;
        }
        printCode(root.left,s+"0");
        printCode(root.right,s+"1");

    }
    public static void main(String arg[])
    {
        char[] character= {'a','b','c','d','e','f'};
        int[] frequency = {5,9,12,13,16,45};
        int n = 6;
        PriorityQueue<NewNode> q = new PriorityQueue<NewNode>(n, new NewComparator());
        for(int i=0;i<n;i++)
        {
            NewNode a = new NewNode();
            a.c = character[i];
            a.data = frequency[i];
            a.left = null;
            a.right = null;

            q.add(a);
        }
        NewNode root = null;

        while(q.size()>1)
        {
            NewNode x = q.peek();
            q.poll();
            NewNode y = q.peek();
            q.poll();
            NewNode z = new NewNode();
            z.data = x.data + y.data;
            z.c = '=';
            z.left = x;
            z.right = y;
            root = z;
            q.add(z);
        }
        printCode(root,"");
    }
}

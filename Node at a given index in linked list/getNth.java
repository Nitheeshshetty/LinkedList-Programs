import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class nthNode
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
           GfG gfg = new GfG();
           System.out.println(gfg.getNth(head, k));
        }
    }
    
    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
                temp.next = node;
        }
    }
}

class GfG
{ 
    public static int getNth(Node node, int ind)
    {
       if(ind==1){
           return node.data;
       }
       if(node!=null && ind!=1){
            return getNth(node.next,ind-1);
       }
       return 0;
    }
}

import java.util.*;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Iterator;
   
 class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class Modular
{
   static Node head;
   public static void addToTheLast(Node node) 
   {
	if (head == null) 
	{
	    head = node;
	}
	else 
	{
	    Node temp = head;
	    while (temp.next != null)
		temp = temp.next;
		temp.next = node;
	    }
        }
    
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();	 
	while(t-- > 0)
	{
	     int n = sc.nextInt();
             int a1 = sc.nextInt();
	     Node head = new Node(a1);
	     addToTheLast(head);
	     for(int i = 1; i < n; i++)
	     {
		 int a = sc.nextInt(); 
		 addToTheLast(new Node(a));
	     }
	     int k = sc.nextInt();
	     GfG gfg = new GfG();
	     System.out.println(gfg.moduarNode(head, k));
	}
    }
}


class GfG
{
    public static int moduarNode(Node head, int k)
    {
        int res=-1,i=1;
        for(;head!=null;head=head.next){
            if(i%k==0){
                res=head.data;
            }
            i++;
        }
        return res;
    }
}

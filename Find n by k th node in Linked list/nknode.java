import java.util.*;

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

class LinkedList
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
	      System.out.println(gfg.nknode(head, k));
	  }
     }
}



class GfG
{
    public static int nknode(Node head, int k)
    {
        Node p1=head;
       Node p2=head;
       
       int p1Pos=1;
       int p2Pos=1;
       
       while(p1.next!=null){
           p1=p1.next;
           p1Pos++;
           
           int reqPos=(int)Math.ceil((1.0*p1Pos)/k);
           
           while(p2Pos<reqPos){
               p2=p2.next;
               p2Pos++;
           }
       }
       
       return p2.data;
    }
}

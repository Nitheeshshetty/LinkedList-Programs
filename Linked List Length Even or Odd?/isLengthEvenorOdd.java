import java.util.*;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
		
public class GFG2
{
    Node head;  
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
			int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
		    GFG obj=new GFG();
			int start=obj.isLengthEvenorOdd(head);
		    if(start==0)
		    System.out.println("Even");
		    else
		    System.out.println("Odd");
		}
	}
}



class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    int count=1;
	    while(head1!=null){
	        count++;
	        head1=head1.next;
	    }
	    if(count % 2 == 0)
	        return 1;
	    else
	        return 0;
	}
}

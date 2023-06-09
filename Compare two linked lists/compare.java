import java.util.*;
class Node {
    char data;
    Node next;
 
    Node(char d) 
    {
        data = d;
        next = null;
    }
}

class LinkedList_Compare
{
    Node head;	
    public void addToTheLast(Node node)
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
 
    public static void main(String args[])
    {
       	Scanner sc = new Scanner(System.in);
	int t=sc.nextInt();	 
	while(t>0)
        {
	    LinkedList_Compare llist1 = new LinkedList_Compare();
	    LinkedList_Compare llist2 = new LinkedList_Compare();
	    int n1 = sc.nextInt();	
	    int value = 0;	
	    char a1=sc.next().charAt(0);
	    Node head1= new Node(a1);
	    llist1.addToTheLast(head1);					
	    for (int i = 1; i < n1; i++) 
	    {
		char a = sc.next().charAt(0); 
		llist1.addToTheLast(new Node(a));								 
	    }	
	    int n2 = sc.nextInt();
	    char b1=sc.next().charAt(0);
	    Node head2 = new Node(b1);
            llist2.addToTheLast(head2);	 
	    for (int i = 1; i < n2; i++) 
	    {
		char b = sc.next().charAt(0); 
		llist2.addToTheLast(new Node(b));
	    }
            GfG g = new GfG();
            value = g.compare(llist1.head, llist2.head);
            System.out.println(value);
	    t--;
        }  
    }
}



class GfG
{
    int compare(Node node1, Node node2)
    {
        Node temp1=node1;
        Node temp2=node2;
        int cnt1=0,cnt2=0;
        while(temp1!=null)
	{
            cnt1++;
            temp1=temp1.next;
        }
        while(temp2!=null)
	{
            cnt2++;
            temp2=temp2.next;
        }
        if(cnt1>cnt2)
	{
            return 1;
        }
        else if(cnt1<cnt2)
	{
            return -1;
        }
        return 0;
    }
}

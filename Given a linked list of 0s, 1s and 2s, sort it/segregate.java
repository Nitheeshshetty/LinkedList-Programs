import java.util.*;
import java.lang.*;
import java.io.*;

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

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1)
	    {
		tail.next = new Node(sc.nextInt());
		tail = tail.next;
	    }   
	    head = new Solution().segregate(head);
	    printList(head);
	    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }   
}




class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        if(head==null)
            return head;
        int cnt0=0,cnt1=0,cnt2=0;
        while(head!=null)
        {
            if(head.data==0)
                cnt0++;
            else if(head.data==1)
                cnt1++;
            else
                cnt2++;
            head=head.next;
        }
        Node st=new Node(0);
        Node s=st;
        for(int i=0;i<cnt0;i++)
        {
            st.next=new Node(0);
            st=st.next;
        }
        for(int i=0;i<cnt1;i++)
        {
            st.next=new Node(1);
            st=st.next;
        }
        for(int i=0;i<cnt2;i++)
        {
            st.next=new Node(2);
            st=st.next;
        }
        head=s.next;
        return head;
    }
}



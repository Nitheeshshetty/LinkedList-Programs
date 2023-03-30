import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
    
    public static Node inputList(BufferedReader br) throws IOException
    {
        int n = Integer.parseInt(br.readLine().trim());
        String[] s = br.readLine().trim().split(" ");
        Node head = new Node(Integer.parseInt(s[0])), tail = head;
        for(int i = 1; i < s.length; i++)
            tail = tail.next = new Node(Integer.parseInt(s[i]));
        return head;
    }
    
    public static void printList(Node node)
    {
        while (true)
        { 
    		System.out.print(node.data);
    		node = node.next; 
    		if(node == null)
    		    break;
    		System.out.print(" ");
    	}  
    	System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            Node head = Node.inputList(br);
            
            Solution obj = new Solution();
            Node res = obj.moveToFront(head);
            
            Node.printList(res);
            
        }
    }
}




class Solution {
    public static Node moveToFront(Node head) {
        if(head==null || head.next==null)
            return head;
        Node cur=head;
        while(cur.next.next!=null){
            cur=cur.next;
        }
        Node front=cur.next;
        cur.next=null;
        front.next=head;
        return front;
    }
}
        

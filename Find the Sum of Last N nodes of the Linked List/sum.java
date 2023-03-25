//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    System.out.println(obj.sum(head, k));
		}
	}
}
// } Driver Code Ends


/*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public int sum(Node head, int k){
        int n = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            n+=1;
        }
        for(int i=0; i<n-k; i++){
            head = head.next;
        }
        int sum = 0;
        while(head != null){
            sum+=head.data;
            head= head.next;
        }
        return sum;
    }
}

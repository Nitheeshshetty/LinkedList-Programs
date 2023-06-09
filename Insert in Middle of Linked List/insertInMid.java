import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();   
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            Solution obj = new Solution();
            obj.insertInMid(head, key);
            display(head);
            System.out.println();
        }
    }
    
    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}



class Solution 
{
    public Node insertInMid(Node head, int data)
    {
        Node newNode = new Node(data);
        Node temp = head;
        int n = 0;
        while(temp!=null)
        { 
            temp = temp.next;
            n++;
        }
        int i = 0;
        Node curr = head;
        while(i<((n+1)/2)-1)
        {
            curr = curr.next;
            i++;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
}

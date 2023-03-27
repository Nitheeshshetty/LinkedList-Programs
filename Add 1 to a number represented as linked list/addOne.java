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
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            Node head = new Node( s.charAt(0) - '0' );
            Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}



class Solution
{
    public static Node addOne(Node head) 
    { 
        Node rev=reverse(head);
        Node tempRev=rev;
        int carry=1;
        while(carry==1&&tempRev!=null){
            int sum=tempRev.data+carry;
            carry=0;
            if(sum==10){
                tempRev.data=0;
                carry=1;
            }
            else{
                tempRev.data=sum;
            }
            
            tempRev=tempRev.next;
        }
        
        if(carry==1){
            Node newNode=new Node(1);
            Node ans=reverse(rev);;
            newNode.next=ans;
            ans=newNode;
            return ans;
        }
        
        Node ans=reverse(rev);
        return ans;
    }
    
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}

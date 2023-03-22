import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }
}



class MyStack 
{
    StackNode top;
    void push(int a) 
    {
       StackNode n = new StackNode(a);
       n.next = top;
       top = n;
    }
    int pop() 
    {
        if(top!=null){
           StackNode temp = top;
           top = top.next;
           temp.next = null;
           return temp.data;
        }
        return -1;
    }
}

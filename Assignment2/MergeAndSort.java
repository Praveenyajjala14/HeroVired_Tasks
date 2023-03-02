import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class MergeAndSort
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head1=null,tail1=null;
        Node head2=null,tail2=null;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            Node nn=new Node(d);
            a.add(nn.data);
            if(head1==null)
            {
                head1=nn;
                tail1=nn;
            }
            else
            {
                tail1.next=nn;
                tail1=nn;
            }
        }
        int m=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            int d=sc.nextInt();
            Node nn=new Node(d);
            a.add(nn.data);
            if(head2==null)
            {
                head2=nn;
                tail2=nn;
            }
            else
            {
                tail2.next=nn;
                tail2=nn;
            }
        }
        Collections.sort(a);
        Node res=null,ta=null;
        for(int i: a)
        {
            Node nn=new Node(i);
            if(res==null)
            {
                res=nn;
                ta=nn;
            }
            else
            {
                ta.next=nn;
                ta=nn;
            }
        }
        while(res!=null)
        {
            System.out.print(res.data+" ");
            res=res.next;
        }
        sc.close();
    }
}

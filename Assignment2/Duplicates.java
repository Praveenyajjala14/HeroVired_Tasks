import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class Duplicates
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node h=null,t=null;
        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            Node nn=new Node(d);
            if(h==null)
            {
                h=nn;
                t=nn;
            }
            else{
                t.next=nn;
                t=t.next;
            }
        }
        Node res=null,ta=null;
        ArrayList<Integer> a=new ArrayList<>();
        while(h!=null)
        {
            if(!a.contains(h.data))
            {
                a.add(h.data);
                Node nn=new Node(h.data);
                if(res==null)
                {
                    res=nn;
                    ta=nn;
                }
                else{
                    ta.next=nn;
                    ta=nn;
                }
            }
            h=h.next;
        }
        while(res!=null)
        {
            System.out.print(res.data+" ");
            res=res.next;
        }
        sc.close();
    }
}
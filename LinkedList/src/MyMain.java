import java.util.LinkedList;
import java.util.Queue;

public class MyMain {
    public static class LinkNode
    {
        int val;
        LinkNode next;
        public LinkNode(int val)
        {
            this.val=val;
        }
    }
    public static boolean hasCycle(LinkNode head)
    {
        LinkNode fast=head;
        LinkNode slow=head;
        while (fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }
    public static LinkNode CycleNode(LinkNode head)
    {
        Queue<LinkNode> q=new LinkedList<>();
        LinkNode cur=head;
        q.offer(cur);
        while (cur.next!=null)
        {
            cur=cur.next;
            if(q.contains(cur))
            {
                return cur;
            }
            q.offer(cur);
        }
        System.out.println("出错");
        return head;
    }


    public static void main(String[] args) {
        LinkNode n1= new LinkNode(1);
        LinkNode n2= new LinkNode(2);
        LinkNode n3= new LinkNode(3);
        LinkNode n4= new LinkNode(4);
        LinkNode n5= new LinkNode(5);
        LinkNode n6= new LinkNode(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n4;

        boolean b=hasCycle(n1);
        System.out.println(b);

        LinkNode nn=CycleNode(n1);
        System.out.println(nn.val);








    }
}

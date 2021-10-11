import java.util.LinkedList;
import java.util.Queue;
// 最小深度 bfs
public class LC111 {
    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int value){
            this.value=value;
        }
    }
    public static int  minDepth(Node root){
        Queue<Node> q=new LinkedList();
        q.offer(root);
        int n=1;
        while (!q.isEmpty())
        {
            int l=q.size();
            for(int i=0;i<l;i++)
            {
                Node cur= q.poll();
                if (cur.left==null &&cur.right==null)
                {
                    return n;
                }
                if(cur.left!=null)
                {
                    q.offer(cur.left);
                }
                if(cur.right!=null)
                {
                    q.offer(cur.right);
                }


            }
            n++;
        }
        return n;

    }

    public static void main(String[] args) {
        Node n1=new Node(3);
        Node n2=new Node(9);
        Node n3=new Node(20);
        Node n4=new Node(15);
        Node n5=new Node(7);
        n1.left=n2;
        n1.right=n3;
        n3.left=n4;
        n3.right=n5;

        int res=minDepth(n1);




        System.out.println(res);
    }
}

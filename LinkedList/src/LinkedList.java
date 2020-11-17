public class LinkedList {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    ListNode head;
    ListNode tail;
    int size;

    //========================================================================
    //初始化空链表
    public LinkedList(){
        head=null;
        tail=null;
        size=0;
    }
    //========================================================================
    //插入数字
    public void insert(int position,int number){
        if(position>size){
            return;
        }
        ListNode newNode=new ListNode(number);
      if(position==0){
          newNode.next=head;
          head=newNode;
          if(tail==null){
              tail=newNode;
          }
          size++;
      }
      else if(position==size){
          if(tail==null){
              tail=newNode;
          }
          else {
              tail.next=newNode;
              tail=newNode;
          }
          size++;

      }
      else {
          ListNode curNode=head;
          for(int i=0;i<position-1;i++){
              curNode=curNode.next;//通过head开始，找到位于position的节点，并赋值给curNode
          }

          ListNode temp=curNode.next;
          curNode.next=newNode;
          newNode.next=temp;
          size++;
      }

    }
    //根据插入的方法，也就是初始化的算法，可知这里的head就是第一个节点，与其他节点都是一样的。
    //=================================================================
    //删除数字所在的节点
    public void delete(int number){
        //查找num所在的位置
        if(head.val==number){
            //删除头节点
            head=head.next;
            return;
        }
        ListNode cur=head;
        while(cur.next.val!=number){
            cur=cur.next;
            if(cur.next==null)
            {
                System.out.println("未找到");
                return ;
            }
        }
        cur.next=cur.next.next;
        return;




    }

    //===================================
    public int search(int number){
        //查找num所在的位置
        ListNode cur=head;
        int index=0;
        while(cur.val!=number){
            cur=cur.next;
            index++;
            if(cur==null)
            {
                return -1;
            }
        }
        return index;

    }
    public void updata(int oldValue,int newValue){
        //先找到对应的节点，然后更新数据

        ListNode cur=head;
        while(cur.val!=oldValue){
            cur=cur.next;
            if(cur==null)
            {
                return ;
            }
        }
        cur.val=newValue;
        return ;

    }
    //========================================================================
    //打印链表
    public void printList(){
        ListNode cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;//通过指针遍历链表，指针的移动
        }
        System.out.println();
    }

}

public class BST {
    static class TreeNode{
        public int value;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int value){
            this.value=value;
        }
    }
    private TreeNode root;
    public TreeNode get(int key){
        TreeNode cur=root;
        while (cur!=null && cur.value!=key){
            if(key<cur.value){
                cur=cur.left;
            }
            else if (key> cur.value){
                cur=cur.right;
            }
        }
        return cur==null?null:cur;
    }
    //二叉树，排序的插入方式
    public void insert(int key){
        if(root==null){
            root =new TreeNode(key);
            return;
        }
        TreeNode cur=root;
        TreeNode par=null;
        while (true){
            par=cur;
            if(par.value>key){
                cur=par.left;
                if(cur==null){
                    par.left=new TreeNode(key);
                    return;
                }}
                else if (par.value<key){
                    cur=par.right;
                    if(cur==null){
                        par.right=new TreeNode(key);
                        return;
                    }
                }
                else {
                    return;
                }
            }
        }

        //满二叉树的插入方式，用-1 代表空
        public void insertM(int key)
        {
            if(root==null)
            {
                root=new TreeNode(key);
                return;

            }
            TreeNode cur=root;



        }

    }





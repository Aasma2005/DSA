class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
class BinaryTree{
    int index=-1;

    TreeNode ConstructBT(int nodeArr[]){
        index++;
        if(index==-1){
            return null;
        }
        TreeNode newNode=new TreeNode(nodeArr[index]);
        newNode.left=ConstructBT(nodeArr);
        newNode.right=ConstructBT(nodeArr);
        return newNode;
    }
    //PREORDER
    void preOrderBT(TreeNode root){
        if(root==null)
        return;
        System.out.println(root.data+" ");
        preOrderBT(root.left);
        preOrderBT(root.right);
    }
    //INORDER
    void InorderBT(TreeNode root){
        if(root==null) 
            return;
            InorderBT(root.left);
            System.out.println(root.data+" ");
            InorderBT(root.right);
        
    }
    //POSTORDER
    void PostorderBT(TreeNode root){
        if(root==null) 
            return;
            PostorderBT(root.left);
            PostorderBT(root.right);
            System.out.println(root.data+" ");
        
    }
    public static void main(String[] args) {
        int nodeArr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};

        BinaryTree bt=new BinaryTree();
        TreeNode root=bt.ConstructBT(nodeArr);

        System.out.println("PreOrderTree");
        bt.preOrderBT(root);

        System.out.println("InOrderTree");
        bt.InorderBT(root);

        System.out.println("PostOrderTree");
        bt.PostorderBT(root);

        System.out.println();
        
    }
}



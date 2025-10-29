import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class BinaryTree{
    Scanner sc=new Scanner(System.in);

    Node ConstructBT(){
        System.out.println("Enter data for node");
        int data=sc.nextInt();

        Node newNode=new Node(data);

        //Left Side Node
        System.out.println("do you want to enter node at leftside"+newNode.data);
        char leftNode=sc.next().charAt(0);
        if(leftNode=='Y' || leftNode=='Y'){
            newNode.left=ConstructBT();
        }

        //right Side Node
        System.out.println("do you want to enter node at Rigth side"+newNode.data);
        char rightNode=sc.next().charAt(0);
        if(rightNode=='Y' || rightNode=='Y'){
            newNode.right=ConstructBT();
        }
        return newNode;
    }
    //PREORDER
    void preOrderBT(Node root){
        if(root==null)
        return;
        System.out.println(root.data+" ");
        preOrderBT(root.left);
        preOrderBT(root.right);
    }
    //INORDER
    void InorderBT(Node root){
        if(root==null) 
            return;
            InorderBT(root.left);
            System.out.println(root.data+" ");
            InorderBT(root.right);
        
    }
    //POSTORDER
    void PostorderBT(Node root){
        if(root==null) 
            return;
            PostorderBT(root.left);
            PostorderBT(root.right);
            System.out.println(root.data+" ");
        
    }
    public static void main(String[] args) {
        Node root=null;
        BinaryTree bt=new BinaryTree();
        root=bt.ConstructBT();

        System.out.println("PreOrderTree");
        bt.preOrderBT(root);

        System.out.println("InOrderTree");
        bt.InorderBT(root);

        System.out.println("PostOrderTree");
        bt.PostorderBT(root);

        System.out.println();
        
    }
}
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
     
    public static void main(String[] args) {
        Node root=null;
        BinaryTree bt=new BinaryTree();
        root=bt.ConstructBT();
        System.out.println(root.data);
        System.out.println(root.left);
        System.out.println(root.right);
    }
}
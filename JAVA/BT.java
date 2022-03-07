class Node
{
    int key;
    Node left,right;
    public Node(int data)
    {
        key=data;
        left=right=null;
    }
}
class BT
{

    Node root;
    static void printInorder(Node node)
    {
        if(node==null)
        {return;}
        
        System.out.println(node.key);
        printInorder(node.left);
        printInorder(node.right);

    }
    public static void main(String args[])
    {
        BT tree=new BT();
        tree.root= new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        printInorder(tree.root);
        
    }
}
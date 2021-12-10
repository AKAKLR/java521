class  Node{
    public  char val;
    public  Node left;
    public  Node right;
    public Node(char val){
        this.val=val;
    }
}
public class TestBinaryTree {
    public Node creatTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left=F;
        C.right=G;
        E.right=H;
        return A;
    }
    void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val+"");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val+"");
        inOrderTraversal(root.right);
    }
    void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val+"");
    }
    static int size = 0;
    void getSize1(Node root){
        if(root==null){
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);

    }
    int getSize2(Node root){
        if (root==null){
            return 0;
        }
        return getSize2(root.left)+getSize2(root.right)+1;
    }
    static int leafSize = 0;
    void getLeafSize1(Node root){
        if(root==null){
            return;
        }
      if(root.right==null&&root.left==null){
          leafSize++;
      }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    int getLeafSize2(Node root){
        if(root==null){
            return 0;
        }
        if(root.right==null&&root.left==null){
           return 1;
        }
       int val=getLeafSize2(root.left)+getSize2(root.right);
        return  val;
    }
    int getKLevelSize(Node root,int k){
        if(root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        int val=getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
        return  val;


    }


}
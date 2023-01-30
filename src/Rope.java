public class Rope {
    Node root;

    public Rope(){

    }

    public void New (String str){
        Node newNode = new Node(str);
        Node tmpRoot = new Node();

        tmpRoot.right = newNode;
        tmpRoot.left = root;


    }

}

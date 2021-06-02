public class NodeTree {
    private NodeTree left, right;
    private int data;

    public NodeTree(){
        left = null;
        right = null;
        data = 0;
    }

    public NodeTree(int _n){
        left = null;
        right = null;
        data = _n;
    }

    NodeTree GetLeft(){
        return left;
    }

    NodeTree GetRight(){
        return right;
    }

    void SetRight(NodeTree _right){
        right = _right;
    }

    void SetLeft(NodeTree _left){
        left = _left;
    }

    void SetData(int _data){
        data = _data;
    }

    int GetData(){
        return data;
    }

}

public class Node {
    private int data;
    private Node next;

    public Node(){
        next = null;
        data = 0;
    }

    public Node(int _n, Node _node){
        data = _n;
        next = _node;
    }

    public void SetNext(Node _next){
        next = _next;
    }

    public Node GetNext() {
        return next;
    }

    public void SetData(int _n){
        data = _n;
    }

    public int GetData(){
        return data;
    }
}

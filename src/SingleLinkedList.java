import java.io.PipedOutputStream;

public class SingleLinkedList {
    protected Node root;

    public SingleLinkedList(){
        root = null;
    }

    public SingleLinkedList(Node n){
        root = n;
    }

    public void Add(int _data){
        Node newNode = new Node();
        newNode.SetData(_data);
        if(root == null)
            root = newNode;
        else{
            Node pointer = root;
            while(pointer.GetNext() != null){
                pointer = pointer.GetNext();
            }

            pointer.SetNext(newNode);
        }
    }

    public void Remove(){
        if(root == null){
            System.out.println("List is empty");
        }
        else if(root.GetNext() == null)
            root = null;
        else{
            Node pointer = root, prePointer = root;
            pointer = pointer.GetNext();

            while(pointer.GetNext() != null) {
                prePointer = pointer;
                pointer = pointer.GetNext();
            }

            prePointer.SetNext(null);
        }
    }

    public void Print(){
        if(root != null){
            Node pointer = root;

            while(pointer != null){
                System.out.print(pointer.GetData() + " - ");
                pointer = pointer.GetNext();
            }

        }
        System.out.println("*");
    }
}

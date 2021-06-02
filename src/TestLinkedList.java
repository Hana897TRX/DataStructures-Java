public class TestLinkedList {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.Add(2);
        linkedList.Add(1);
        linkedList.Add(7);

        linkedList.Print();
        linkedList.Remove();
        linkedList.Print();
        linkedList.Remove();
        linkedList.Remove();
        linkedList.Print();
        linkedList.Add(20);
        linkedList.Add(23);
        linkedList.Print();
    }
}

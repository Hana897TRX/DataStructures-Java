public class SingleLinkedListTest {
    public static void main(String[] args){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.Add(2);
        singleLinkedList.Add(1);
        singleLinkedList.Add(7);

        singleLinkedList.Print();

        singleLinkedList.Remove();

        singleLinkedList.Print();

        singleLinkedList.Remove();
        singleLinkedList.Remove();

        singleLinkedList.Print();

        singleLinkedList.Add(20);
        singleLinkedList.Add(23);

        singleLinkedList.Print();
    }
}

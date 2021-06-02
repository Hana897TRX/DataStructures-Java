import java.util.Iterator;
import java.util.LinkedList;

public class Linky {
    public static void main(String[] args){
        //LinkedList<String> linky = new LinkedList<String>();
        LinkedList<Integer> linky = new LinkedList<Integer>();

        //linky.add("Rob");
        //linky.add("Alex");
        //linky.add("Jose");

        linky.add(6);
        linky.add(78);
        linky.add(1);

        for(int i = 0; i < linky.size(); i++){
            System.out.println(linky.get(i));
        }

        //linky.remove();
        System.out.println(linky);

        Iterator it = linky.iterator();

        while (it.hasNext()){
            if((int)it.next() == 78){
                System.out.println("We found 78");
                break;
            }
            else{
                System.out.println("Your number is not here");
            }
        }

    }
}

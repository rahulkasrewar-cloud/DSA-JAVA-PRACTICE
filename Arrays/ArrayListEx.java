
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         // SYNTEX

         ArrayList <Integer> list = new ArrayList<>(5);

         list.add(45);
         list.add(67);
         list.add(78);
         list.add(98);
         list.add(23);

     //    System.out.println(list.contains(45));
    //     System.out.println(list);
         
         list.remove(2);
         System.out.println(list);

         in.close();
    }
    
}

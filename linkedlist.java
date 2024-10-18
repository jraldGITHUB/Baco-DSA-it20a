
import java.util.LinkedList;
public class linkedlist {

    public static void main(String[] args) {
               LinkedList<Integer> numbers = new LinkedList<>();
               
               
              numbers.add(3);
       numbers.addFirst(7);
      numbers.add(6);
        numbers.addLast(10);
      numbers.add(2,2);
   

         System.out.println("Linked List Original: " + numbers);
        System.out.println("Size: "+ numbers.size());
        
           boolean containsnum = numbers.contains(2);
        System.out.println(containsnum);
        
       numbers.removeFirst();
       numbers.removeLast();
          numbers.remove();
       
       
       
             System.out.println("Linked List Removed: " + numbers);
        
        
      
        
        

    }
    
}
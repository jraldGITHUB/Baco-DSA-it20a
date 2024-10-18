import java.util.LinkedList;
import java.util.Queue;

public class queue {

    
    public static void main(String[] args) {
        // Creating a queue using a LinkedList
        Queue<String> queue = new LinkedList<>();

        queue.add("tawin");
        queue.add("yelz");
        queue.add("tintin");
        
        
   System.out.println("Remaining elements in the queue: " + queue);
          
          
           String firstElement = queue.poll(); 
        String secondElement = queue.poll(); 
         String thirdelement = queue.poll(); 
        
        
  System.out.println("Remove elements in the queue: " + queue);
  
  queue.offer("do diether");
  queue.offer("bobords");
    queue.offer("bogarts");
    
    
    while (!queue.isEmpty()){
        System.out.println(queue.poll());
    }
    }
    
}
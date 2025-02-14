import java.util.*;
public class hashmap { 
    public static void main(String[] args) {
    //HashMap  
    HashMap<String,String> map = new HashMap<>(); // Creation
       
    map.put("TN","Tamilnadu"); // Insertion
    map.put("KA","Karnataka");
    map.put("KL","Kerala");
        
    System.out.println(map.get("TN")); // Search 
    System.out.println(map.get("KA"));
    System.out.println(map.get("KL"));
    System.out.println(map.get("MA"));
    
    System.out.println(map.get("AP")); // get
    System.out.println(map.getOrDefault("AP","Not Found")); // getOrDefault 
      
    for(String key : map.keySet())  {   // Traversal
      System.out.println(key+" "+map.get(key));
    }
      
    System.out.println(map.containsKey("AP")); 
    System.out.println(map.containsValue("Tamilnadu"));   
       
      
    System.out.println(map.keySet());  
    System.out.println(map.values());
      
    map.remove("KL");   // remove
    map.remove("TN"); 
    map.remove("KA");    
      
    System.out.println(map.size());   // size()
    System.out.println(map.isEmpty());  // isEmpty()
  }
}   
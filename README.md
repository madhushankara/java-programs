# java-programs

```
public class Main {
    public static void main(String[] args) {
        
        int[] array = (2,4,7,9,12);
        int oddcount = 0, int evencount = 0;  
        
        for (int i : array) {
            if (i%2 == 0){
                evencount++;
            }
            else {
                oddcount++;
            }
        }
        
        int[] evenarray = new int [evencount];
        int[] oddarray = new int [oddcount];

        int oddindex = 0, evenindex = 0;
        System.out.println("OddArray: ");
        for (int num : evenarray) {
            System.out.println(num +" ");    
        }
        System.out.println();
        
        System.out.println("EvenArray: ");
        for (int num : oddarray) {
            System.out.println(num +" ");    
        }
       
    }
}
```

``` 
public class Main {
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5};
        int sum = 0, product = 1;
        
        for(int i = 0;i < array.length;i++) {
            sum = sum + array[i];
            product = product * array[i];    
        }
        System.out.println("Sum: " + sum + "Product: "+ product);
    }
}
```
``` 
public class Main {
    public static void main(String[] args) {
        
        int[] array = {2,3,2,1,6,7,2};
        int count = 0;
        int target = 1;
        
        for(int i = 0;i < array.length;i++) {
            if(target == array[i]){
            count++;   
            }    
        }
        System.out.println("Number of Occurnces: " + count);
    }
}
``` 
```
public class Main {
    public static void main(String[] args) {
        //unique & duplicate elements in an array
        int[] array = {1,2,4,3,5,3,8,8,8,9};
        int[] freq = new int[101];
        
        for(int i = 0;i < array.length;i++) {
            int val = array[i];
            freq[val]++;   
        }   
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Occurs: " + freq[i]);       
        }
    }
}
```
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; 
    }
}
```
```
public class Main { 
    public static void main(String[] args) {
    //second largest     

    int[] arr = {2,4,7,9,12,26,18};
    int max = 0;
    int nextmax = 0;
        
    for (int i = 0;i < arr.length;i++) {
        if (arr[i] > max) {
            nextmax = max;
            max = arr[i];
        }
        else if (arr[i] > nextmax && arr[i] < max) {
            nextmax = arr[i];
        }
    } 
    System.out.println("Second Largest: "+ nextmax);    
  }
}   
```
```
import java.util.*;
public class Main { 
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
```





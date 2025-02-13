# java-programs

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
 













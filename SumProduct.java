public class SumProduct {
        public static void main(String[] args) {
            
            int[] array = {1,2,3,4,5};
            int sum = 0, product = 1;
            
            for(int i = 0;i < array.length;i++) {
                sum = sum + array[i];
                product = product * array[i];    
            }
            System.out.println("Sum: " + sum + " Product: "+ product);
        }
    }
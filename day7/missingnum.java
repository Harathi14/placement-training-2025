public class missingnum {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; 
        int expectedSum = n * (n + 1) / 2; 
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum; 
    }
     public static void main(Str9ing[] args) {
        
    }
        int[] input = {1, 2, 3, 5}; 
        int missing = findMissingNumber(input);
        System.out.println("Missing number: " + missing); 
    }
}


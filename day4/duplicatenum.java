public java.util.Hash Set;

public class duplicatenum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3};
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        Hash Set<Integer> seen = new HashSet<>();
        Hash Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}
 {
    
}

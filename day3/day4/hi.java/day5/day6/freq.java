public class freq {
    public static void main(String[] args) {
        int arr[] = {1,5,2,3,4,5};
        int cpy[] = new int[6];

        for (int i = 0; i < cpy.length; i++) {
            cpy[arr[i]]++; //cpy[5]++
        }
        for (int i = 0; i < cpy.length; i++) {
            if (cpy[i]>1){
                System.out.println(i+" ");
            }
        }
    }
}

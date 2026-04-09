public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 40, 30, 20, 50, 70, 80};
        int sum = 0;

        for(int i = 0; i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("The sum of the array element is "+sum);
    }
}

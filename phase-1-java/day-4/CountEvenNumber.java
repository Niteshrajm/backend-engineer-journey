public class CountEvenNumber {
    public static void main(String[] args) {
        int[] arr = {80, 40, 50, 60, 90, 21, 41, 59, 67, 79, 89};
        int evenCount = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
        }
        System.out.println("The even count number is "+evenCount);
    }
}

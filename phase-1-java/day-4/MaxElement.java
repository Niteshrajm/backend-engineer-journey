public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {90, 40, 30, 50, 60, 20, 10};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element is "+max);
    }
}

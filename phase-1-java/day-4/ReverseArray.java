public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 56, 67, 54, 43, 23};
        int[] revArr = new int[arr.length];
        int index = 0;
        for (int i=arr.length -1; i>=0; i--){
            revArr[index] = arr[i];
            index++;
        }
        for(int i=0; i<revArr.length; i++) {
            System.out.println(revArr[i]);
        }
    }
}

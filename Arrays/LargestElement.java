public class LargestElement{
    public static void main(String[] args) {
        int[] arr = {10,5,8,78,90,2};
        int max = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element: " + max);
    }
}
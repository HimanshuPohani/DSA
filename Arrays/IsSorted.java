public class IsSorted{
    public static void main(String[] args) {
        int[] arr = {1,2,4,58,60};
        boolean isSorted = true;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                isSorted = false;
                break;
            }


        }
        if(isSorted){
            System.out.println("The array is sorted.");
        }else{
            System.out.println("The array is not sorted");
        }
    }}

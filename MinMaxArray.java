public class MinMaxArray {
    public static void main(String[] args){
        int arr[] ={65,3,4,1000,500};
        int min =arr[0];
        int max =arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
System.out.println(min);
        System.out.println(max);
    }
}

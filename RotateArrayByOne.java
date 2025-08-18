public class RotateArrayByOne {
    public void rotate(int[] arr){
        int n=arr.length;
        int last = arr[n-1];

        for(int i=n-1;i>0;i--){
            // 2 3 4 5
            //5 2 3 4
            arr[i]= arr[i-1];

        }
        arr[0] = last;
    }

public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5};
    RotateArrayByOne s = new RotateArrayByOne(); // ✅ correct class name
    s.rotate(arr);
    for(int num:arr){
        System.out.println(num + "");
    }
}}

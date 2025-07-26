public class secondlargestaarray {
    public static int findSecondLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
           return(max2);

    }

public static void main(String args[]) {
    int[] arr = {12, 45, 1, 10};
    int secondLargest = findSecondLargest(arr);
    if (secondLargest != -1) {
        System.out.println("Second Largest Element: " + secondLargest);
        }
    }
}

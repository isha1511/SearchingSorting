import java.util.Arrays;
import java.util.Scanner;

public class RecBinarySearch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter array elements: ");
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter target element: ");
            int target = sc.nextInt();

            Arrays.sort(arr);
            int res = recBinarySearch(arr, target,0,arr.length);

            if(res != -1) {
                System.out.println("Element found at index: " + res);
            } else {
                System.out.println("Element not found");
            }
        }

        public static int recBinarySearch(int[] arr, int target,int start,int end) {

            if (start <= end) {
                int mid = start+ (end - start) / 2;

                if (arr[mid] == target)
                    return mid;

                if (arr[mid] > target)
                    return recBinarySearch(arr, target, start,mid - 1 );

                return recBinarySearch(arr,target,mid+1,end);
            }
            return -1;
        }
}

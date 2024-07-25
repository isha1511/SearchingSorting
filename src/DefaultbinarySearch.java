import java.util.Arrays;
import java.util.Scanner;

public class DefaultbinarySearch {

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

        int res = Arrays.binarySearch(arr,target);

        if (res >= 0)
            System.out.println(
                    target + " found at index = " + res);
        else
            System.out.println(target + " Not found");

    }
}

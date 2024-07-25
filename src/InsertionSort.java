import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before sorting");

        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }

        for(int i=1;i<arr.length;i++){

            int j = i-1;
            int key = arr[i];

            while(j >= 0 && arr[j] > key){

                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("After sorting");

        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }
}

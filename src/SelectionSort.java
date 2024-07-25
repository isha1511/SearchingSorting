import java.util.Scanner;

public class SelectionSort {

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

        int minIndex;
        int temp;

        for(int i=0;i<arr.length-1;i++){

            minIndex=i;
            for(int j=i+1;j<arr.length;j++) {

                if (arr[minIndex] > arr[j]) {

                    minIndex = j;
                }
            }
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

        }

        System.out.println("After sorting");

        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }
}

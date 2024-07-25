import java.util.Scanner;

public class BubbleSort {

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
        int temp=0;
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;

                }
            }
            if(swapped==false){
                break;
            }
        }

        System.out.println("After sorting");

        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }
}

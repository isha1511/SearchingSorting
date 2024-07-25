import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter target element");
        int target=sc.nextInt();

        int res=linearSearch(arr,target);

        if(res != -1){
            System.out.println("Element found at index: "+res);

        }else{

            System.out.println("Element not found");
        }
    }
    public static int linearSearch(int arr[],int target){

        for(int i=0;i<arr.length;i++){

            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

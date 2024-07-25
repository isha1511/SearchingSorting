import java.util.Scanner;

public class MergeSort {

    public static void merge(int[] arr, int l,int mid,int r){

        int n1=mid-l+1;
        int n2=r-mid;

        int[] lArr=new int[n1];
        int[] rArr=new int[n2];

        for(int i=0;i<n1;i++){
            lArr[i]=arr[l+i];
        }

        for(int j=0;j<n2;j++){

            rArr[j]=arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i < n1 && j < n2){

            if(lArr[i] <= rArr[j]){

                arr[k]=lArr[i];
                i++;
            }else{

                arr[k]=rArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=lArr[i];
            i++;
            k++;
        }

        while(j<n2){

            arr[k]=rArr[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] arr,int l,int r){

        if(l < r){

            int mid=(l+r)/2;

            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            merge(arr,l,mid,r);
        }
    }
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

        mergeSort(arr,0,arr.length-1);

        System.out.println("After sorting");

        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }

    }
}

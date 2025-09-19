package Array;
import java.util.*;

class LinearSearch{

    public static void main(String args[]){
        boolean present=false;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        n= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the element at index "+i);
            arr[i]= sc.nextInt();
        }
        int key;
        System.out.println("Enter the target to find");
        key= sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==key){
                present=true;
            }
        }
    if(present){

        System.out.println("Target has found at index");
    }else{
        System.out.println("Target not found");
    }
}
}
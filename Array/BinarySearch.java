package Array;
public class  BinarySearch{
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=5;

        int start=0;
        int last=arr.length-1;

        while(start<=last){
            int  mid =(start+last)/2;
            if(mid==target){
                System.out.println("Target found at index "+mid);
                break;
            }else if(target<mid){
                last=mid-1;
            }else{
                start=mid+1;
            }

        }
    }
}
import java.util.*;
public class twopointer {
    public static void main(String[] args) {
        int arr[]={1,-2,3,4,-5,8,-11,13};
        int a[]=new int[arr.length];
        int left=0;int right=arr.length-1;
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[right]<0){
                a[p]=arr[right];
                p++;
                right--;
            }else {
                right--;
            }
        }
        for(int i=p+1;i<arr.length;i++){
            if(arr[left]>=0){
                a[i]=arr[left];
                p++;
                left++;
            }else{
                left++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

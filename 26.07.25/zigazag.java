import java.util.Arrays;
public class zigazag {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row=arr.length;
        int col=arr[0].length;
        int n=col*row;
        int a[]=new int[row*col];
        boolean flag=true;
        int r=0,c=0;int i=0;
        while(i<n){
            a[i++]=arr[r][c];
            if(flag){
                if(c==col-1){
                    r++;
                    flag=false;
                }else if(r==0){
                    c++;
                    flag=false;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(r==row-1){
                    c++;
                    flag=true;
                }else if(c==0){
                    r++;
                    flag=true;
                }else{
                    r++;
                    c--;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

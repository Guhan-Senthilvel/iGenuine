import java.util.Arrays;
public class snakematrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int a[]=new int[9];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i%2==0){
                    a[k]=arr[i][j];
                    k++;
                }else{
                    a[k]=arr[i][(arr[i].length-1)-j];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

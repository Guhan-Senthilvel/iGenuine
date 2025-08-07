public class matrix {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int l=arr.length;
        int m=2,n=3;
        int a[][]=new int[m][n];
        if(m*n==l){
            int k=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=arr[k];
                    k++;
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

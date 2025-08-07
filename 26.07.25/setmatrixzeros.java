public class setmatrixzeros {
    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    int k=0;
                    while(k<arr.length){
                        arr[i][k]=-1;
                        arr[k][j]=-1;
                        k++;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

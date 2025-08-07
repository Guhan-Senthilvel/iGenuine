public class workout {
    public static void main(String[] args) {
        try{
            int[] num={1,2,3};
            int b=10/0;
            int a =num[3];
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("FInally block runs here");
        }
        System.out.println("out of try catch block");
    }
}

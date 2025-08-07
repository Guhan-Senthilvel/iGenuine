public class workout2 {
    public static void main(String[] args) {
        try {
            checkEven(5);
        } catch (Exception e) {
            System.out.println("Caught Exception : "+e.getMessage());
        }
    }

    private static void checkEven(int i) throws Exception{
        if(i%2!=0){
            throw new Exception("Not an even number");
        }
        System.out.println("Even number");
    }
}

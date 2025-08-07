public class Stackswap {
private int[] stack;
    private int top;
    private int maxSize;
    public Stackswap(int size){
        stack=new int[size];
        maxSize=size;
        top=-1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return top;
        }
        return stack[top--];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
            
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return top;
        }
        return stack[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top ==  maxSize-1;
    }

    public static void main(String[] args) {
        Stackswap s=new Stackswap(5);
        s.push(34);
        s.push(3);
        s.push(31);
        s.push(98);
        s.push(23);
        s.display();
        System.out.println();
        Stackswap res=new Stackswap(5);
        while(!s.isEmpty()){
            s.pop();
            int temp=s.peek();
            if(s.pop()<temp){
                res.push(s.pop());
            }else{
                res.push(s.peek());
            }
        }
        res.display();
    }
}

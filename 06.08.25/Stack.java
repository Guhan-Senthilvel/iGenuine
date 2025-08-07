
public class Stack {
    private int[] stack;
    private int top;
    private int maxSize;
    public Stack(int size){
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
        Stack s=new Stack(5);
        s.push(6);
        s.push(8);
        s.push(9);
        s.push(11);
        s.push(4);
        s.display();
        System.out.println();
        Stack s1=new Stack(5);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.display();
        System.out.println();
        Stack output=new Stack(5);
        // for(int i=5-1;i>=0;i--){
        //     output.push(s.stack[i]+s1.stack[i]);
        // }
        
        while(!s.isEmpty() && !s1.isEmpty()){
            int v1=s.pop();
            int v2=s1.pop();
            output.push(v1+v2);
        }

        output.display();


    }
}

public class Stack {
    int arr[];
    int top;
    int capacity;

    Stack(int capacity){
        this.capacity=capacity;
        arr = new int[capacity];
        top = -1;
    }

    boolean isFul(){
        return top +1 == capacity;
    }
    boolean isEmpty(){
        return top == -1;
    }

    void push(int x){
        if(isFul()){
            System.out.println("Over Flow!!");
        }
        else{
            top++;
            arr[top] = x;
            System.out.println("Insrting :"+x);
        }
    }  

    void pop(){
        if(isEmpty()){
            System.out.println("Stack empty!!");
        }
        else{
            System.out.println("Removing..."+arr[top]);
            top--;
        }
    }
    void printStack(){
        System.out.println("Printing stack");
        for(int i=0; i<=top; i++){
            System.out.println(arr[i]);
        }
    }
    void size(){
        System.out.println("Size :"+(top+1));
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.isFul();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.pop();
        
        stack.printStack();
        stack.size();
        
    }
}

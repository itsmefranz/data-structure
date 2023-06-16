public class StackBasic {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackBasic(int size) {
    maxSize = size;
    stackArray = new int[maxSize];
    top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Unable to push element.");
        } else {
            top++;
            stackArray[top] = value;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Unable to pop element.");
        } else {
            top--;
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public static void main(String args[]) {
    StackBasic stack = new StackBasic(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.println("Top element: " + stack.peek());
    stack.pop();
    System.out.println("Top element: " + stack.peek());
    } 
}
import java.util.Scanner;

class Stack {
    int top;
    int size;
    int[] stack;

    
    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    
    void push(int item) {
        if (top == size - 1) {
            System.out.println("Stack Overflow! Cannot push " + item);
        } else {
            stack[++top] = item;
            System.out.println(item + " pushed into stack");
        }
    }

    
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No element to pop");
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }

    
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack s = new Stack(size);

        int choice;
        do {
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int item = sc.nextInt();
                    s.push(item);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}

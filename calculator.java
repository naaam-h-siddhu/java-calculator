import java.util.Scanner;
public class calculator{

    public static int adder(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char op = sc.next().charAt(0);
        switch (op){
            case '+':
                System.out.println(adder(a,b));
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Please enter the valid character");
        }
    }
}
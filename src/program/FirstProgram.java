package program;

public class FirstProgram {


    public static void calc(int a, int b, char operator){
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Что-то пошло не так, повторите заново");
                break;
        }
    }


    public static void main(String[] args) {
        calc(4, 2, '/');
    }
}
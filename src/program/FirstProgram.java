//package program;

//public class FirstProgram {


//    public static void calc(int a, int b, char operator){
//        switch (operator) {
//            case '+':
//               System.out.println(a + b);
//                break;
//            case '-':
//                System.out.println(a - b);
//                break;
//            case '*':
//               System.out.println(a * b);
//                break;
//            case '/':
//                System.out.println(a / b);
//                break;
//            default:
//                System.out.println("Что-то пошло не так, повторите заново");
//                break;
//       }
//    }


//    public static void main(String[] args) {
//        calc(4, 2, '/');
//    }
//}

package program;
public class FirstProgram {
    public static void main(String[] args) {
        int a;
        int b;
        double c = 0;
        char operator;
        Scanner scanObject = new Scanner(System.in);
        System.out.println("Введите первую цифру");
        a = scanObject.nextInt();
        System.out.println("Введите вторую цифру");
        b = scanObject.nextInt();
        System.out.println("Какое действие?");
        operator = scanObject.next().charAt(0);

        switch (operator) {
            case '+': c = a + b; break;
            case '-': c = a - b; break;
            case '*': c = a * b; break;
            case '/': c = a / b; break;
            default:
                System.out.println("Введите корректный оператор (+, - , * , /)");break;
        }
        System.out.println(a+" "+operator+" "+b+" = "+c);
    }
}
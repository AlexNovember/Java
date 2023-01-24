import java.util.Scanner;

/*Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 n! (произведение чисел от 1 до n)*/

// public class work1 {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);
//         System.out.print("Введите число: ");
//         int a = Scanner.nextInt();
//         Scanner.close();
//         System.out.println("Треугольное число = " + Triangle(a));
//         System.out.println("N! = " + Factorial(a) + "\n");
//     }

//     public static int Triangle(int num) {
//         if (num == 1) {
//             return 1;
//         }
//         return Triangle(num - 1) + num;
//     }
    
//     public static int Factorial(int num) {
//         int result = 1;
//         for (int i = 1; i <= num; i++) {
//         result = result * i;
//         }
//         return result;
//     }
// }

/*Вывести все простые числа от 1 до 1000*/

// public class work1 {
// public static void main(String[] args) {
//     int x, y;
//     for (x = 1; x <1001; x++) {
//         y = 0;
//         for (int i = 1; i <= x; i++) {
//             if (x % i == 0)
//                 y++;
//         }
//         if (y <= 2)
//             System.out.print(x + " ");

//     }
// }



/* }Реализовать простой калькулятор 
(пользователь вводит 2 числа и вводит операцию
 (+ - / *). int a ; int b; String op (op!=”Stop”); (char != ’b’)*/


public class work1 {
    public static void main(String[] args) {
      int num1;
      int num2;
      int ans;
      char op;
      Scanner reader = new Scanner(System.in);
      
      while (true) {
        
         
      System.out.print("Введите две цифры: " + "\n");
      num1 = reader.nextInt();
      num2 = reader.nextInt();
      System.out.print("\nВведите операцию(+, -, *, /) или любой другой символ для выхода: ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:;
            return;
       
      }
      System.out.print("\nРезультат оперции:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans + "\n");
   }
}
}
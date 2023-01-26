import java.io.IOException;
// import java.lang.System.Logger;
import java.util.Scanner;
import java.util.logging.*;


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
// Добавить логирование

public class hwork1 {
    public static void main(String[] args) throws IOException {
      int num1;
      int num2;
      int ans;
      char op;
      
      Logger logger = Logger.getLogger(hwork1.class.getName());
      
      FileHandler fh = new FileHandler("log.txt");
      
      logger.addHandler(fh);


      // XMLFormatter xml = new XMLFormatter();
      SimpleFormatter sFormat = new SimpleFormatter();
      fh.setFormatter(sFormat);

      try (Scanner reader = new Scanner(System.in)) {
         while (true) {
           
            
         System.out.print("Введите две цифры: " + "\n");
         num1 = reader.nextInt();
         logger.log(Level.INFO,"Ввели 1 цифру " + num1);
         num2 = reader.nextInt();
         logger.log(Level.INFO,"Ввели 2 цифру " + num2);
         System.out.print("\nВведите операцию(+, -, *, /) или любой другой символ для выхода: ");
         op = reader.next().charAt(0);
         logger.log(Level.INFO,"Ввели знак " + op);

         switch(op) {
            case '+': ans = num1 + num2;
            logger.log(Level.INFO,"Результат " + ans);
               break;
            case '-': ans = num1 - num2;
            logger.log(Level.INFO,"Результат " + ans);
               break;
            case '*': ans = num1 * num2;
            logger.log(Level.INFO,"Результат " + ans);
               break;
            case '/': ans = num1 / num2;
            logger.log(Level.INFO,"Результат " + ans);
               break;
            default:
            logger.log(Level.INFO,"Выход");
               return;
          
         }
         
         System.out.print("\nРезультат оперции:\n");
         System.out.printf(num1 + " " + op + " " + num2 + " = " + ans + "\n");
         
  }
      }

   }

}

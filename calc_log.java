import java.io.IOException;
// import java.lang.System.Logger;
import java.util.Scanner;
import java.util.logging.*;



public class calc_log {
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
           System.out.print("Введите операцию(+, -, *, /) или любой другой символ для выхода:\n");
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
           
           System.out.print("Результат оперции:\n");
           System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
           System.out.println("\n");
    }
        }
  
     }
  
  }
  


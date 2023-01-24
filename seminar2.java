import java.util.Scanner;

// public class seminar2 {
   
//     public static Scanner iScanner = new Scanner(System.in);
    
    
        
    // System.out.print("Введите число: ");
        // int N = iScanner.nextInt();
        // String c1 = "Oleg";
        // String c2 = "Vasya";
        // String res = "";
        // for (int i = 0; i < N; i++) 
        //     res = (i%2==0) ? res+c1 : res+c2;
        // System.out.println(res);
       
//         String name = "aaaabbb4cddad4";
//         System.out.println(CompresString(name));
//     }

//     public static String CompresString(String name) {
//         String res = "";
//         for (int i = 0; i < name.length(); i++) {
//             if (res.indexOf(name.charAt(i))==-1) res+=name.charAt(i);
//         } 
//         return res;  
//     }
// }
public class seminar2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("шалаш")); // true
        System.out.println(isPalindrome("ротор")); // true
        System.out.println(isPalindrome("мотор")); // false
    }
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }

}
4
5
6
7
8
9
10
11
12
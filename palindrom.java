public class palindrom {
           public static void main(String[] args) {
            System.out.println(isPalindrome("шалаш")); // true
            System.out.println(isPalindrome("мотор")); // false
        }
    
        public static boolean isPalindrome(String str) {
            return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
        }
    }


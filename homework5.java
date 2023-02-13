import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
// import java.util.stream.Collectors;
import java.util.TreeMap;

/*1) Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов.*/


// public class homework5 {

//     // печать всего телефонного справочника
//     public static void printTD(HashMap<String, String> mapa) {
//         for (Map.Entry<String, String> entry : mapa.entrySet()) {
//             System.out.printf("Контакт: %s, номер телефона: %s\n", entry.getValue(), entry.getKey());
//         }
//     }

//     // печать по контакту
//     public static void printTD(HashMap<String, String> mapa, String name) {
        
//         for (Map.Entry<String, String> entry : mapa.entrySet()) {

//             if (entry.getValue().equals(name)) {
//                 System.out.printf("Контакт: %s, номер телефона: %s\n", entry.getValue(), entry.getKey());
//             }
//         }
//     }
//     public static void main(String[] args) {
//         HashMap<String, String> telephoneDirectory = new HashMap<>();

//         telephoneDirectory.put("89998884564", "Alex");
//         telephoneDirectory.put("88886664441", "Masha");
//         telephoneDirectory.put("12345678910", "Oleg");
//         telephoneDirectory.put("98345242300", "Petr");
//         telephoneDirectory.put("96545612300", "Alex");
//         telephoneDirectory.put("98741232300", "Masha");

//         System.out.println("Telephone Book");
//         printTD(telephoneDirectory);
//         System.out.println();
    
//         Scanner Scanner = new Scanner(System.in);
//         System.out.print("Введите наименование контакта для поиска : ");
//         String a = Scanner.next();
//         Scanner.close();
//         printTD(telephoneDirectory, a);
//         System.out.println();
//     }
// }

/*2) Пусть дан список сотрудников:Иван Иванов и т.д.
Написать программу, которая найдет и выведет повторяющиеся 
имена с количеством повторений. 
Отсортировать по убыванию популярности.8*/

// public class homework5 {
//     public static void main(String[] args) {
// List<String> lst = new ArrayList<String>();

// lst.add("Иван Иванов");
// lst.add("Петр Петров");
// lst.add("Иван Иванов");
// lst.add("Федр Федоров");
// lst.add("Дарья Фролова");
// lst.add("Петр Петров");
// lst.add("Петр Петров");

// System.out.println(lst);

// Map<String, Integer> mp = new HashMap<String, Integer>();

// Set<String> unique = new HashSet<>(lst);
// for (String key : unique) {
//     mp.put(key, Collections.frequency(lst, key));
// }
// mp.entrySet().stream()
//         .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//         .forEach(System.out::println);
// }
// }

// 3) Реализовать алгоритм пирамидальной сортировки (HeapSort).

// public class homework5 {
//     public void sort(int arr[])
//     {
//         int N = arr.length;
 
       
//         for (int i = N / 2 - 1; i >= 0; i--)
//             heapify(arr, N, i);
 
//         for (int i = N - 1; i > 0; i--) {
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;
 
//             heapify(arr, i, 0);
//         }
//     }
 
//     void heapify(int arr[], int N, int i)
//     {
//         int largest = i; // самый большой
//         int l = 2 * i + 1; // лево = 2*i + 1
//         int r = 2 * i + 2; // право = 2*i + 2
 
//         // лево
//         if (l < N && arr[l] > arr[largest])
//             largest = l;
 
//         // право
//         if (r < N && arr[r] > arr[largest])
//             largest = r;
 
//         if (largest != i) {
//             int swap = arr[i];
//             arr[i] = arr[largest];
//             arr[largest] = swap;
 
//             heapify(arr, N, largest);
//         }
//     }
 
//     static void printArray(int arr[])
//     {
//         int N = arr.length;
 
//         for (int i = 0; i < N; ++i)
//             System.out.print(arr[i] + " ");
//         System.out.println();
//     }
 
//     public static void main(String args[])
//     {
//         int arr[] = { 12, 11, 13, 5, 6, 7 };
//         int N = arr.length;
//         System.out.print("Исходный массив: ");
//         printArray(arr);
 
//         // Function call
//         homework5 ob = new homework5();
//         ob.sort(arr);
 
//         System.out.print("Отсортированный массив: ");
//         printArray(arr);
//     }
// }

// 4) *На шахматной доске расставить 
// 8 ферзей так, чтобы они не били друг друга.


public class homework5 {
    
        static int[] chessboard = {0,0,0,0,0,0,0,0};
        static int index = 0;
        static int version = 0;
    
        public static void main(String[] args){
    
            do {
                if (checking()){
                    if (index == 7) {
                        System.out.println(version++ + " [0]=" + chessboard[0] + " [1]=" + chessboard[1] + " [2]=" + chessboard[2] + " [3]=" + chessboard[3] + " [4]=" + chessboard[4] + " [5]=" + chessboard[5] + " [6]=" + chessboard[6] + " [7]=" + chessboard[7]);
                        chessboard[index]++;
                    }
                    else {
                        index++;
                    }
                }
                else {
                    chessboard[index]++;
                }
            } while (chessboard[0]<8);
        }
    
        static boolean checking() {
            int i;
    
            if (index == 0) {
                return true;
            }
    
            if (chessboard[index]>7){
                chessboard[index] = 0;
                index--;
                return false;
            }
    
            for (i=0;i<index;i++){
                if ((chessboard[index] == chessboard[i])|((Math.abs(chessboard[index] - chessboard[i])) == (index-i))){
                    return false;
                }
            }
    
            return true;
       }
}

// import java.util.Arrays;
 
// class Main
// {
//     // Функция для проверки, угрожают ли два ферзя друг другу или нет
//     private static boolean isSafe(char[][] mat, int r, int c)
//     {
//         // возвращаем false, если два ферзя делят один и тот же столбец
//         for (int i = 0; i < r; i++)
//         {
//             if (mat[i][c] == 'Q') {
//                 return false;
//             }
//         }
 
//         // вернуть false, если два ферзя делят одну и ту же диагональ ``
//         for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
//         {
//             if (mat[i][j] == 'Q') {
//                 return false;
//             }
//         }
 
//         // вернуть false, если два ферзя делят одну и ту же диагональ `/`
//         for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++)
//         {
//             if (mat[i][j] == 'Q') {
//                 return false;
//             }
//         }
 
//         return true;
//     }
 
//     private static void printSolution(char[][] mat)
//     {
//         for (char[] chars: mat) {
//             System.out.println(Arrays.toString(chars).replaceAll(",", ""));
//         }
//         System.out.println();
//     }
 
//     private static void nQueen(char[][] mat, int r)
//     {
//         // если `N` ферзей расставлены успешно, выводим решение
//         if (r == mat.length)
//         {
//             printSolution(mat);
//             return;
//         }
 
//         // помещаем ферзя на каждую клетку в текущем ряду `r`
//         // и повторяться для каждого допустимого движения
//         for (int i = 0; i < mat.length; i++)
//         {
//             // если никакие два ферзя не угрожают друг другу
//             if (isSafe(mat, r, i))
//             {
//                 // ставим ферзя на текущую клетку
//                 mat[r][i] = 'Q';
 
//                 // повторить для следующей строки
//                 nQueen(mat, r + 1);
 
//                 // возвращаемся назад и удаляем ферзя с текущей клетки
//                 mat[r][i] = '–';
//             }
//         }
//     }
 
//     public static void main(String[] args)
//     {
//         // Шахматная доска `N × N`
//         int N = 8;
 
//         // `mat[][]` отслеживает положение дам в
//         // текущая конфигурация
//         char[][] mat = new char[N][N];
 
//         // инициализируем `mat[][]` с помощью `-`
//         for (int i = 0; i < N; i++) {
//             Arrays.fill(mat[i], '–');
//         }
 
//         nQueen(mat, 0);
//     }
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;


// Реализовать алгоритм сортировки слиянием

// public class homework3 {
//     public static void main(String[] args) {
//         int[] array1 = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43 };
//         int[] result = mergesort(array1);
//         System.out.println(Arrays.toString(result));
//     }
 
//     public static int[] mergesort(int[] array1) {
//         int[] buffer1 = Arrays.copyOf(array1, array1.length);
//         int[] buffer2 = new int[array1.length];
//         int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
//         return result;
//     }
 
//     public static int[] mergesortInner(int[] buffer1, int[] buffer2,
//             int startIndex, int endIndex) {
//         if (startIndex >= endIndex - 1) {
//             return buffer1;
//         }
        
//         int middle = startIndex + (endIndex - startIndex) / 2;
//         int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
//         int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);
        
//         int index1 = startIndex;
//         int index2 = middle;
//         int destIndex = startIndex;
//         int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
//         while (index1 < middle && index2 < endIndex) {
//             result[destIndex++] = sorted1[index1] < sorted2[index2]
//                     ? sorted1[index1++] : sorted2[index2++];
//         }
//         while (index1 < middle) {
//             result[destIndex++] = sorted1[index1++];
//         }
//         while (index2 < endIndex) {
//             result[destIndex++] = sorted2[index2++];
//         }
//         return result;
//     }
// }



/*Пусть дан произвольный список целых чисел, 
удалить из него четные числа"*/


class homework3 {
    public static void main(String[] args) {
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.print("Измененный массив: ");
        System.out.println(get(Arrays.asList(1,2,3,4,5,6,7,8,9,10))); 
    }        

    static List<Integer> get(List<Integer> integers){
        Map<Boolean, List<Integer>> map = integers.stream()
             .collect(partitioningBy(x -> x % 2 == 0, toList()));
        return map.get(map.get(false).size() % 2 == 0);
    }
}



/*Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее ариф из этого списка.*/

// public class homework3 {
//     public static void main(String[] args) {
        
        
//         ArrayList<Integer> list = new ArrayList<>();
//         // list.add(12);
//         // list.add(21);
//         // list.add(115);
//         // list.add(7);

// FillRandom(list);
// System.out.println(list);
// System.out.println("Максимальное: " + Collections.max(list));
// System.out.println("Минимальное: " + Collections.min(list));
// System.out.println("Среднее: " + Average(list));
//     }


// public static void FillRandom(ArrayList<Integer> list) {
//     Random random = new Random();
//     int min = 1;
//     int max = 9;
//     for (int i = 1; i < max; i++) {
//         int rand = random.nextInt(min, max);
//         list.add(rand);
//     }
// }

// static int Average (ArrayList<Integer> list) {
//     int sum = 0;
//     for(int i=0;i<list.size();i++) {
//         sum+=list.get(i);
//     }
//     return sum/list.size();
// }
// }






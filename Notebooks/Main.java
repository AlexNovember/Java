import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows11", 60000, "HP"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", 75000, "Asus"));
        set.add(new Notebook("Notebook 3", 32, "Linux", 85000, "Lenovo"));
        set.add(new Notebook("Notebook 4", 64, "Windows11", 90000, "Lenovo"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}
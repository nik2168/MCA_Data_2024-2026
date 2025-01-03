import java.util.ArrayList;
import java.util.List;

public class NameSort {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Nik");
        list.add("Arun");
        list.add("Sam");

        list.sort(null);

        System.out.println(list);

     }
}

// output
// [Arun, Nik, Sam]
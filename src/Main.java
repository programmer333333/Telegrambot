import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(5);
        List<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>(arrayList1 );
        System.out.println(arrayList1);
        System.out.println(arrayList3);

    }
}
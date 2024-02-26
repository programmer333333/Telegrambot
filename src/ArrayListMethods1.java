import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {


        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Andrey");
        arrayList1.add("Aleksey");
        arrayList1.add("Valya");
        arrayList1.add(1, "Misha");
        System.out.println(arrayList1);
        for (String k : arrayList1) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println(arrayList1.get(2));
        arrayList1.set(1, "Sergey");
        for (String k : arrayList1) {
            System.out.print(k + " ");
        }



        arrayList1.remove(0);
        System.out.println(arrayList1);
    }
}
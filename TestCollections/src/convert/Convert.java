package convert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Convert {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        List<Integer> arrayList = new ArrayList<>();
        //Array --> ArrayList
        for (Integer index : arr1) {
            arrayList.add(index);
        }
        System.out.println(arrayList);
        //ArrayList --> Array
        Object[] arr2 = arrayList.toArray();
        for (Object object : arr2) {
            System.out.print(object + " ");
        }
        System.out.println();
        //Reverse
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        //Replace
        System.out.println("Mảng sau khi update phẩn tử thư 3");
        arrayList.set(2, 90);
        System.out.println(arrayList);
    }
}

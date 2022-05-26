package fa.training.dsa.unit02;

import java.util.LinkedList;
import java.util.Scanner;

import static fa.training.dsa.unit02.Linked_List.merge;

public class DSASA0206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        System.out.println("Nhap mang 1");
        for(int i = 0; i<3;i++){
            System.out.println("Nhap phan tu thu ["+ (i+1)+"]");
            list1.add(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("Nhap mang 2");
        for(int i = 0; i<3;i++){
            System.out.println("Nhap phan tu thu ["+ (i+1)+"]");
            list2.add(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("Ket qua: " + merge(list1,list2));
    }
}

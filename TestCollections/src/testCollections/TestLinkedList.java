package testCollections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestLinkedList {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        //nhap mang
        for(int i = 0; i<10;i++){
            System.out.println("Nhap phan tu thu ["+ (i+1)+"]");
            linkedList.add(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println(linkedList);
        //in
        System.out.println("Phan tu dau tien: "+ linkedList.getFirst());
        System.out.println("Phan tu cuoi cung: "+ linkedList.getLast());
        //them dau
        System.out.println("Danh sach sau khi them 1 phan tu vao dau danh sach: ");
        linkedList.addFirst(10);
        System.out.println(linkedList);
        //them cuoi
        System.out.println("Danh sach sau khi them 1 phan tu vao cuoi danh sach: ");
        linkedList.addLast(11);
        System.out.println(linkedList);
        //tim kiem
        System.out.println("Nhap so can tim: ");
        int numberSearch = Integer.parseInt(scanner.nextLine());
        if(linkedList.contains(numberSearch)){
            System.out.println("So can tim co trong danh sach");
        }else {
            System.out.println("So can tim KHONG co trong danh sach");
        }
        //update
        System.out.println("Danh sach sau khi UPDATE phan tu so 2: ");
        linkedList.set(2,55);
        System.out.println(linkedList);
        //xoa
        System.out.println("Danh sach sau khi xoa nhieu phan tu: ");
        linkedList.remove(5);
        System.out.println(linkedList);
    }

}

package com.company;

import java.util.Scanner;

public class FindValue {

    public static void main(String[] args) {
	// write your code here
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("nhap vao ten muon tim");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int tem = findValue(name,students);
        if(tem>=0){
            System.out.printf("hoc sinh %s tai vi tri %d",name,tem+1);
        } else {
            System.out.println("not found !");
        }

    }
    public static int findValue(String name,String[] arr){
        for (int i = 0; i< arr.length;i++) {
            if (arr[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}

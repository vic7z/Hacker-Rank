package com.vi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println((A.equals(new StringBuilder(A).reverse().toString())) ? "Yes" : "No");

    }
}






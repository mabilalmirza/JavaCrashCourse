package com.bilmir.util;

import java.util.Scanner;

public class TablePrinter {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Table of : ");
    int table = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
      int result = table * i;
      System.out.printf("%d * %d = %d%n", table, i, result);
    }

  }

}

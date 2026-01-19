package org;

import java.util.Scanner;

public class Arrays {

  static final int[] arr = new int[5];
  static final Scanner in = new Scanner(System.in);
  static final int n = arr.length;
  static int choice = 0;

  @Override
  public String toString() {
    return "Arrays []";
  }

  public static void main(final String[] args) {
    System.out.println("enter 5 elements");
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    while (choice <= 0 || choice > 4) {
      System.out.println("choose 1. for insertion sort");
      System.out.println("choose 2. for selection sort");
      System.out.println("choose 3. for bubble sort");
      System.out.println("choose 4. for all");
      choice = in.nextInt();
    }
    switch (choice) {
      case 1:
        insertionSort();
        break;
      case 2:
        selectionSort();
        break;
      case 3:
        bubbleSort();
        break;
      case 4:
        insertionSort();
        selectionSort();
        bubbleSort();
        break;
    }
    choice = 0;
    while (choice <= 0 || choice > 2) {
      System.out.println("enter 1. for linear search");
      System.out.println("enter 2. for binary search");
      choice = in.nextInt();
    }
    switch (choice) {
      case 1:
        linearSearch();
        break;
      case 2:
        binarySearch();
        break;
    }
  }

  static void linearSearch() {
    System.out.println("Enter the element to search:");
    final int key = in.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        System.out.println("Element found at index " + (i + 1));
        return;
      }
    }
    System.out.println("Element not found");
  }

  static void binarySearch() {
    System.out.println("Enter the element to search:");
    final int key = in.nextInt();
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      final int mid = (low + high) / 2;
      if (arr[mid] == key) {
        System.out.println("Element found at index " + (mid + 1));
        return;
      } else if (arr[mid] < key) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    System.out.println("Element not found");
  }

  static void bubbleSort() {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          final int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println("Sorted array using bubble sort:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void insertionSort() {
    for (int i = 1; i < arr.length; i++) {
      final int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
    System.out.println("Sorted array using insertion sort:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void selectionSort() {
    for (int i = 0; i < arr.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      final int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
    System.out.println("Sorted array using selection sort:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}

package array;

// 알고리즘 - 정렬
// 선택정렬, 버블정렬, 힙정렬....

public class ArrayEx10 {

  public static void main(String[] args) {
    int arr[] = { 25, 85, 55, 65, 5, 3 }; // 오름차순

    for (int i = 0; i < arr.length; i++) {
      int min_idx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min_idx]) {
          min_idx = j; // Update min_idx when a smaller element is found
        }
      }

      // Swap the found minimum element with the element at index i
      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }

    // Print the sorted array
    System.out.print("Sorted array: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

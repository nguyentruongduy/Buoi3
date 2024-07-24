/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

/**
 *
 * @author Administrator
 */
public class TimKiemNhiPhanDeQuy {

    /**
     * @param args the command line arguments
     */
    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // Kiểm tra nếu x nằm ở giữa
            if (arr[mid] == x) {
                return mid;
            }

            // Nếu x nhỏ hơn, thì nó chỉ có thể nằm trong nửa trái
            if (arr[mid] > x) {
                return binarySearch(arr, left, mid - 1, x);
            }

            // Nếu x lớn hơn, thì nó chỉ có thể nằm trong nửa phải
            return binarySearch(arr, mid + 1, right, x);
        }

        // Nếu không tìm thấy x
        return -1;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int n = arr.length;
        int result = binarySearch(arr, 0, n - 1, x);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
    
}

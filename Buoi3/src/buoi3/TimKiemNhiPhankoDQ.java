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

public class TimKiemNhiPhankoDQ {

    /**
     * @param args the command line arguments
     */
     public static int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Kiểm tra nếu x nằm ở giữa
            if (arr[mid] == x) {
                return mid;
            }

            // Nếu x lớn hơn, bỏ qua nửa trái
            if (arr[mid] < x) {
                left = mid + 1;
            } 
            // Nếu x nhỏ hơn, bỏ qua nửa phải
            else {
                right = mid - 1;
            }
        }

        // Nếu không tìm thấy x
        return -1;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = binarySearch(arr, x);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
    
}

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
public class TongMangDeQuy {

    /**
     * @param args the command line arguments
     */
     public static int tongMang(int[] a, int left, int right) {
        // Trường hợp cơ bản: nếu mảng chỉ có một phần tử
        if (left == right) {
            return a[left];
        }

        // Tìm điểm giữa của mảng
        int mid = (left + right) / 2;

        // Đệ quy tính tổng của nửa trái và nửa phải
        int sumLeft = tongMang(a, left, mid);
        int sumRight = tongMang(a, mid + 1, right);

        // Cộng tổng của hai nửa lại
        return sumLeft + sumRight;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 6, 7, 3, 2};
        int n = a.length;
        int totalSum = tongMang(a, 0, n - 1);
        System.out.print("Tong mang la " + totalSum);
    }
   

    // Phương pháp đệ quy để tính tổng các phần tử trong mảng
   
   


}

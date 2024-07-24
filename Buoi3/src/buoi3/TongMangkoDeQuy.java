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
public class TongMangkoDeQuy {
private static int b;

    public static int tongMang(int a[], int n) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n / 2; i++) {
            sum1 = sum1 + a[i];
        }
        for (int j = n / 2; j < n; j++) {
            sum2 = sum2 + a[j];
        }
        return sum1 + sum2;
    }

    public static void main(String[] args) {
        int a[] = {1, 5, 6, 7, 3, 2};
        int n = a.length;
        b = tongMang(a, n);
        System.out.print("Tong Mang La : " + b);
    }
    
}

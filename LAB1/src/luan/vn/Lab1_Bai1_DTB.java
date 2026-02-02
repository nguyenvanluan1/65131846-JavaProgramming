
package luan.vn;

import java.util.Scanner;

public class Lab1_Bai1_DTB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NHAP HO VA TEN: ");
        String hoTen = scanner.nextLine();

        System.out.print("NHAP DIEM TRUNG BINH: ");
        double diemTB = scanner.nextDouble();

        System.out.printf("%s: %.1f điểm\n", hoTen, diemTB);
        scanner.close();
    }
}

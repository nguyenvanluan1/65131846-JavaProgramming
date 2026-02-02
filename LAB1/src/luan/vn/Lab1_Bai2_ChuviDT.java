package luan.vn;

import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh thứ nhất: ");
        double canh1 = scanner.nextDouble();
        System.out.print("Nhập cạnh thứ hai: ");
        double canh2 = scanner.nextDouble();

        double chuVi = (canh1 + canh2) * 2;
        double dienTich = canh1 * canh2;
        double canhNho = Math.min(canh1, canh2);

        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ nhất: " + canhNho);
        scanner.close();

    }
}

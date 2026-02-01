package luan.vn;

import java.util.Scanner;

public class QuyDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double tyGiaUSD = 23500;
        double tyGiaEUR = 27000;
        
        System.out.print("Nhập số tiền USD cần đổi: ");
        double usd = scanner.nextDouble();
        System.out.printf("%.2f USD = %,.0f VNĐ\n", usd, (usd * tyGiaUSD));
        
        System.out.print("Nhập số tiền EUR cần đổi: ");
        double eur = scanner.nextDouble();
        System.out.printf("%.2f EUR = %,.0f VNĐ\n", eur, (eur * tyGiaEUR));
        
        scanner.close();
    }
}
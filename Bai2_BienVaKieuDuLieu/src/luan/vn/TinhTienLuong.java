package luan.vn;

import java.util.Scanner;

public class TinhTienLuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số giờ làm: ");
        double gioLam = scanner.nextDouble();
        System.out.print("Nhập lương mỗi giờ: ");
        double luongGio = scanner.nextDouble();
        
        double tongLuong;
        if (gioLam <= 40) {
            tongLuong = gioLam * luongGio;
        } else {
        	
            tongLuong = (40 * luongGio) + ((gioLam - 40) * luongGio * 1.5);
        }
        
        System.out.printf("Tổng lương nhân viên: %.3f VNĐ\n", tongLuong);
        scanner.close();
    }
}
/**
 * 
 */
package luan.vn;

import java.util.Scanner;

public class Lab1_Bai4_Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NHAP HE SO a: ");
        double a = scanner.nextDouble();
        System.out.print("NHAP HE SO b: ");
        double b = scanner.nextDouble();
        System.out.print("NHAP HE SO c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double canDelta = Math.sqrt(delta);

        System.out.println("Delta = " + delta);
        System.out.println("Căn Delta = " + canDelta);
        scanner.close();

    }
}

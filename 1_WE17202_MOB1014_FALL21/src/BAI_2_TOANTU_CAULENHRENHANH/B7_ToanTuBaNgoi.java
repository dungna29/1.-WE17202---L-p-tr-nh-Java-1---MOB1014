/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_TOANTU_CAULENHRENHANH;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class B7_ToanTuBaNgoi {

  /*
       Cách sử dụng:
        <Biểu thức> ? <Giá trị true> : <Giá trị false>;
        <Biểu thức>: Có thể có 1 hoặc nhiều biểu thức
        <Giá trị true>: Luôn nằm sau dấu ? và phụ thuộc vào kiểu dữ liệu của biến.
        <Giá trị false>: Luôn nằm sau dấu :    
   */
  public static void main(String[] args) {
    String temp1 = 5 > 5 ? "Đúng" : "Sai";
    int temp2 = 5 > 5 ? 1 : 0;
    double temp3 = 5 > 5 ? 1 : 0;
    boolean temp4 = 5 > 5 ? true : false;
    Scanner sc = new Scanner(System.in);
    int choice;
    System.out.println("===Menu FPOLY===");
    System.out.println("===1. Phở===");
    System.out.println("===2. Bún===");
    System.out.println("===3. Cơm rang dưa bò===");
    System.out.println("Mời bạn chọn món ăn: ");
    choice = Integer.parseInt(sc.nextLine());   
    System.out.println((choice == 1)?"Chờ 5 phút":
            (choice == 2)?"Chờ 10 phút":
            (choice == 3)?"Chờ 30 phút":
            "Món bạn chọn không tồn tại");
  }
}

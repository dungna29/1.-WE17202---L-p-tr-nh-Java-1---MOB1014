/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_ToanTu_CauLenhReNhanh;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class B2_TRY_CATCH {
  public static void main(String[] args) {
    //Công thức: try + tab
    /*
       Định nghĩa mức cơ bản: Try Catch dùng để chống crash chương trình.
       1. Không sử dụng try catch khi đang lập trình
       2. Ở môi trường học tập chi dùng Try Catch khi nộp bài hoặc đi chấm bài.
       3. Trong môi trường việc: Chỉ khi nào đóng gói cho Tester hoặc bàn giao sản phẩm cho khách hàng thì bắt buộc phải đóng try catch
    */
    Scanner sc= new Scanner(System.in);
    int a;
//    try {
      System.out.println("Mời bạn nhập số nguyên: ");
      a = Integer.parseInt(sc.nextLine());
      System.out.println(a);
//    } catch (Exception e) {
//      System.out.println("Lỗi rồi");
//    }
   
  }
}

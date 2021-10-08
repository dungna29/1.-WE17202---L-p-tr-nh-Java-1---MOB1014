/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_LIST_OOP;

import BAI_TAP_MAU_ARRAY_OOP.*;
import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class Main {

  /*
    CRUD Giảng Viên
   */
  public static void main(String[] args) {
    //Code menu ở đây
    Scanner sc = new Scanner(System.in);
    String input ="";
    GiangVienService service = new GiangVienService();

    while (!input.equals("6")) {      
      System.out.println("1. Thêm");
      System.out.println("2. Sửa");
      System.out.println("3. Xóa");
      System.out.println("4. Tìm kiếm gần dúng");
      System.out.println("5. In ds");
      System.out.println("6. Thoát");
      System.out.println("Mời bạn chọn chức năng: ");
      input = sc.nextLine();
      switch (input) {
        case "1":
          service.addGV1();
          break;
        case "2":
           service.editGV1();
          break;
        case "3":
           service.removeGV();
          break;
        case "4":
           service.findGV();
          break;
        case "5":
           service.printGV();
          break;
        case "6":
          System.out.println("Cảm ơn bạn đã sử dụng");
          break;
        default:
          System.out.println("Chức năng không tồn tại");
      }
    }
  }
}

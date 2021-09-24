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
public class B6_Switch_Case {

  /*
       Switch Case là 1 câu lệnh rẽ nhánh
        
       Công thức: sw + tab
    
        switch (<Biểu thức>) {
            case <Giá trị 1>:  
                Thực hiện 1 hành động nào đó
                break; - Sau khi thực hiện 1 hành động xong thì sẽ thoát khỏi Switch
            case <Giá trị 2>:                
                break;
            ..........
            case <Giá trị n>:                
                break;
            default:
                Khi chọn các case không thỏa mãn thì sẽ chạy vào đây                
        }
   */
  public static void main(String[] args) {
    /*
        Tạo 1 menu: Gồm 3 món ăn
        ===Menu FPOLY==
        1. Món phở
        2. Món bún
        3. Cơm rang dưa bò
     */
    Scanner sc = new Scanner(System.in);
    int choice;
    System.out.println("===Menu FPOLY===");
    System.out.println("===1. Phở===");
    System.out.println("===2. Bún===");
    System.out.println("===3. Cơm rang dưa bò===");
    System.out.println("Mời bạn chọn món ăn: ");
    choice = Integer.parseInt(sc.nextLine());
    switch (choice) {//sw + tab
      case 1:
        System.out.println("Bạn chờ 5 phút nhé");
        break;
      case 2:
        System.out.println("Bạn chờ 10 phút nhé");
        break;
      case 3:
        System.out.println("Bạn chờ 30 phút nhé");
        break;
      default:
        System.out.println("Món ăn bạn chọn không có");
    }
  }
}

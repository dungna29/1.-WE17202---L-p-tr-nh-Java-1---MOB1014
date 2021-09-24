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
public class B5_CauLenh_IF_ELSE_IF {

  /*
        Câu lệnh điều kiện IF dùng để đưa ra 1 điều kiện nào đó và 
        thực hiện 1 hành động bên trong IF nếu IF(true) 
        
        - Cách dùng: if + tab
        if (true) {
            Thực hiện 1 hành động nào đó với điều kiện if phải true
        }
   */

 /*
        Bài số 6: Câu lệnh điều kiện IF ELSE (NẾU THÌ)
        Định nghĩa: Thực hiện 1 hành động khi thỏa mãn IF(TRUE) và nếu không thỏa mãn IF thì sẽ luôn vào ELSE.
        if (true) {
            Thực hiện 1 hành động nếu thỏa mãn điều kiện của IF
        }else{
            Tất cả các trường hợp không thỏa mãn IF sẽ vào ELSE
            Thực hiện 1 hành động nào đó.
        }
    
   */
 /*
        ELSE IF sử dụng trong trường hợp bài toán có nhiều điều kiện khác nhau và sẽ thực hiện những hành động cũng khác nhau.
        
        Lưu ý: ELSE IF(TRUE) phải luôn đúng thì mới thỏa mãn vào bên trong nó tương tự như IF
        . Nhưng chỉ vào 1 điều kiện thỏa mãn không vào nhiều IF hoặc ELSE IF khi sử dụng.
        if (true) {
            //Thỏa mãn điều kiện IF(True)
            Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }else{
            Khi tất cả các trường hợp trên không thỏa mãn thì sẽ vào đây.
        }
   */
  public static void main(String[] args) {
    if (true) {
      //Thực hiện 1 hành động
    }
    if (5 > 5) {
      //Không vào bên trong if bởi biểu thức là false
    }
    //Ví dụ: Điểm thi >= 5 qua môn còn ngược lại thì học lại
    double thi = 8;
    //Sử dụng if
//    if (thi>=5) {
//      System.out.println("Chúc mừng bạn đã qua môn");
//      return;
//    }    
//    System.out.println("Chúc mừng bạn đã mất 700K");

    //Sử dụng if else     
    if (thi >= 5) {
      System.out.println("Chúc mừng bạn đã qua môn");      
    } else {
      System.out.println("Chúc mừng bạn đã mất 700K");
    }

    //Sử dụng else if
    /*
            Viết 1 chương trình cho phép nhập điểm THI JAVA
            9 - 10 = Xuất sắc
            8 - 9 = Giỏi
            7 - 8 = khá
            5 - 6 = trung bình
            0 - 5 = Học lại       
     */
    if (thi<0 || thi >10) {
      System.out.println("Mời bạn nhập lại");
      return;
    }
    if (thi >= 9 && thi <= 10) {
      System.out.println("Xuất sắc");
    } else if (thi >= 8 && thi < 9) {
      System.out.println("Giỏi");
    } else if (thi >= 7 && thi < 8) {
      System.out.println("Khá");
    }else if (thi >= 5 && thi < 7) {
      System.out.println("Trung bình");
    }else{
      System.out.println("Học lại");
    }
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
    if (choice == 1) {
      System.out.println("Bạn chờ trong 5 phút nhé!");
    }else if (choice == 2) {
      System.out.println("Bạn chờ trong 10 phút nhé!");
    }else if (choice == 3) {
       System.out.println("Bạn chờ trong 30 phút nhé!");
    }else {
      System.out.println("Món ăn bạn chọn không có mời bạn chọn lại");
    }
  }
}

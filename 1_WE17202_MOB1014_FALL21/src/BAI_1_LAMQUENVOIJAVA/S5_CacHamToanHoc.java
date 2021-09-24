/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_LAMQUENVOIJAVA;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class S5_CacHamToanHoc {

  public static void main(String[] args) {
    // *********** Toán tử toán học trong Java ***********
    // Thứ tự ưu tiên của toán học 5 +7*2 - 4/2 (Nhân và chia -> Cộng và trừ -> Trái sang phải);
    System.out.println(5 + 7 * 2 - 4 / 2);// 5 + 14 - 2
    
    //Lưu ý trong lập trình
    //Toán tử (+) có thể sử dụng để cộng chuỗi
    //string + string = stringstring || anh + dung =  anhdung
    
      // *********** Các hàm toán học có sẵn trong java  ***********
        //Math.min(a, b) - Lấy số nhỏ nhất của 2 số a và b (Sử dụng nhiều)      
        //Math.max(a, b) - Lấy số lớn nhất của 2 số và b
        //Math.pow(a, n) - Bình phương 1 số
        //Math.sqrt(a)- Tính √𝑎 (căn bậc 2 của a)
        //Math.abs(a) - Lấy giá trị tuyệt đối của a
        //Math.ceil(a) -Lấy số nguyên trên của a
        //Math.floor(a) - Lấy số nguyên dưới của a
        //Math.round(a) - Làm tròn số của a
        //Math.random() - Sinh số ngẫu nhiên từ 0 đến 1 (0.0 and less than 1.0) 
        
        /*Bài tập: Viết 1 chương trình cho phép nhập 2 số sau đó chỉ ra số lớn nhất và số bé nhất cho người dùng.        
        */
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Mời bạn nhập số a");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập số b");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Số lớn nhất là: " + Math.max(a, b));
        System.out.println("Số bé nhất là: " + Math.min(a, b));
  }
}

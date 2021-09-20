/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class B1_NhapXuatGiuLieu {
  /*
   Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên từ bàn phím và xuất ra định dạng sau:
      “Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> đến với chương trình lập trình đầu tiên.”
  */
  public static void main(String[] args) {
    //Bước 1: Khai báo thư viện và xác định số lượng biến và kiểu dữ liệu
    Scanner sc = new Scanner(System.in);
    String ten,msv;
    int ns;
    //Bước 2: Gán giá trị do người dùng nhập vào
    System.out.println("Mời bạn nhập tên: ");
    ten = sc.nextLine();
    System.out.println("Mời bạn nhập năm sinh: ");
    //ns = sc.nextInt();
    //Cách 1:  sc.nextLine(); sau đoạn nextInt();
    //Cách 2:  Ép kiểu từ String về số 
    ns = Integer.parseInt(sc.nextLine());//Cách sử dụng thường xuyên và sẽ giúp không phải nhớ các next<Số>
    System.out.println("Mời bạn nhập msv: ");
    msv = sc.nextLine();
    //Bước 3: Thực thi
    System.out.printf("Chào bạn %s | %d  | %s đến với chương trình lập trình đầu tiên.",ten,ns,msv);
    //Trôi lệnh chỉ xảy ra khi sau next<Số> là một nextLine thì sẽ bị trôi lệnh. Khi xử lý phải xử lý ở chỗ sau next<Số>
  }
}

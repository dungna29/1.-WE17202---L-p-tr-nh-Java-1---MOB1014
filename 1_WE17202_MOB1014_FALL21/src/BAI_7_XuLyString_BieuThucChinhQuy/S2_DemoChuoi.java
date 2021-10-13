/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_7_XuLyString_BieuThucChinhQuy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dungna89
 */
public class S2_DemoChuoi {

  static Scanner _Scanner = new Scanner(System.in);

  public static void main(String[] args) {
    nhapTen();
  }
  //Viết 1 chương trình nhập đầy đủ họ tên vào và viết hoa chữ cái đầu của các từ bên trong.
  //nguyen anh dUNG = Nguyen Anh Dung
  public static void nhapTen(){
    System.out.println("Mời bạn nhập đầy đủ họ tên: ");
    String name = _Scanner.nextLine();
    //Xử lý chuỗi
    name = name.trim();
    String[] arr = name.split("\\s+");
    for (String x : arr) {
      System.out.print(vietHoaChuCaiDau(x) +" ");
    }
  }
  public static String vietHoaChuCaiDau(String temp){//dung = Dung
    return String.valueOf(temp.charAt(0)).toUpperCase() +temp.substring(1).toLowerCase();
  }

  //Ví dụ 1: Tìm kiếm gần đúng trong 1 mảng tên
  public static void timKiemGanDung() {
    String arr[] = {"Dũng", "huy", "hOa", "dung", "hoang"};
    do {
      System.out.println("Mời bạn nhập tên: ");
      String input = _Scanner.nextLine();
      for (String x : arr) {
        if (x.toLowerCase().startsWith(input.toLowerCase().trim())) {
          System.out.println(x + " ");
        }
      }
    } while (true);
  }

  public static void nhapSo() {
    String input;
    do {
      System.out.println("Mời bạn nhập số: ");
      input = _Scanner.nextLine();
    } while (!checkSo(input));
    System.out.println("Chúc mừng bạn đã nhập đúng");
  }

  static boolean checkSo(String input) {
    Pattern pattern = Pattern.compile("\\d");//Regex biểu thức chính quy
    Matcher matcher = pattern.matcher(input);
    return matcher.matches();//Nếu là số sẽ return true
  }
}

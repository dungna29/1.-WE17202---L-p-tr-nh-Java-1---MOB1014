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
    nhapSo();
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

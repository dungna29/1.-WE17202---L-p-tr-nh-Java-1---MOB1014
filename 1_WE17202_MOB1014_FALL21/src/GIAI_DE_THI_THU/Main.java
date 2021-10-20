/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GIAI_DE_THI_THU;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class Main {
  public static void main(String[] args) {
    String input;
    Scanner sc = new Scanner(System.in);
    QLVC qlvc = new QLVC();
    do {
      System.out.println("1. Thêm");
      System.out.println("2. Xuất");
      System.out.println("3. Xuất theo điều kiện");
      System.out.println("4. Sort");
      System.out.println("5. Thoát");
      System.out.println("Mời bạn chọn chức năng: ");
      input = sc.nextLine();
      switch (input) {
        case "1":  
           qlvc.add();
          break;
        case "2":  
          qlvc.inDs();
          break;
        case "3":          
          break;
        case "4":          
          break;
        case "5":  
          System.out.println("Chào bạn");
          return;      
        default:
          System.out.println("CN không tồn tại");
      }
    } while (true);
    
  }
}

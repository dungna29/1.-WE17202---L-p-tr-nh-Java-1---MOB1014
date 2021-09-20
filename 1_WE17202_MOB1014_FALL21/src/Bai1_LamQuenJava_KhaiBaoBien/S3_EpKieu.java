/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_LamQuenJava_KhaiBaoBien;

/**
 *
 * @author Dungna89
 */
public class S3_EpKieu {
    /*
        1. Ép kiểu từ String về Số
        2. Ép kiểu giữa các các số với nhau
     */
  public static void main(String[] args) {
    //1. Ép kiểu từ String về số
    String year ="2020",y ="1",kq;
    kq = year + y;//Sử dụng toán tử + để cộng chuỗi
    System.out.println("Năm hiện tại = " + kq);//20201
    //Ép kiểu từ String về số
    System.out.println("Sau khi ép kiểu");
    System.out.println("Năm hiện tại = " +
            (Integer.parseInt(year)+Integer.parseInt(y)));//2021
    
    //Ngoài ra còn rất nhiều cách ép kiểu dữ liệu khác nhau từ String về số
        //Integer.parseInt(<String>)
        //Double.parseDouble(<String>)
        //Float.parseFloat(<String>)
        //Byte.parseByte(<String>)
        //..........
    
    //2. Ép kiểu giữa các số với nhau
    int a = 5;
    double b = 8.9;
    //b = a;//Ép kiểu tự động
    //a = b; Gây lỗi vì kiểu int bé hơn kiểu double
    a =(int) b;//Loại bỏ phần thập phân
    System.out.println(a);
  }
}

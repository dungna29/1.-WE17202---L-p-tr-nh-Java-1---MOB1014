/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_LamQuenJava_KhaiBaoBien;

import java.util.Scanner;



/**
 *
 * @author Dungna89
 */
public class S4_NhapXuatDuLieuTuBanPhim {

  /*
       Bài 4: Nhập xuất dữ liệu từ bàn phím
    1. Xuất dữ liệu ra màn hình: In giá trị mặc định hoặc giá của biến ra màn hình
        + Công thức: sout + tab
        + System.out.println(<giá trị hoặc tập giá trị>);
        + System.out.print(<giá trị hoặc tập giá trị>);
        + System.out.printf("Chào các %s bạn đến với năm học %d",value,value);
    2. Nhập dữ liệu từ màn hình:
        + Sử dụng 1 Class: Scanner sc = new Scanner(System.in);
        + Để đọc dữ liệu thì cần định nghĩa rõ muốn lưu dữ liệu nào khi người dùng nhập.
        + Để lấy giá trị từ bàn phím: sc.next<Kiểu dữ liệu muốn>();
   */
  public static void main(String[] args) {
    //1. Xuất dữ liệu ra màn hình
    System.out.print("Chào các bạn");
    System.out.println(" đến học trong ngành \t UDPM");//\t = 1tab
    System.out.print(" năm 2021 kỳ FALL \n");//\n xuống dòng

    //Đưa ra 1 template hiển thị
    System.out.printf("Chào bạn: %s Học: %s Năm: %d \n", "Nga", "FALL21", 2021);
    System.out.println("Chào bạn: " + "Nga" + " Học: " + "FALL21" + " Năm: " + 2021);
    
    //2. Nhập dữ liệu từ bàn phím
    //Ví dụ: Nhập tên của bạn và in ra màn hình
    //Bước 1: Khai báo lớp Scanner
    Scanner sc = new Scanner(System.in);
    //Bước 2: Xác định bài toán cần bao nhiêu biến và kiểu dữ liệu
    String name;
    //Bước 3: Chỉ dẫn cho người dùng và lấy giá trị
    System.out.println("Mời bạn nhập tên: ");
    name = sc.nextLine();//Gán giá trị cho biến name khi người dùng nhập giá trị
    //sc.nextLine() có kiểu dữ liệu là String
    //Bước 4: In ra màn hình
    System.out.println("Chào bạn: " + name);
    
     /*
        Bài 1: Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên
        từ bàn phím và xuất ra định dạng sau: 
	“Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> 
        đến với chương trình java đầu tiên.”
        
        Bài 2: Viết chương trình máy tính bỏ túi cộng 5 số nguyên sau đó in kết quả
        và những số đó ra màn hình.
        so1 + so2 + so3 + so4 + so5 = kết quả.   
        */
  }
}

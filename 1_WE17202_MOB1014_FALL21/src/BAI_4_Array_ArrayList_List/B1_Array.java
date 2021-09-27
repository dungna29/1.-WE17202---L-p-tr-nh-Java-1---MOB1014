/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class B1_Array {

  /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lặp.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
   */
  public static void main(String[] args) {
    //Phần 1: Khai mảng khai báo tên phải có arr
    int a = 5;
    int[] arrNumber;//Khai báo 1 mảng số nguyên
    //Để sử dụng được mảng bắt buộc phải khởi tạo và có kích thước
    arrNumber = new int[3];//Khởi tạo 1 mảng số nguyên gồm 3 phần tử
    String[] arrString1;
    double arrDouble[];
    
    arrString1 = new String[3];
    arrDouble = new double[3];
    
    //Phần 2: Gán giá trị cho mảng thì cần biết index
    //arrNumber = 5; không thể gán giá trị khi không xác định index
    arrNumber[0] = 5;//arrNumber[0] = giá trị tại index
    arrNumber[1] = 5;
    arrNumber[2] = 6;
    arrNumber[1] = 10;//Ghi đè giá trị
    
    arrString1[0] = "FPT";
    
    //Phần 3: Truy xuất phần tử trong mảng thông qua index
    System.out.println(arrNumber[0]);
    System.out.println(arrNumber[1]);
    System.out.println(arrNumber[2]);
    
    for (var x : arrNumber) {
      System.out.println(x);
    }
    for (int i = 0; i < arrNumber.length; i++) {//arrNumber.length = 3
      System.out.println(arrNumber[i]);
    }
    /*
    Bài tập thực hành 1: Viết chương trình cho phép nhập 1 dãy điểm môn JAVA1 và tiến hành in tất cả ra màn hình sau khi nhập.
    Bài tập thực hành 2: Viết 1 chương trình nhập vào dãy tên các bạn trong lớp và tiến hành in tất cả các index lẻ trong mảng tên đó ra màn hình.
    */
    //Bài 2 Mẫu:
    Scanner sc = new Scanner(System.in);
    String[] arrNames;//Khai báo
    int size;
    System.out.println("Mời bạn nhập số lượng tên bạn muốn: ");
    size = Integer.parseInt(sc.nextLine());
    //Sau khi khi lấy được kích thước mảng thì mới tiến hành khởi tạo mảng
    arrNames = new String[size];
    //Nhập giá trị vào mảng
    for (int i = 0; i < size; i++) {
      System.out.printf("Mời bạn nhập tên thứ %d :",i);
      arrNames[i] = sc.nextLine();
    }
    //Phải in các phần tử ở index lẻ
    System.out.println("Các phần tử ở index lẻ là: ");
    for (int i = 0; i < arrNames.length; i++) {
      if (i%2!=0) {
        System.out.printf("\t Index %d = %s \n",i,arrNames[i]);
      }
    }
  }
}

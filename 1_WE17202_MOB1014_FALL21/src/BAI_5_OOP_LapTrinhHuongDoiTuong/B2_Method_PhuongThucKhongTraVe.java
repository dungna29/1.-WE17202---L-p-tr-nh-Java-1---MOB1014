/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_5_OOP_LapTrinhHuongDoiTuong;

import java.util.List;

/**
 *
 * @author Dungna89
 */
public class B2_Method_PhuongThucKhongTraVe {

  /*
         *  Bài Hàm -Phương thức - Method
         *  Định nghĩa: 1 tập các câu lệnh cùng nhau thực hiện 1 tác vụ nào đó.
         *  LỢI ÍCH: - Giúp quản lý code tốt hơn
         *           - Tái sử dụng
         *
         *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
         *  }
    
         * <Phạm vi truy cập> - Access Modifier:Public,Private,Protected, Default
         *
         * <Kiểu trả về> : có 2 kiểu trả về và không trả về
         *          - Kiểu không trả về: void
         *          - Kiểvà còn nhiều kiểu khác.
         *u trả về: là giá trị(int,string,double....) hoặc tập giá trị(Array,List.....) hoặc đối tượng(class) và còn nhiều kiểu khác.
         *
         * <Tên phương thức>: Tên động từ viết thường hoặc hoa chữ cái đầu 
         * <Danh sách tham số>: Phương thức có thể có tham hoặc không tham số và lưu ý khi sử dụng tham số thì khi gọi phương thức thì phải truyền đúng vị trí của tham số.
   */
  public static void main(String[] args) {
    //1. Khi sử dụng phương thức cần phải biết tên phương thức và phương thức nằm ở Class nào
    //phepTinhCong1; Khi gọi phương thức bắt buộc phải có dấu ();
    phepTinhCong1();

    //2. Đối với phương có tham số lưu ý truyền đủ số tham số mà phương thức cần, truyền đúng kiểu dữ liệu
    //phepTinhCong2(1); Lỗi không truyền đủ tham số
    phepTinhCong2(5, 5);
    
    //3. Khi gọi các phương thức sử dụ nạp chồng chỉ cần truyền số lượng tham số sẽ gọi đúng cái phương thức cần gọi
    phepTinhNhan();
    phepTinhNhan(5,5,5);
    
  }

  //Phần 1: Phương thức không trả về không tham số
  public static void phepTinhCong1() {
    int a = 9, b = 10;
    System.out.printf("%d + %d = %d \n", a, b, a + b);
  }

  //Phần 2: Phương thức không trả về có tham số
  public static void phepTinhCong2(int a, int b) {
    System.out.printf("%d + %d = %d \n", a, b, a + b);
  }

  //Nạp chồng phương thức có trong file lý thuyết (Overloading)
  public static void phepTinhNhan() {
    int a = 9, b = 10;
    System.out.printf("%d x %d = %d \n", a, b, a * b);
  }

  public static void phepTinhNhan(int a, int b) {
    System.out.printf("%d x %d = %d \n", a, b, a * b);
  }

  public static void phepTinhNhan(int a, int b, int c) {
    System.out.printf("%d x %d x %d = %d \n", a, b,c, a * b*c);
  }

  public static void phepTinhNhan(int a, int b, int c, int d) {
     System.out.printf("%d x %d x %d xd = %d \n", a, b,c,d, a * b*c*d);
  }
  
  //Phần 3: Có rát kiểu dữ liệu của tham số mà các bạn có thể dùng
  public static void method1(SinhVien sv,long a,int[] arr,List<String> lst){
    for (int i = 0; i < arr.length; i++) {
      
    }
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author Dungna89
 */
public class B3_Method_TraVe {

  /*
         * Method trả về công thức và định nghĩa ở bên B2
         *
         * Định nghĩa: phương thức trả về bắt buộc phải trả về 1 giá trị hoặc 1 tập giá trị, đối tượng.... tương ứng với kiểu dữ liệu của phương thức.
   */
  public static void main(String[] args) {
    //1. 
    //phepTinhCong1(); Không in ra được vì bên trong không có phương thức in ra màn hình. Nó là 1 giá trị không thể tự in ra.
    System.out.println(phepTinhCong1()+10);
    
    for (int x : getYears()) {
      System.out.println(x);
    }
    for (int i = 0; i < getYears().length; i++) {
      
    }
  }
  public static int phepTinhCong1() {
    int a = 9, b = 10;  
    return a + b;//Phải trả về đúng kiểu dữ liệu
  }
  public static int[] getYears(){
    int[] arrYears = new int[2022-1900];
    int temp = 1900;
    for (int i = 0; i < arrYears.length; i++) {
      arrYears[i] =temp;
      temp++;
    }
    return arrYears;
  }
}

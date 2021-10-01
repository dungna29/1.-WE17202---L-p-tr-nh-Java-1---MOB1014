/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP;

/**
 *
 * @author Dungna89
 */
public class ChuaBaiTapLab123 {
  
  public static void main(String[] args) {
    //Bài 2: Khoảng bảng cửu chương
    int khoang1 = 7,khoang2 = 5;
    //Cách 1 đối với việc nhập khoảng 1 lớn hơn 2
//    if (khoang1 > khoang2) {
//      int temp = khoang1;
//      khoang1 = khoang2;
//      khoang2 = temp;
//    }

//    for (int i = Math.min(khoang1, khoang2); i <= Math.max(khoang1, khoang2); i++) {
//      for (int j = 1; j <= 10; j++) {
//        System.out.printf("%d x %d = %d \n",i,j,i*j);
//      }
//    }
    
    //Bài 3: 
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        if (i == 7) {
          break;
        }
         System.out.printf("%d x %d = %d \n",i,j,i*j);
      }
    }
  }
}

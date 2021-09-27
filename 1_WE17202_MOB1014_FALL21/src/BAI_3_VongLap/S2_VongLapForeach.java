/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_3_VongLap;

/**
 *
 * @author Dungna89
 */
public class S2_VongLapForeach {
   /*
    Cách gõ: fore + tab
    
    Công thức:  
    for (String arg : args) {
            
        }
    String arg: Kiểu dữ liệu và tên biến, tên biến sẽ đại diện là 1 giá trị
    args: Là Collection hoặc là 1 Array
     */
  public static void main(String[] args) {
    String[] arrFPT = {"FPT1","FPT2","FPT3"};
    
    for (var x : arrFPT) {
      System.out.println(x);
    }
    
    for (int i = 0; i < arrFPT.length; i++) {
      System.out.println(arrFPT[i]);
    }
  }
}

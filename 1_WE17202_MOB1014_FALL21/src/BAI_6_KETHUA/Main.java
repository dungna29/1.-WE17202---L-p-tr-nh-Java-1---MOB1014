/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_6_KETHUA;

/**
 *
 * @author Dungna89
 */
public class Main {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.inRaManHinh1();
    
    SinhVien1 sv1 = new SinhVien1("PH", 5.6, "LONG", 2000, "Số 1", "0123", "HCM", "123456");
    sv1.inRaManHinh1();
    sv1.setMsv("PH55555");
  }
}

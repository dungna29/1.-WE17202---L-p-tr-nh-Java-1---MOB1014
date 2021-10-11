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
/*
  Lớp con sử dụng từ khóa extends để kế thừa.
  Trong lập trình java thì là đơn kế thừa.
*/
public class SinhVien1 extends Person{
  //Tại lớp con chỉ cần khai báo các thuộc tính và phương thức riêng
  String msv;
  double diemJava;

  public SinhVien1() {
  }

  public SinhVien1(String msv1, double diemJava, String ten, int ns, String diaChi, String sdt, String queQuan, String cmt) {
    super(ten, ns, diaChi, sdt, queQuan, cmt);
    msv = msv1;
    this.diemJava = diemJava;
    //this: dùng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại
    //super: dùng để tham chiếu đến thuộc tính và phương thức của lớp cha
  }

  public String getMsv() {
    return msv;
  }

  public void setMsv(String msv) {
    this.msv = msv;
  }

  public double getDiemJava() {
    return diemJava;
  }

  public void setDiemJava(double diemJava) {
    this.diemJava = diemJava;
  }
  /*
    Lớp con có thể tự viết các phương thức riêng hoặc kế thừa lại phương thức của lớp cha
    Alt + insert chọn Override Method
    Khi lớp con kế thừa lớp cha được gọi là ghi đè phương thức Overriding trong tính đa hình và phương thức đặt tại lớp con hoàn toàn có thể được code lại nhưng ko được thay đổi kiểu phương thức, tên và tham số.
  */

  @Override
  public void inRaManHinh1() {
   // super.inRaManHinh1(); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Đây là phương thức của lớp con kế thừa cha");
  }
  
}

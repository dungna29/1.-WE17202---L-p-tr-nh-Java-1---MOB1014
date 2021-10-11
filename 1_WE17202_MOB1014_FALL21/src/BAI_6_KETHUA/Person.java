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
public class Person {//Lớp cha

  String ten;
  int ns;
  String diaChi;
  String sdt;
  String queQuan;
  String cmt;

  public Person() {
  }

  public Person(String ten, int ns, String diaChi, String sdt, String queQuan, String cmt) {
    this.ten = ten;
    this.ns = ns;
    this.diaChi = diaChi;
    this.sdt = sdt;
    this.queQuan = queQuan;
    this.cmt = cmt;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public int getNs() {
    return ns;
  }

  public void setNs(int ns) {
    this.ns = ns;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public String getSdt() {
    return sdt;
  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }

  public String getQueQuan() {
    return queQuan;
  }

  public void setQueQuan(String queQuan) {
    this.queQuan = queQuan;
  }

  public String getCmt() {
    return cmt;
  }

  public void setCmt(String cmt) {
    this.cmt = cmt;
  }

  @Override
  public String toString() {
    return "Person{" + "ten=" + ten + ", ns=" + ns + ", diaChi=" + diaChi + ", sdt=" + sdt + ", queQuan=" + queQuan + ", cmt=" + cmt + '}';
  }

  public void inRaManHinh1() {
    System.out.println("Đây là phương thức inRaManHinh1() của cha");
  }

  private void inRaManHinh2() {
    System.out.println("Đây là phương thức inRaManHinh2() của cha");
  }
}

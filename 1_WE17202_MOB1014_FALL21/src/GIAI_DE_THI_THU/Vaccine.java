/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GIAI_DE_THI_THU;

/**
 *
 * @author Dungna89
 */
public class Vaccine {
  private String MaVC;
  private String TenVC;
  private float ThoiGianTacDung;
  private String NgayHetHan;

  public Vaccine() {
  }

  public Vaccine(String MaVC, String TenVC, float ThoiGianTacDung, String NgayHetHan) {
    this.MaVC = MaVC;
    this.TenVC = TenVC;
    this.ThoiGianTacDung = ThoiGianTacDung;
    this.NgayHetHan = NgayHetHan;
  }

  public String getMaVC() {
    return MaVC;
  }

  public void setMaVC(String MaVC) {
    this.MaVC = MaVC;
  }

  public String getTenVC() {
    return TenVC;
  }

  public void setTenVC(String TenVC) {
    this.TenVC = TenVC;
  }

  public float getThoiGianTacDung() {
    return ThoiGianTacDung;
  }

  public void setThoiGianTacDung(float ThoiGianTacDung) {
    this.ThoiGianTacDung = ThoiGianTacDung;
  }

  public String getNgayHetHan() {
    return NgayHetHan;
  }

  public void setNgayHetHan(String NgayHetHan) {
    this.NgayHetHan = NgayHetHan;
  }

  @Override
  public String toString() {
    return "Vaccine{" + "MaVC=" + MaVC + ", TenVC=" + TenVC + ", ThoiGianTacDung=" + ThoiGianTacDung + ", NgayHetHan=" + NgayHetHan + '}';
  }
  
  public void inRaManHinh(){
    System.out.println(toString());
  }
}

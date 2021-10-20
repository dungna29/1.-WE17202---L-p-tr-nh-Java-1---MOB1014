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
public class VaccineVN extends Vaccine{
  private String QuocGia;

  public VaccineVN() {
  }

  public VaccineVN(String QuocGia, String MaVC, String TenVC, float ThoiGianTacDung, String NgayHetHan) {
    super(MaVC, TenVC, ThoiGianTacDung, NgayHetHan);
    this.QuocGia = QuocGia;
  }

  public String getQuocGia() {
    return QuocGia;
  }

  public void setQuocGia(String QuocGia) {
    this.QuocGia = QuocGia;
  }

  @Override
  public void inRaManHinh() {
    System.out.println(QuocGia);
    super.inRaManHinh(); 
  }
  
}

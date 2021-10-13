/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_LIST_OOP;

import BAI_TAP_MAU_ARRAY_OOP.*;

/**
 *
 * @author Dungna89
 */
public class GiangVien implements Comparable<GiangVien> {

  private String mgv;
  private int ns;
  private String truong = "FU";

  public GiangVien() {
  }

  public GiangVien(String mgv, int ns) {
    this.mgv = mgv;
    this.ns = ns;
  }

  public String getMgv() {
    return mgv;
  }

  public void setMgv(String mgv) {
    this.mgv = mgv;
  }

  public int getNs() {
    return ns;
  }

  public void setNs(int ns) {
    this.ns = ns;
  }

  public String getTruong() {
    return truong;
  }

  @Override
  public String toString() {//Alt + Insert -> toString
    return "GiangVien{" + "mgv=" + mgv + ", ns=" + ns + ", truong=" + truong + '}';
  }

  @Override
  public int compareTo(GiangVien o) {
    //return o.getMgv().compareTo(getMgv());//Sắp xếp xuôi với String
    //return -o.getMgv().compareTo(getMgv());//Sắp xếp ngược với String
    if (o.getNs() > getNs()) {//Sắp xếp đối với sắp xếp số
      return 1;
    } else {
      return -1;
    }
  }
}

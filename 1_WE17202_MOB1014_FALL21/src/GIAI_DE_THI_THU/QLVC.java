/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GIAI_DE_THI_THU;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class QLVC {
  Scanner _sc = new Scanner(System.in);
  String _input;
  List<Vaccine> _lstVaccines;
  Vaccine _Vaccine;
  public QLVC() {
    _lstVaccines = new ArrayList<>();
  }
  public void add(){
    do {      
      System.out.println("Mời bạn nhập số lượng: ");
      _input = _sc.nextLine();
      for (int i = 0; i < Integer.parseInt(_input); i++) {
        _Vaccine = new Vaccine();
        System.out.println("Mời bạn nhập mã: ");
        _Vaccine.setMaVC(_sc.nextLine());
        System.out.println("Mời bạn nhập tên: ");
        _Vaccine.setTenVC(_sc.nextLine());
        System.out.println("Mời bạn nhập thời gian tác dụng: ");
        _Vaccine.setThoiGianTacDung(Float.parseFloat(_sc.nextLine()));
        System.out.println("Mời bạn nhập ngày hết hạn: ");
        _Vaccine.setNgayHetHan(_sc.nextLine());
        _lstVaccines.add(_Vaccine);
      }
      System.out.println("Bạn có muốn nhập tiếp hay không? 1.CÓ 2.Không");
      _input = _sc.nextLine();
    } while (!_input.equals("2"));
  }
  public void inDs(){
    for (Vaccine x : _lstVaccines) {
      x.inRaManHinh();
    }
  }
  public void inDsDK(){
    for (Vaccine x : _lstVaccines) {
      if (x.getThoiGianTacDung() >=6 ) {
        x.inRaManHinh();
      }
    }
  }
  public void sortGiamDan(){
    Collections.sort(_lstVaccines, Comparator.comparing(Vaccine::getThoiGianTacDung).reversed());
  }
  public void keThua(){
    VaccineVN vc = new VaccineVN();
    vc.setMaVC("1");
    vc.setTenVC("Astra");
    vc.setThoiGianTacDung(6.5f);
    vc.setNgayHetHan("12/12");
    vc.setQuocGia("Anh");
    vc.inRaManHinh();
  }
}

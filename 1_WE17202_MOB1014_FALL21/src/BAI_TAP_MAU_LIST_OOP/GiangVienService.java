/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_LIST_OOP;

import BAI_5_OOP_LapTrinhHuongDoiTuong.SinhVien;
import BAI_TAP_MAU_ARRAY_OOP.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class GiangVienService {//Nơi code các chức năng cho đối tượng Giảng Viên
  //Biến toàn cục sẽ được khai báo trên đầu

  Scanner _sc;
  String _input;
  List<GiangVien> _lstGiangVien;
  GiangVien _GiangVien;

  public GiangVienService() {
    _sc = new Scanner(System.in);
    _lstGiangVien = new ArrayList<>();
  }

  public void addGV() {
    System.out.println("Mời bạn nhập số lượng: ");
    _input = _sc.nextLine();
    for (int i = 0; i < Integer.parseInt(_input); i++) {
      _GiangVien = new GiangVien();
      System.out.println("Mời bạn nhập mã: ");
      _GiangVien.setMgv(_sc.nextLine());
      System.out.println("Mời bạn nhập ns: ");
      _GiangVien.setNs(Integer.parseInt(_sc.nextLine()));
      _lstGiangVien.add(_GiangVien);
    }

  }

  public void editGV() {
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstGiangVien.size(); i++) {
      if (_lstGiangVien.get(i).getMgv().equals(_input)) {
        System.out.println("Mời bạn nhập lại năm sinh: ");
        _lstGiangVien.get(i).setNs(Integer.parseInt(_sc.nextLine()));
        System.out.println("Sửa thành công");
        return;
      }
    }
    System.out.println("Không tìm thấy");
  }

  public void removeGV() {
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstGiangVien.size(); i++) {
      if (_lstGiangVien.get(i).getMgv().equals(_input)) {
        _lstGiangVien.remove(i);
        System.out.println("Xóa thành công");
        return;
      }
    }
    System.out.println("Không tìm thấy");
  }

  public void findGV() {
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstGiangVien.size(); i++) {
      if (_lstGiangVien.get(i).getMgv().equals(_input)) {
        System.out.println(_lstGiangVien.get(i).toString());       
        return;
      }
    }
    System.out.println("Không tìm thấy");
  }

  public void printGV() {
    for (GiangVien x : _lstGiangVien) {
      System.out.println(x.toString());
    }
  }
}

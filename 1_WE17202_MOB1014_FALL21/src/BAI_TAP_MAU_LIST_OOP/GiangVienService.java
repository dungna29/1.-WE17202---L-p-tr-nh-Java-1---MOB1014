/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_LIST_OOP;

import BAI_5_OOP_LapTrinhHuongDoiTuong.SinhVien;
import BAI_TAP_MAU_ARRAY_OOP.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

  //Ứng dụng phương trả về giúp lười hơn trong lập trình
  public void addGV1() {
    _input = getInputValue("Mã");
    for (int i = 0; i < Integer.parseInt(_input); i++) {
      GiangVien gv = new GiangVien(getInputValue("Mã"), Integer.parseInt(getInputValue("ns")));
      _lstGiangVien.add(gv);
    }
  }

  public String getInputValue(String temp) {
    System.out.printf("Mời bạn nhập %s: ", temp);
    return _sc.nextLine();
  }

  public void editGV1() {
    _input = getInputValue("Mã");
    for (int i = 0; i < _lstGiangVien.size(); i++) {
      if (_lstGiangVien.get(i).getMgv().equals(_input)) {
        _lstGiangVien.get(i).setNs(Integer.parseInt(getInputValue("ns")));
        System.out.println("Sửa thành công");
        return;
      }
    }
    System.out.println("Không tìm thấy");
  }

  public void removeGV1() {
    _lstGiangVien.remove(getInputValue("Mã"));
  }

  public void findGV1() {
    System.out.println(_lstGiangVien.get(getIndex(getInputValue("Mã"))).toString());
  }

  public int getIndex(String mgv) {
    for (int i = 0; i < _lstGiangVien.size(); i++) {
      if (_lstGiangVien.get(i).getMgv().equals(mgv)) {
        return i;
      }
    }
    return -1;
  }

  //Sắp xếp đối tượng
  public void sortGV() {
    //Cách 1: Triển khai ngay bên trong phương thức
//    Collections.sort(_lstGiangVien, new Comparator<GiangVien>() {
//      @Override
//      public int compare(BAI_TAP_MAU_LIST_OOP.GiangVien o1, BAI_TAP_MAU_LIST_OOP.GiangVien o2) {
//       //return o1.getMgv().compareTo(o2.getMgv());//Sắp xếp xuôi với String
//       //return -o1.getMgv().compareTo(o2.getMgv());//Sắp xếp ngược với String
//        if (o1.getNs() >o2.getNs()) {//Sắp xếp đối với sắp xếp số
//          return 1;
//        }else{
//          return -1;
//        }
//      }
//    });

    //Cách 2: Sử dụng Comparable
    //Collections.sort(_lstGiangVien);
    
    //Cách 3: Học thuộc lòng
    //_lstGiangVien.sort((o1, o2) -> o1.getMgv().compareTo(o2.getMgv()));
   
    //Lambda expression for sorting theo điểm
    //_lstGiangVien.sort((GiangVien s1, GiangVien s2)->s1.getNs()-s2.getNs());  
    
     Collections.sort(_lstGiangVien, Comparator.comparing(GiangVien::getNs));//Cái này dễ thuộc nhất
  }
}

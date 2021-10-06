/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_ARRAY_OOP;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class GiangVienService {//Nơi code các chức năng cho đối tượng Giảng Viên
  //Biến toàn cục sẽ được khai báo trên đầu
  Scanner _sc;
  String _input; 
  GiangVien[] _arrGiangVien;
  
  public GiangVienService() {
    _sc = new Scanner(System.in);
  }  
  
  public void addGV(){
    System.out.println("Mời bạn nhập số lượng: ");
    _input = _sc.nextLine();
    //Khởi tạo mảng sau khi người dùng nhập số lượng
    _arrGiangVien = new GiangVien[Integer.parseInt(_input)];
    //Nhập giá trị vào mảng
    for (int i = 0; i < _arrGiangVien.length; i++) {
      _arrGiangVien[i] = new GiangVien();//Khởi tạo đối tượng tại ô nhớ trước khi sử dụng
      System.out.println("Mời bạn nhập mã: ");
      _arrGiangVien[i].setMgv(_sc.nextLine());
      System.out.println("Mời bạn nhập ns: ");
      _arrGiangVien[i].setNs(Integer.parseInt(_sc.nextLine()));      
    }
  }
  public void editGV(){
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _arrGiangVien.length; i++) {
      if (_arrGiangVien[i].getMgv().equals(_input) && _arrGiangVien[i].getMgv()!= null) {
        System.out.println("Đã tìm thấy");
        System.out.println("Mời bạn nhập năm sinh mới: ");
        _arrGiangVien[i].setNs(Integer.parseInt(_sc.nextLine()));
        return;
      }
    }
    System.out.println("Không tìm thấy");
  }
  public void removeGV(){
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _arrGiangVien.length; i++) {
      if (_arrGiangVien[i].getMgv().equals(_input)) {
        System.out.println("Đã tìm thấy");
        _arrGiangVien[i] = new GiangVien();
        return;
      }
    }
    System.out.println("Không tìm thấy");
  }
  public void findGV(){
      System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _arrGiangVien.length; i++) {
      if (_arrGiangVien[i].getMgv().toLowerCase().startsWith(_input.toLowerCase())) {
        System.out.println("Đã tìm thấy");
        System.out.println(_arrGiangVien[i].toString());       
      }
    }
   
  }
  public void printGV(){
    for (GiangVien x : _arrGiangVien) {
      System.out.println(x.toString());
    }
  }
}

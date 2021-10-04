/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author Dungna89
 */
public class Main {

  public static void main(String[] args) {
    //Phần 1: Sử dụng đối tượng cần phải biết tên đối tượng
    int a = 5;
    SinhVien sv1;//Khai báo
    sv1 = new SinhVien();//Khởi tạo đối tượng và phải khởi tạo thì mới sử dụng được đối tượng.
    SinhVien sv2 = new SinhVien();
    sv2.setTen("Nguyễn Văn C");
    sv2.setMsv("PH123");
    sv2.setNs(2000);    
    SinhVien sv3 = new SinhVien("Dũng", "PH1111", 2000);//Tham số truyền vào phải đúng thứ tự và đúng kiểu dữ liệu

    //Phần 2: Gán và lấy giá trị cho đối tượng bằng cách gọi tên biến đối tượng và dùng dấu chấm "." ra các thuộc tính
    System.out.printf("%s %s %d %s \n", sv3.getTen(), sv3.getMsv(), sv3.getNs(), sv3.getTruongHoc());
    sv3.inRaManHinh();//Phương thức tự viết in ra màn hình
    System.out.println(sv3.toString());
    sv2.inRaManHinh();
  }
}

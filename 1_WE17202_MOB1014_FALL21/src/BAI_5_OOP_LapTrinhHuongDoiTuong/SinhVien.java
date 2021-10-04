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
//Tên đối tượng phải là danh từ và viết hoa chữ cái đầu
public class SinhVien {

  //Phần 1: Liệt kê tất cả các thuộc tính mà đối tượng cần phải có và các thuộc tính này phải miêu tả được đối tượng. (Không sử dụng từ thông tin)
  //- Khi private thì chỉ được phép gọi và sử dụng bên trong 1 Class
  private String ten;
  private String msv;
  private int ns;
  private String truongHoc = "FPOLY";

  //Phần 2: Contructor khi mới học luôn có 2 Contructor
  /*
        - Tên Contructor phải giống với tên class và có từ khóa public
        - Khi khởi tạo đối tượng thì Contructor luôn là thành phần chạy đầu tiên trong class đối tượng đó.
        - Contructor không tham số dùng để khởi tạo đối tượng ko có giá trị ban đầu
        - Contructor có tham số dùng để khởi tạo đối tượng có giá trị ban đầu
        - Nếu Class mà không có Contructor thì khi sử dụng chương trình sẽ tự khởi tạo ra 1 contructor mặc định đó là contructor không tham số
   */
  // 2.1 Contructor không tham số: alt + insert hoặc chuột phải chọn Insert code

  public SinhVien() {
    //System.out.println("Contructor chạy nè!");
  }
  
   // 2.2 Contructor có tham số: Tương tự cách trên nhưng Select All Thuộc tính
   // - Đối với contructor có tham số có thể khởi tạo ngay giá trị cho đối tượng khi khởi tạo

  public SinhVien(String ten, String msv, int ns) {
    this.ten = ten;
    this.msv = msv;
    this.ns = ns;  
  }

  //Phần 3: Getter và Setter: Chuột Phải chọn Insert Code
    /*
    Bởi các thuộc tính bị private nên phải sử dụng Getter và Setter để lấy giá trị
    và gán giá trị cho thuộc tính của đối tượng.
    */

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public String getMsv() {
    return msv;
  }

  public void setMsv(String msv) {
    this.msv = msv;
  }

  public int getNs() {
    return ns;
  }

  public void setNs(int ns) {
    this.ns = ns;
  }

  public String getTruongHoc() {
    return truongHoc;
  }

//  public void setTruongHoc(String truongHoc) {
//    this.truongHoc = truongHoc;
//  }
  
  //Phần 4: Các phương của đối tượng

  @Override
  public String toString() {
    return "SinhVien{" + "ten=" + ten + ", msv=" + msv + ", ns=" + ns + ", truongHoc=" + truongHoc + '}';
  }
  
  public void inRaManHinh(){
      System.out.printf("%s %s %d %s \n", ten, msv, ns, truongHoc);
  }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dungna89
 */
public class B6_List {

    /*
    Bài List
        - Định nghĩa: List Interface trong Java kế thừa Collection và nó cung cấp các phương thức 
                      để thao tác với các phần tử trong danh sách.
    
        + Phương thứ List    
                    - void add(int index, Object obj) || add(object value) Chèn obj vào trong List đang gọi tại index đã cho. 
                        Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm chèn bị bỏ qua. Vì thế, 
                        không có phần tử nào bị ghi đè.
                    - boolean addAll(int index, Collection c)	Chèn tất cả phần tử của c vào trong List
                        đang gọi tại chỉ mục đã cho. Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm
                        chèn bị bỏ qua. Vì thế, không có phần tử nào bị ghi đè. Trả về true nếu List đang gọi
                        thay đổi và nếu không trả về false.
                    - object get(int index)	Trả về đối tượng được lưu giữ tại index đã 
                        cho bên trong Collection đang gọi.
                    - int indexOf(Object obj)	Trả về index của sự xuất hiện đầu tiên của obj trong List đang gọi.
                        Nếu obj không là một phần tử trong list, -1 được trả về.
                    - int lastIndexOf(Object obj) Trả về index của sự xuất hiện đầu tiên của obj trong List 
                        đang gọi. Nếu obj không là một phần tử trong list, -1 được trả về
                    - ListIterator listIterator()	Sử dụng để trả về một Iterator mà bắt đầu từ phần 
                        tử đầu tiên của list.
                    - ListIterator listIterator(int index)	Sử dụng để trả về một Iterator mà phần tử bắt 
                        đầu từ chỉ số index chỉ định.
                    - object remove(int index)	Gỡ bỏ phần tử tại index từ List đang gọi và trả về phần tử 
                        bị xóa đó. List kết quả được compact lại. Đó là, các chỉ mục của dãy phần tử phụ bị 
                        lượng giảm đi 1.
                    - object set(int index, Object obj)	Gán obj tới vị trí được xác định bởi index bên trong 
                        List đang gọi.
                    - List subList(int start, int end)	Trả về một list mà bao gồm các phần tử từ start tới 
                        end-1 trong List đang gọi. Các phần tử trong list trả về cũng được tham chiếu bởi đối
                        tượng đang gọi.                        
    */
  public static void main(String[] args) {
    //Để sử dụng được mảng bắt buộc phải khởi tạo và có kích thước
    int[] arr = new int[10];//Khởi tạo 1 mảng số nguyên gồm 3 phần tử

    //Phần 1. Khởi tạo ArrayList không định kiểu và có định kiểu
    //Không định kiểu
    List lstKhongDinhKieu = new ArrayList();//Khởi tạo
    List lstKhongDinhKieu1;//khai báo
    lstKhongDinhKieu1 = new ArrayList();//Khởi tạo

    //Định kiểu
    List<Integer> lstInt = new ArrayList<>();
    List<String> lstString = new ArrayList<>();
    List<Double> lstDouble = new ArrayList<Double>();

    //Phần 2: Gán giá trị sử dụng phương thức add
    lstKhongDinhKieu.add(1);
    lstKhongDinhKieu.add("2");
    lstKhongDinhKieu.add('a');
    lstKhongDinhKieu.add(5.6);
    lstKhongDinhKieu.add(true);
    lstKhongDinhKieu.add(0, true);// Chèn Giá trị vào index 0

    lstDouble.add(8.6);//Đối với có định kiểu thì phải add đúng kiểu giá trị

    //Phần 3: Truy xuất giá trị sử dụng phương thức get(index)
    System.out.println(lstDouble.get(0));
    System.out.println(lstKhongDinhKieu.get(0));
    System.out.println(lstKhongDinhKieu.get(1));

    //Trong 1 vài tình huống đưa nó về kiểu dữ liệu nguyên thủy
    //Khi add thêm kiểu đữ liệu nguyên thủy ở trong ArrayList không định kiểu thì nó tự động chuyển sang kiểu Wrapper DOuble Integer
    //Khi muốn sử dụng phải ép kiểu thì mới sử dụng được
    Double diem = (Double) lstKhongDinhKieu.get(4);
    diem = Double.valueOf(diem);
    //double diem1 = arrLstKhongDinhKieu.get(4);//Lỗi
    double diem1 = (double) lstKhongDinhKieu.get(4);//Ép kiểu nó về nguyên thủy
    System.out.println("======");
    for (int i = 0; i < lstKhongDinhKieu.size(); i++) {
      System.out.println(lstKhongDinhKieu.get(i));
    }
    System.out.println("======");
    for (var x : lstKhongDinhKieu) {
      System.out.println(x);
    }
    
    //Phần 4: Một vài phương thức   
    //arrLstKhongDinhKieu.remove(0);//Xóa phần thử theo index
    //arrLstKhongDinhKieu.clear();
    
    //Sử dụng Collections có s để sắp xếp
    lstDouble.add(1.9);
    lstDouble.add(1.8);
    lstDouble.add(1.7);
    Collections.sort(lstDouble);//Sắp xếp tăng dần
    Collections.reverse(lstDouble);//Đảo ngược danh sách
    for (var x : lstDouble) {
      System.out.println(x);
    }
  }
}

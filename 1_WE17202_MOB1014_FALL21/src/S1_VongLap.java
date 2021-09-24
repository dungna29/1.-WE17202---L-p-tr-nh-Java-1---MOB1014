/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dungna89
 */
public class S1_VongLap {
  /*
         * BàiVòng lặp:
         *
         * Định nghĩa chung cho tất cả vòng lặp:
         * Vòng lặp cho phép lặp lại một hoặc nhiều câu lệnh cho đến khi thỏa mãn điều kiện được chỉ định định.
         *
         * Các loại vòng lặp: while, do..while, for, foreach
         *
         * Từ khóa sử dụng trong vòng lặp:
         *
         * break - ngắt vòng lặp
         * continue: Sẽ bỏ qua các đoạn code phía sau nó và nó quay trở lại lần lặp tiếp theo.
         *
         * Vòng lặp while: Chỉ chạy khi điều kiện luôn đúng và nếu điều kiện luôn đúng 
           ko điểm dừng thì được gọi là vòng lặp vô hạn.
         * + Cách dùng: wh + tab
         *
         * + Công thức:
         *  while (true)
            {
                //Thực thi 1 câu lệnh hoặc nhiều câu lệnh
            }
  
            Vòng lặp Do..While: Thực hiện hành động ít nhất là 1 lần. Điều kiện đề vòng lặp chạy giống như While(True).

           Cách gõ: do + tab
           Công thức: 
           do {
                      //Thực hiện hành động ít nhất là 1 lần.
           } while (true);
  
            Cách gõ: for + tab
            Công thức:
             for (int i = 0; i < 10; i++) {
                }
            int i = 0: Điểm bắt đầu của vòng lặp có kiểu số nguyên
            i < 10: Điều kiện để ngắt vòng
            i++: Tăng bước nhẩy lên 1
     */
  public static void main(String[] args) {
    /*
        Để sử dụng 1 vòng lặp cần nắm được công thức sau:
        1. Điểm bắt đầu
        2. Điều kiện ngắt vòng lặp
        3. Bước nhẩy
    */
    //for + tab
//    for (int i = 0; i < 5; i++) {
//      System.out.println("Chào các bạn");
//    }   

    //wh + tab
//    int i = 0;
//    while (i < 5) {
//       System.out.println("Chào các bạn");
//       i++;
//    }
    
    //do + tab
    int i = 0;
    do {
      System.out.println("Chào các bạn");
       i++;
    } while (i < 5);
    
    //Bài tập: Xây dựng chương trình in bảng cửu chương bằng 3 loại vòng lặp
  }
}

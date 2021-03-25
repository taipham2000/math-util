/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.test;

import com.fu.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilityTest {
    @Test // bieén hàm này thành main(), SHift f6 để chạy
    ///gọi hàm getF() như thường lệ , hay hơn là tự động so sánh giùm 
    //expected và actrual coi nó khớp nhau hơm?? có thấy bản màu xanh
    //hok khớp nhau thảy màu đỏ ,. Ta chỉ nhìn màu mà k cần mất công
    //so sánh nữa!!!
    public void testFactorialRighArgumentRunsWell(){
        long expected=120; // em muốn biết 5! đúng là 120 hem?
        int n=5;   //em đưa 5 đâyy ă
        long actual=MathUtility.getFactorial(n);
        //và so sánh dùng tớ luôn
        assertEquals(expected, actual);// tớ chỉ thích đèn báo giao thông thông
        
        //tui sẽ test các tình huống còn lại assertEqual(720, MathUtility.getfactorial(6)); 6! có phải 720?
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        //0! là 1 tình huống cần phải test
         //1! là 1 tình huống khác cần test
          //6! là 1 tình huống khác cần test
          //TÌNH HUỐNG :TEST CASE . NGHẾ TESTTER LÀ NGHỀ NGHỈ RA CÁC TEST
          //CASE, SAU ĐÓ THỬ NGHIỆM
          
       
    }
    
        //kì vọng sai , tính đúng ->1 màu đỏ , không khớp nhau 
        //kì vọng đúng , tính sai-> 1 màu đỏ
        //tao hy vọng 5!=120 , mày tính ra mấy , hàm này tính ra mấy?
        
    //TA TEST PHẦN NGOẠI LỆ EXCEPTION
    //Exception là tình huống thường xảy ra trong app, trong code, khi 
    //appp chạy . Nó k phải là 1 value để có thể so sánh 
    // lỗi SQL trùng key, sai khóa ngoại , null trên cột yêu cầu khác null
    // dều là lỗi liên quan SQL nhưng k thể nói thằng nào hơn thằng nào?
    // Đối với Exception , chỉ có thể đo nó câu hỏi: MÀY CÓ XUẤT HIỆN KO?
    //ko dùng assertEqual() so-sánh-coi-nó-bằng-nhau-hay-ko
    //trong thiết kế của hàm gfetFactorial() thì nếu đưa vào n<0 hặc n>2
    //thì hàm ném ra , sẽ new 1 ngoại lệ
    //cứ đưa n vi phạm , nhận về ngoại lệ
    //vậy nếu có ngoại lệ xảy ra  khi đưa vào cà chớn <0>21
    //có nghĩa rằng hàm chạy đúng, thấy ngoại lệ ta lại ăn mừng , vidf chạy
    //Như thiết kế -> ĐÚNG CÓ NGOẠI LỆ TA CẦN NÓ XUẤT HIEENUJ-> MÀU XANH
    //SẼ CÓ TEST CASE, TÌNH HUỐNG TEST :XEM NGOIAJ LỆ CÓ XH KO, CÓ->XANH
    //KHO XH NHƯ DỰ KIẾN -> ĐỎ 
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-1);
  //      MathUtility.getFactorial(-10);//phải xh ngoại lệ Exception 
    //    MathUtility.getFactorial(21);
      //  MathUtility.getFactorial(40);
    }//nếu xh Exception , thì phải XAH
    //Vì màu xanh hàm ý rằng hàm chạy như thiết kế,
    //ném ngoại lệ khi đưa n cà chớn!!!!
    //Ta CẦN KĨ THUẬT ĐỂ BẮT NGOẠI LỆ, ĐÚNG NGOẠI LỆ CẦN BẮT XUẤT HIỆN
    //TA CÓ XANH
}
//Quy ước Xanh: nếu tất cả các lời gọi hàm getFactorial()
//đều trả giá trị đúng như kì vọng , nói cách khác tất cả các hàm
//assertEqual() đều so sánh khớp expected vs. actual 
//thì có màu xanh
//XANH:     KHI TẤT CẢ CÁC TÌNH HUỐNG TEST HÀM ĐỀU CHẠY ĐÚNG
//ĐỎ : chỉ cần 1 trong đám này sai , coi như đỏ tất cả 
//lid do phía sau: ĐÃ TEST thì phải đúng cho các trường hợp 
//Ko chơi trò: hầu hết là đúng , lâu lâu mới sai...

//
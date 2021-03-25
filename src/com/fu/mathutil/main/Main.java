/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.main;

import com.fu.mathutil.MathUtility;

/**
 *
 * @author phamv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1st upload from local to GitHub!!");
        System.out.println("Welcome to GitHub");
        //Test TRÂU BÒ , TỨC LÀ DÙNG MẮT ĐẺ NHÍN KẾT QUẢ ĐÚNG SAI
        long expected=120;// tui kì vọng hàm tính giai thừa trả 120 nếu toio đưa vào 5
        int input=5;   // đầu vào 5
        long actual;
        actual=MathUtility.getFactorial(input);
        System.out.println("5!: Expected: "+expected+" Actual :"+actual);
        //một tình huống test case , 1 tình huống dùng hàm , tét hàm, dùng hàm
        //case 2:
        expected=1;
        input=0;
        actual= MathUtility.getFactorial(input);
        System.out.println("6!: Expected: "+expected+" Actual :"+actual);
        //case 3:
        expected=2;
        input=2;
        actual= MathUtility.getFactorial(input);
        System.out.println("2!: Expected: "+expected+" Actual :"+actual);
        //case 4: -1! thif sao???
        //expected =????;///ngoại lệ mà, k so sánh đc , kphair là value
        //mà nó chỉ xuất hiệnthoy
        input=-1;
        
        actual= MathUtility.getFactorial(input);
        //k in đc ngoại lệ , chỉ coi nó xh hay k?
        // chúng ta phải nhìn để kết luận nhìn nhiều case 
        // chơi trò thông minh hơn - test AUTOMATION DÙNG THƯ VIỆN
    }
    
}

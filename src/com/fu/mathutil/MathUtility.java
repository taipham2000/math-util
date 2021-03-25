/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author phamv
 */
public class MathUtility {
    //đây là class mô phỏng lại class Math, chứa các hàm sài chung
    //hàm xài chung không lưu lại được gì-> STATIC
    public static final double PI=3.1415;
    
    // hàm tính n!
    //n! tăng rất nhanh về giá trị
    //21! tràn kiểu long ,hơn 18 số 0
    // bài này ta tính từ 0...20!. Âm không tính đc
    public static long getFactorial(int n) {
        if(n<0 || n>20)
            throw new IllegalArgumentException("n must be between 0...20");
            // sống xót đến đây thì n=0 ,1,2...30
            if(n==0 || n==1)
                return 1; //0!,1!=1        
            return n*getFactorial(n-1);
            //n!= n*  (n-1)!
            // đệ quy ,vòng lại chính mình với quy mô khác 
            //recursion. làm khéo nếu k nó đi mãi mãi
            //STACKOVERFLOW.COM
            
            /*long result =1;// XANH LOCAL VAF SERVER// GIẢ BỘ
            for(int i=2;i<=n;i++)
                result *=i;
            return result;*/
        
    }
}

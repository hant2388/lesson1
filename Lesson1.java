package BTVN_hant;

import java.sql.SQLOutput;

public class Lesson1 {
    public static void main (String[] args){
        //tinh giai thua cua 1 so

        int myNum =3;
        int giaithua = 1;
        for (int i = 1; i <= myNum; i ++ ){
            giaithua = giaithua * i;
        }
        System.out.println("Giai thua cua " + myNum + " la:"+ giaithua);
//        Tinh trung binh cong 1 day so

        int[] myArr = {1,3,5,7,9};
        int Total = 0;
        int Average = 0;
        for (int i= 0; i < myArr.length; i++){
            Total = Total + myArr[i];
        }
        Average = Total/ myArr.length;
        System.out.println( "Gia tri trung binh cong la: " + Average);
        //Tìm số lớn nhất
        int[] myArr1 = {0,2,4,6,2,7,22,46};
        int maxValue = 0;
        for (int i = 0; i < myArr1.length; i++) {
            if(maxValue < myArr1[i]) {
                maxValue= myArr1[i];
            }
        }
        System.out.println("So lon nhat la: "+ maxValue);
        // Sắp xếp mảng theo thứ tự tăng dần


        int[] mangCanSxep = {1,4,2,7,24,6,0};
        int bientam = mangCanSxep[0];
        for (int i = 0; i < mangCanSxep.length - 1; i++) {
            for (int i1 = i+1 ; i1 < mangCanSxep.length; i1++) {
                if(mangCanSxep[i]>mangCanSxep[i1]) {
                    bientam = mangCanSxep[i];
                    mangCanSxep[i] = mangCanSxep[i1];
                    mangCanSxep[i1] = bientam;
                }
            }

        }
        for (int i = 0; i < mangCanSxep.length; i++) {
            System.out.println( mangCanSxep[i] );
        }


    }

}

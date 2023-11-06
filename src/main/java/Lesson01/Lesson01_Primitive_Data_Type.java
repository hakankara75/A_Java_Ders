package Lesson01;

public class Lesson01_Primitive_Data_Type {
    /*
           Java'da temelde iki tip data vardir;
           1)primitive data type:
                char: Tek karakterler icin kullanilir. A, x, ?, 5
                boolean: boolean'lar sadece iki farkli deger alabilir; true(dogru) veya false(yanlis)
                byte: -128 den +127 e kadar tamsayi degerleri icin kullanilir (1 byte)
                short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir (2 byte)
                int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir (4 byte)
                long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir. (8 byte)
                float: 1.4E-45 ile 3.4028235E38 arasindaki sayilar icindir. (4 byte)
                double: 4.9E-324 ile  1.7976931348623157E308 arasindaki sayilar icindir. (8 byte)
           2)non-primitive data type

         */
    public static void main(String[] args) {
        char isminin_Ilk_Harfi='A'; //tek karakter alir
        char tekRakam='2'; //tek karakter alir
        System.out.println("isminin_Ilk_Harfi = " + isminin_Ilk_Harfi); //soutv "isminin_Ilk_Harfi = " kismini intelij olusturdu
        System.out.println(isminin_Ilk_Harfi); //sout
        System.out.print(tekRakam); //souf "" atar. icini kendin doldurursun.

        boolean calisiyorMusun= false; //dogru ya da yanlis olur
        boolean evliMisin= true;

        //1. en kucuk
        byte yasinKac= 47;
        byte kacManat= 29;

        //2. sira
        short kilosuKaca= 345;
        short kacOgrenciVar=567;

        //3.sira
        int nufus=85000000;
        int buyukbasHayvanSayisi= 450000000;
       // Integer nufusumuz= 90000000; wrapper class. metot kullanabiliriz

        //4.sira
        long hucreSayisi=54396044345345345L;

        //5.sira
        float buskuviFiyati=5.99f;

        //6.sira
        double altinGram= 0.53453456453456;
        double safran= 1.0984503978503;

        //ben sayisal olarak araligi nasil bulurum
        int minValue= Integer.MIN_VALUE;
        System.out.println(minValue);
        int maxValue= Integer.MAX_VALUE;
        System.out.println(maxValue);

        long minLong= Long.MIN_VALUE;
        long maxLong= Long.MAX_VALUE;


    }




}

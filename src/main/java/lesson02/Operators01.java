package lesson02;

public class Operators01 {
    public static void main(String[] args) {
       /*  1)Java'da "logical operator" ler:
        AND ve OR
                i) AND(&&) işleminden true alabilmek için her şey true olmalıdır.
                AND işleminde bir tane false sonucu false yapar.

                ii)OR isleminde(||) bir tane true sonucu true yapmaya yeter
                OR isleminde sonuucn false olmasi icim hersey false olmalidir.


                iii) NOT Operatoru(!) true olani false, false olani true yapar.
        !true = false
        !false = true
        !!true = true

        2)Comparison(Karsilastirma) Operators
                <, >, <=, >=, ==, !=
        Note: Karsilastirma operatorlerini kullandiginizda kesinlike boolean(true veya false) alirsiniz.

                Note: Biz AND islemi icin "&&" kullaniriz ama "&" kullanim da gecerlidir.
                Farklari nedir?
                "&&" kullanim ilk ifade "false" oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir.
                "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
        Bu yuzden biz hep "&&" kullaniriz.
                */
       // if(int a==0 & int b>25 & c>9) // a yanlış olsa da b ve c'yi kontrol eder. İşlem 3 saniye sürer. İşlem sonucunda yine kod çalışmaz.
       //     if(int a==0 && int b>25 && c>9) //a yanlış ise diğerlerini kontrol etmez. İşlem 1 saniyede biter. İşlemi bitirir.

        //1.OPERATOR
        String word ="WIEW all CART";
        if(word.contains("VIEW") && word.contains("CART")){ //&& mükemmeliyetçidir. Her şey tam olmalı
            System.out.println("Ve kontrolünde Başarılı !!!! ");
        }else {
            System.out.println("Ve kontrolünde BaşarıSIZ !!!! ");
        }

        //2.OPERATOR
        if(word.contains("VIEW") || word.contains("CART")){ // || Polyannadır. Bir şey tam ise ona yeter
            System.out.println("Veya kontrolünde Başarılı !!!! ");
        }else {
            System.out.println("Veya kontrolünde BaşarıSIZ !!!! ");
        }

        //3.OPERATOR
        int a=45, b=466;
        if(a==b)
            System.out.println("İşlem birbirine eşit sayılardan oluşuyor !!!! ");
        else
            System.out.println("İşlem birbirine eşit OLMAYAN sayılardan oluşuyor !!!! ");


        //4.OPERATOR
        if(a!=b)
            System.out.println("eşit değil !!!! ");
        else
            System.out.println("WEŞİT DEĞİL !!!! ");

    }
}

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
        int a=500, b=1;
        if(a==b) //iki variable in birbirine esit olup olmadigini sorgular
            System.out.println("İşlem birbirine eşit sayılardan oluşuyor !!!! ");
        else
            System.out.println("İşlem birbirine eşit OLMAYAN sayılardan oluşuyor !!!! "); //sonuc burasi cunku a!=b


        //4.OPERATOR
        if(a!=b)  //iki variable in birbirine esit olmadinigi dogrular
            System.out.println("eşit değil !!!! ");
        else
            System.out.println("WEŞİT DEĞİL !!!! ");

        //5.OPERATOR kucuk buyuk
        if(a>b)
            System.out.println("A B'den buyuk");
        else if (a<b)
            System.out.println("A B'den kucuk");
            else
            System.out.println("Esit");

        //5.OPERATOR kucuk buyuk esit
        if(a>=b)
            System.out.println("A B'den buyuk");
        else
            System.out.println("A B'den buyuk degil");


        if(a<=b)
            System.out.println("A B'den kucuk");
        else
            System.out.println("A B'den kucuk degil");


        /*  3-  Java'da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur.
    Java'da "+" sembolu iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa "concatenation islemi" olur.
    "concatenation islemi" birlestirme yapar.
    Note: Concatenation islemlerinde Java matematikteki islem onceligi kurallarini kullanir.
    Islem onceligi kurallari: i)Once uslu sayilar ii)Parantez ici islemler yapilir iii)Carpma ve bolme iv)Toplama ve cikarma

 */
        String str = "Hayatta her an yeni bir başlangıçtır; bugün, yarının dünüdür, ve her sabah bir umuttur.";
        String text = "Geleceği parlak olanlar, daima dünün hatalarından ders alırlar.";
        String birlesmisHali= str + "  " +text;
        System.out.println("birlesmisHali = " + birlesmisHali);

        //bu ornekte concanitation yaptik, matematikteki toplama degil
        String tv= "$1000";
        tv=tv.replace("$", "");
        String radio= "$300";
        radio=radio.replace("$", "");
        String tvRadio= tv + " "+ radio;
        System.out.println("tvRadio = " + tvRadio);

        //burada matematikteki toplama islemi yaptik
        int rad= Integer.parseInt(radio);
        int tvFiyat= Integer.parseInt(tv);
        int toplam= rad + tvFiyat;
        System.out.println("toplam = " + toplam);

        int d= 35325;
        int e= 34;
        int f= d +e;
        System.out.println("f = " + f);

        //bu ornekte concanitation yaptik, matematikteki toplama degil
        String laptop= "$1500";
        int tablet=575;
        String toplamFiyat= laptop + tablet;
        int toplamFiyatlar= Integer.parseInt(laptop + tablet); //NumberFormatException verir cunku $ bir stringdir.
        System.out.println("toplamFiyat = " + toplamFiyat);
        System.out.println("toplamFiyatlar = " + toplamFiyatlar);

    }
    }


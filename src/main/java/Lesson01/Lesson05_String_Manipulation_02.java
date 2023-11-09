package Lesson01;

public class Lesson05_String_Manipulation_02 {
    public static void main(String[] args) {

/*
                                    Meshur Regex'ler

                1) Tum rakamlar ==> [0-9]
                2) Tum kucuk harfler ==> [a-z]
                3) Tum buyuk harfler ==> [A-Z]
                4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
                5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
                6) Tum noktalama isaretleri ==> \\p{Punct}
                7) Tum sesli harfler ==> [aeiouAEIOU]
                   x, q, w harfleri ==> [xqw]

                8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
                9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

                            Metacharacters
                1) \\w      [a-zA-Z0-9_]
                2) \\W      [^a-zA-Z0-9_]
                3) \\s      space, tab vd bosluk karakterleri
                4) \\S      space, tab vd bosluk karakterleri disindakiler
                5) \\d      [0-9]
                6) \\D      [^0-9]
                7) .        herhangi bir karakter
                8) \\n      alt satira gec
                9) \\t      tab
                10) \\r     satır başına dönüş karakteri
         */

String  ornek="Bir dediğimi iki etmiyor";
ornek= ornek.replaceAll("[a-zA-Z]", "9");
        System.out.println("ornek = " + ornek);

        ornek="Bir dediğimi iki etmiyor";
        ornek= ornek.replaceAll("[^a-z]", "11");
        System.out.println("ornek = " + ornek);

        ornek= "1 dediğimi 2 etmiyor";
       ornek= ornek.replaceAll("[0-9]", "K");
        System.out.println("ornek = " + ornek);

        //sifrede rakam var mı?
        ornek= "1 dediğimi 2 etmiyor";
        int buyukluk= ornek.length();
        System.out.println("buyukluk string hali = " + buyukluk);
        ornek= ornek.replaceAll("[^0-9]", ""); //replaceAll() ile regex kullanarak cok karakteri degistirebiliriz
         buyukluk= ornek.length(); // int buyukluk=2;
        System.out.println("buyukluk = " + buyukluk);
        if(buyukluk>0){
            System.out.println("Sifrede rakam bulunuyor  = " + buyukluk);
        }

        ornek= "1 dediğimi 2 etmiyor";
        ornek= ornek.replace("e", "?"); //replace() ile tek karakter silinip yerine tek karakter gelir
        System.out.println("ornek = " + ornek);
        ornek= ornek.replace("[^a-z]", "?"); //replace() ile regex kullanilamaz. sonucu degistirmez
        System.out.println("ornek = " + ornek);
    }
}

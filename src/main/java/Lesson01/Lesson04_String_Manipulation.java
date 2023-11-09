package Lesson01;

import java.util.Arrays;

public class Lesson04_String_Manipulation {
    public static void main(String[] args) {

        String str= " Java is easy for me ";

        //Example 1: str stringindeki tum harfleri buyuk yap
        str.toUpperCase(); //bir variable icine koymazsak str metni hic bir degisiklige ugramaz.
        System.out.println("str = " + str); //str = Java is easy for me
        String text= str.toUpperCase();
        System.out.println("text = " + text);//text = JAVA İS EASY FOR ME

//        StringBuffer t=new StringBuffer();
//        t.append("hakan");
//        System.out.println("t = " + t);
//        StringBuilder c= new StringBuilder();
//        c.append("abbas");
//        System.out.println("c = " + c);

        //Example 2: str icindeki tum harfleri kucuk yap
        String lower= str.toLowerCase();
        System.out.println("lower = " + lower);  //lower = java is easy for me

        //Example 3: str deki ilk karakteri aliniz
        String tekKarakter= String.valueOf(str.charAt(0));
        System.out.println("tekKarakter = " + tekKarakter);
        char chr=str.charAt(5);
        System.out.println("chr = " + chr);

        //Example 4: str deki karakter sayisini bulunuz
        int sayi= str.length();
        System.out.println("sayi = " + sayi);

        //Example 4: str icindeki "easy" kelimesini aliniz
        String ilk= str.substring(7); // bir noktadan baslar, sonuna kadar alir
        System.out.println("ilk = " + ilk);

        String iki= str.substring(7, 12); //bir noktadan baslar, verilen araligi alir.
        System.out.println("iki = " + iki);

        //Example 5: str "money" kelimesini icerir mi?
        boolean varMi= str.contains("money"); //@ isareti var mi?
        System.out.println("varMi = " + varMi);

        //Example 6: str metni "hakan" ile baslar mi?
        boolean hakanMi=str.equalsIgnoreCase("hakan");
        System.out.println("hakanMi = " + hakanMi);

        boolean esitMi=str.equals("hakan");
        System.out.println("esitMi = " + esitMi);

        String hakan="hakan";
        boolean hakanEsitMi=str.equals(hakan);
        System.out.println("hakanEsitMi = " + hakanEsitMi);

        String text1= "Java is easy for me";
        boolean textEqualMi= str.equals(text1);
        System.out.println("textEqualMi = " + textEqualMi);

        //Example 7: asagideki texti int yapiniz
        String rakam= "1927";
        int sayilar= Integer.parseInt(rakam); //parseInt() ile stringler int 3 donusur

        //Example 8: str texti "ja" ile basliyor mu?
        boolean ja= str.startsWith("ja"); // email kontrolunde
        System.out.println("ja = " + ja);

        boolean jaBuyuk= str.equalsIgnoreCase("java is easy for me");
        System.out.println("jaBuyuk = " + jaBuyuk);

        boolean comMu= str.endsWith("yahoo.com"); // email kontrolunde
        System.out.println("comMu = " + comMu);

        String trimStirng= str.trim(); //bas ve sondaki bosluklari alir.
        System.out.println("trimStirng = " + trimStirng);

        String  aDegis= str.replace("a", "5"); //a yi 5 ile degistir.
        System.out.println("aDegis = " + aDegis);

        String eDegis= str.replaceAll("e", "7");
        System.out.println("eDegis = " + eDegis);

        int index= str.indexOf("for"); //f harfini gordugu indexi verir
        System.out.println("index = " + index);

        int aEnson= str.lastIndexOf("a");
        System.out.println("aEnson = " + aEnson);

        String [] sitiring=str.split(" "); //bosluk tusundan metni parcalar;
        System.out.println("sitiring = " + Arrays.toString(sitiring));

        String  [] aSplit= str.split("a");
        System.out.println("aSplit = " + Arrays.toString(aSplit));


//                replace()
//                replaceAll() anlat
    }
}

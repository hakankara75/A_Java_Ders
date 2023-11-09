package lesson02;

public class Method01 {
    public static void main(String[] args) {
   /*
                Java'da method nasil olusturulur?

                1)main method'un veya @Test anatosyonu disinda olusturulur
                2)Access Modifier + Return Type + Method Ismi + () + {}
Access Modifier public, protected, default, private:
                Olusturulan method'lar nasil kullanilir?
                1)main method'un veya @Test anatosyonunun icinden kullanilir
                2)method'un ismini + () yazin
                3)Islem yapacaginiz datalari parantezin icine koyun
         */
//1.yol
        toplamaYap(34534, 34);
    int sonuc= toplamaYap(34534, 34);
        System.out.println("sonuc = " + sonuc);
//2.yol
        System.out.println("toplamaYap(45, 35999) = " + toplamaYap(45, 35999));

        String yas=replaceAll_A_Z("Hakan 47 yasinda");
        System.out.println("yas = " + yas);

        String isim=replaceAll_0_9("Hakan 47 yasinda");
        System.out.println("isim = " + isim);

        String hiclik=replaceAllNothing("Ben, dun saat 12:45'te arkadasima gittim. Orada sunu gordum: Koca bir havuz!!!");
        System.out.println("hiclik = " + hiclik);
    }

    public static int toplamaYap(int a, int b){ //(int a, int b) kullanici a ve b seklinde 2 tane int versin. Metot onu toplayip hesaplasin.
        int add= a + b;
        return add;
    }

    static String replaceAll_A_Z(String string){
        String replace=string.replaceAll("[a-zA-Z]", "");
        return replace;

    }

    static String replaceAll_0_9(String string){
        String replace=string.replaceAll("[0-9]", "");
        return replace;
    }

    public static String replaceAllNothing(String string){
        String hiclik=string.replaceAll("[a-zA-Z0-9]", "");
        return hiclik;
    }
}

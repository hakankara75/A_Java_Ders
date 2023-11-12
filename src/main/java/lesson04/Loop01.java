package lesson04;

import java.lang.reflect.Array;
import java.util.*;

public class Loop01 {
    public static void main(String[] args) {
        // 1. fori
        //Example 1:
        for (int i = 15; i <= 20; i++) { //indexli yapilarda kullanilir
            System.out.println(i);
        }
/*
fori loop da int i = 5 kismi ve i <= 27 kisiminda oynama yaparak indexi daraltabiliriz.
Index uzerinde oynama veya indexe bagli islem olacaksa fori tercih ederiz.
 */

        //Example 2:
        //12000 den 23 e kadar tum cift sayilari ekrana yazdirin

        for (int i = 12000; i > 23; i--) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
        //Example 2:
        //sayilar arrayindeki cift sayilari yazdirin
        ArrayList<Integer> sayilar=new ArrayList<Integer>();
        sayilar.add(21454); //0. index
        sayilar.add(22); //1. index
        sayilar.add(3423); //2. index
        sayilar.add(345); //3. index
        sayilar.add(456); //4. index
        System.out.println("sayilar = " + sayilar);
        for (int i = 2; i < sayilar.size(); i++) { //size() ve length() java da index verir
            System.out.println("baktigi sayilar= " + sayilar.get(i));
                if(sayilar.get(i) % 2==0) { //sayilarin i nci elemani
                    System.out.println("cift sayilar = " + sayilar.get(i));
                };

        }

//for
        //Example 1
        //set ler tekrarsiz eleman tutar. eklemelerde rastgele siralar.
        Set<String> strings= new HashSet<String>(); //hızlı ekleme hızli silmede kullanilir
        strings.add("Merhaba Dünya");
        strings.add("Merhaba Dünya");
        strings.add("Yaşar");
        strings.add("Abbas");
        strings.add("Kehribar");
        strings.add("Hakan");
        strings.add("Hakan");

     //for da index uzerinden degil butun elemanlara islem yapar. Index sinirlamasi yapacaksak
        //fori ile calismaliyiz
        for (String text : strings) {
            String deneme= text.toLowerCase();
            System.out.println("set icindeki elemanlari yazdir = " + text);
            System.out.println("icinde var mi = " + deneme.contains("e"));

        }

//Example 2
        List<String > list=new ArrayList<>();
        list.add("hakana@gmail");
        list.add("kemal@yahoo");
        list.add("ferityahoo");
        list.add("leyla@hotmail");
        list.add("samet@hotmail");
        list.add("yusufhotmail");

        //list'deki mail adreslerinde "@" isareti olup olmadigini kontrol edin
        for (String liste: list){
           if(liste.contains("@")) {
               System.out.println("Dogru mail");
           }else {
               System.out.println("Yanlis mail adresi");
           }
        }//tum list elemanlarini kontrol eder

        //2. indexten sonraki mail adreslerinde "@" isareti olup olmadigini kontrol edin
        for (int i = 2; i <list.size() ; i++) {
            if(list.get(i).contains("@")){
                System.out.println("list.get(i) = " + list.get(i));
                System.out.println("Mail adresinde @ isareti var");
            }
        } //indexe gore islem yaptigindan verilen i degerindeki list elemanlarini kontorl eder.

    }
}

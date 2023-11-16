package lesson04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Loop03 {
    public static void main(String[] args) {
        // do while loop
        //kod her halukarda 1 kere calisir. cunku baslangic sarti yoktur.

        //Example
        int deger = 10;
        do { //her halukarda 1 kere calisir
            System.out.println("Sen bir do while loopsun : " + deger);
            deger--;
            System.out.println("deger son hali= " + deger);
        } while (deger > 10); //sart kontrolu int degerden yapilir


        // Example 2
        boolean dogruMu = false;
        int number = 1;
        do {
            if (number % 2 == 0) ;
            dogruMu = false;
            System.out.println("numb" + number);
            number++;
        } while (dogruMu); //sart kontrolu boolean degerden yapilir


        // Example 2
        List<String> list = new ArrayList<>();
        list.add("hakana@gmail"); // 0. eleman
        list.add("kemal@yahoo");
        list.add("ferityahoo");
        list.add("leyla@hotmail");
        list.add("samet@hotmail");
        list.add("yusufhotmail");

        boolean oyleMi = true;
        int i = 0;
        do { //sart yok
            System.out.println("list.contains(i) = " + list.get(i));
            if (list.contains("*")) ;
            oyleMi = true;
            i++;
        } while (oyleMi); //sart kontrolu yapilir

        //asagidaki fori kodu ile yukaridaki gibi hata alma riski ortadan kaldirilir
//        for (int j = 0; j < list.size(); j++) {
//            System.out.println("list.contains(i) = " + list.get(j));
//        }

/*
index uzerinde calismalarda fori kullanmak daha iyi olur. diger looplarda indexli variable ile calisilirsa hata alinabilir.
IndexOutOfBoundsException bu durumda karsilasilan hata turudur.
Bu tur hatalar ile karsilasmamak icin index uzerinde islem yapacaksak fori tercih edecegiz.
 */

    }

}

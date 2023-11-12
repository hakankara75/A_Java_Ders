package lesson04;

public class Loop02 {

    public static void main(String[] args) {
        //while loop da once sart kontrol edilir. sonra calisir. sart tutmazsa hic calismaz.
        //sonsuz loopa girme tehlikesi vardir.
        int sart=2; //baslangic degeri
        while (sart<11) { //bitis degeri, bizim sartimiz
            System.out.println(sart + ". rakam yazildi");
        sart++; //artirma while loop un icinde

        }

        //Example 2
        int kademe=23; //baslangic degeri
        while (kademe>12){//bitis degeri, bizim sartimiz
            System.out.println(kademe + ". rakam yazildi");
            kademe--;//artirma while loop un icinde
        }





    }
}

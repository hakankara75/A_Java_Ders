package Lesson01;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Lesson_03_Non_Primitive_DataType {
    public static void main(String[] args) {
        //NONPRIMITIVE
        //2-String
        //String text tipi data saklar.
        String string="Merhaba arkadaşlar";
        String tex="345643654765";
        String karakter=")[½$#]";
        String tekKarakter="R";
        String bosluk=" ";
        String hiclik="";
        String hic; //initialize edilmedi. Bu haliyle calismaz.
        System.out.println("hiclik = " + hiclik);
        hic="Merhaba"; //initialize edildi.
        System.out.println("hic = " + hic);

        //integer i stringe cevirme
        Integer rakam=3453456;
        hiclik="5453+%EFGSDB345t60";
        System.out.println("hiclik = " + hiclik);
        String  yazi= rakam.toString();
        System.out.println(yazi);

        //integer i stringe cevirme
        String text= String.valueOf(rakam);
        System.out.println("text = " + text);

        hiclik="Bu son hali";
        System.out.println("hiclik = " + hiclik);

        //2.NonPrimitive Array
        String java= "Java, 1995 yılında Sun Microsystems tarafından yayınlanmış bir hesaplama platformu ve programlama dilidir.";
        String []yaziArray= java.split("");//hic veya yokluktan parcala array'e ata
        System.out.println(Arrays.toString(yaziArray)); //arraylerin yazdirma komutu
        System.out.println("java = " + java);

        //3.Multi Dimensional Arrays (Nonprimitive)
        String [][] str= new String[][]{{"Ali, Ayşe, Hakan"}, {"Yunus, Gamze"}, {"4353,43534,3435"}};
        Integer [][] inte= new Integer[][]{{34,345}, {3453, 345456}};
        System.out.println(Arrays.deepToString(str)); // multi dimensional yazdirma komutu


        //4. Array List (Nonprimitive)
        List<String> animals= new ArrayList<>();
        animals.add("Kedi");
        animals.add("Köpek");
        animals.add("Güvercin");
        System.out.println("animals = " + animals);

        //5. Date Time (Nonprimitive)
        LocalTime myTime= LocalTime.now(); //bulundugum yer saati 12 saatlik dilime gore calisir
        System.out.println("myTime = " + myTime); //19:29:17.249363600

        DateTimeFormatter dateTime= DateTimeFormatter.ofPattern("hh-mm a");
        System.out.println(dateTime.format(myTime)); //myTime al. formatini dateTime'a gore degistir
        DateTimeFormatter dateTime1= DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(dateTime1.format(myTime)); //myTime al. formatini dateTime'a gore degistir

        //Sets tekrarsiz eleman saklar (Nonprimitive)
        Set<String > isimler= new HashSet<>(); //Hashset eklemeyi hizli yapar. Eklediklerini siraya koymaz.
        isimler.add("35434");
        isimler.add("35434");
        isimler.add("35434");
        isimler.add("5342");
        isimler.add("Lale");
        isimler.add("Zeki");
        System.out.println("isimler = " + isimler);

        Set<String> isim = new TreeSet<>();
        isim.add("35434");
        isim.add("5342");
        isim.add("Lale");
        isim.add("Zeki");

        System.out.println("isim = " + isim);

        //Map (Nonprimitive)
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm);// {}

        //HashMap'lere nasil entry eklenir?
        hm.put("elma", 15);
        hm.put("armut", 25);
        hm.put("muz", 30);




    }

}

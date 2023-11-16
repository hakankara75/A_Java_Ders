package lesson05;

public class Exceptions01 {
    public static void main(String[] args) {
        // 1- kodlarimizda hata alip kodlari durdurmamak icin
        //2- kodu zorlayip calistirmak icin
        // Example 1
        String string="123 KKKK"; //positive scenario
//        int result= Integer.parseInt(string);

        int result2= convertWithStringToInteger(string); //primitive variable deger 0 dir.
        System.out.println("result2 = " + result2);
//bu kodda NumberFormatException alabiliriz
    }

    private static int convertWithStringToInteger(String string){
        int i=0;
        try {
     i= Integer.valueOf(string);
            System.out.println("Burasi try bolumu");
}catch (Exception exception) { //exceptionlarin atasidir.
            //exception.printStackTrace(); renkli hata mesaji almak istersek bunu yazariz
            System.out.println("Bu string harf icermektedir");
            System.out.println(exception.getMessage()); //hatayi gosterme mesaji

}


        return i;


    }
}

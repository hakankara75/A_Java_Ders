package lesson03;

public class IfStatement01 {
    public static void main(String[] args) {
        int num= 568;

        //1. yol:
        if(num % 2 == 0) {
            System.out.println("num degeri cifttir = " + num);
        }

        if(num % 2 != 0) {
            System.out.println("num degeri tektir = " + num);
        }

        //2. yol:
        if(num % 2 == 0) {
            System.out.println("Cift sayi = " + num);
        }
        else{
            System.out.println("num degeri tektir = " + num);
        }

        //3. yol:
        String aylar="Aprihl";
        if(aylar.equalsIgnoreCase("January")) {
            System.out.println("Bu ay " + 1 + ". aydir");
        } else if (aylar.equalsIgnoreCase("February")) {
            System.out.println("Bu ay " + 2 + ". aydir");
        }else if (aylar.equalsIgnoreCase("March")) {
            System.out.println("Bu ay " + 3 + ". aydir");
        }else if (aylar.equalsIgnoreCase("April")) {
            System.out.println("Bu ay " + 4 + ". aydir");
        }else if (aylar.equalsIgnoreCase("May")) {
            System.out.println("Bu ay " + 5 + ". aydir");
        }else if (aylar.equalsIgnoreCase("June")) {
            System.out.println("Bu ay " + 6 + ". aydir");
        }else if (aylar.equalsIgnoreCase("July")) {
            System.out.println("Bu ay " + 7 + ". aydir");
        }else if (aylar.equalsIgnoreCase("August")) {
            System.out.println("Bu ay " + 8 + ". aydir");
        }else if (aylar.equalsIgnoreCase("September")) {
            System.out.println("Bu ay " + 9 + ". aydir");
        }else if (aylar.equalsIgnoreCase("October")) {
            System.out.println("Bu ay " + 10 + ". aydir");
        }else if (aylar.equalsIgnoreCase("November")) {
            System.out.println("Bu ay " + 11 + ". aydir");
        }else if (aylar.equalsIgnoreCase("December")) {
            System.out.println("Bu ay " + 12 + ". aydir");
        }else {
            System.out.println("Invalid month name...");
        }

    }
}

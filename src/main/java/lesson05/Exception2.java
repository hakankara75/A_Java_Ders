package lesson05;

public class Exception2 {
    public static void main(String[] args) {
        String [] array= {"Hakan", "Abbas", "Keriman", "Ebrar"};

        getElementFromArray(array, 2); //positive scenario
        getElementFromArray(array, 4); //negative scenario ArrayIndexOutOfBoundsException verir
    }

    private static void getElementFromArray(String[] arr, int i) {

       try {
           System.out.println("Merhaba. Try'dan sonra attigin sout kodu calisacak simdi");
           System.out.println("arr[i] = " + arr[i]);
       }catch (Exception e) {

           System.out.println("Arrayin indexinde olmayan data iste budur = " + e.getMessage());

           //e.printStackTrace(); renkli hata mesaji verir
           System.out.println("Burasi hata ile ilgili olan renkli kisim");

       }



    }
}

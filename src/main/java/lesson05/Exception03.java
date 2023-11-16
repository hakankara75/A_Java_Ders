package lesson05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception03 {
    public static void main(String[] args) {


        FileInputStream fileInputStream=null; // FileInputStream ile Microsoft Office dosyalari uzerinde islem yapariz.
            try {
                fileInputStream = new FileInputStream("src/main/java/lesson05/exception.txt");
            }catch (FileNotFoundException e){
                e.printStackTrace();
              //  System.out.println("Verilen dosya bulunamadi");
            }


    }
}

package lesson03;

public class IfStatement02 {
    public static void main(String[] args) {

        //Example 1:
        int a=2, b=34, c=345;
        String ucgen= "ÜçgenRRRRRR";
        if(a<=0 || b<=0 ||c<=0){
            System.out.println( "Bu bir ucgen degildir");
        } else if (ucgen.equals("Üçgen")) { //1. sart
            if (a==b && b==c && a==c){ //2. sart
                System.out.println("Bu hem üçgendir hem de eşkanardır");
            }else {
                System.out.println("Üçgen ama eşkanar değil");
            }
        }else {
            System.out.println("Bu bir ucgendir ama çeşitkenar üçgendir");
        }

        //Example 2:
        String password="A23hakan.";
        char firstChar=password.charAt(0);
        if(firstChar>='A' && firstChar<='Z'){
            if(firstChar=='A'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("Gecersiz password cunku A degil...");
            }
        } else if (firstChar >= 'a' && firstChar <= 'z') {
                if(firstChar=='z'){
                    System.out.println("Gecerli password");
                }else {
                    System.out.println("Gecersiz password cunku z degil...");
                }
            }else {
            System.out.println("Ilk character harf olmali");
        }


    }
}

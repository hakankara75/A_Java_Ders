package lesson03;

public class Switch01 {
    public static void main(String[] args) {

//Example 1
        String dayName="Monday";
        switch (dayName){
            case "Sunday":
                System.out.println(1);
                break;
            case "Monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("lutfen gecerli gun ismi giriniz");
        }

        //Example 2
        String countryName= "US";
        switch ((countryName.toLowerCase())){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albenia":
                System.out.println("AL");
                break;
            default:
                System.out.println("Bu listede kayitli bir ulke degildir");
        }
    }
}

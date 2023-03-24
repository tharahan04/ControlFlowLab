import java.sql.SQLOutput;
import java.util.Scanner;

public class ClothesWeather {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in) ;

        System.out.println("Please describe the weather (eg. sunny, rainy, snow)");
        String weather = reader.nextLine();

        System.out.println("Please enter the temperature in Celsius");
        int temp = reader.nextInt() ;

        if(weather.toLowerCase().equals("sunny") && temp >8) {  // use .toLowerCase to force a lower case input from user
            System.out.println("Short sleeve and shorts");
        }
        if(weather.toLowerCase().equals("sunny") && temp < 8) {
            System.out.println("Sunglasses and speedo");
        }


    }
}

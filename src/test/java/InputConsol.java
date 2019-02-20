import java.util.*;

public class InputConsol {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);

       String day,mouht;
        System.out.println("Какой сегодня день ?");
        day=input.nextLine();


        System.out.println( "Какой месяц?");
        mouht=input.nextLine();

        String text ;

        text= "сегодня - "+ day + " месяц - " + mouht;

        System.out.println(text);



   }

}

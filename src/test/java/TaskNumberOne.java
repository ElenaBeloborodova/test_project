import java.util.Scanner;
public class TaskNumberOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число a");

        double a = input.nextDouble();

        System.out.println("Введите второе число b");

        double b = input.nextDouble();

        if (Math.abs(20 - a) == Math.abs(20 - b)) {
            System.out.println("Числа а и в равноудалены от 20");

        } else if (Math.abs(20 - a) > Math.abs(20 - b)) {
            System.out.println("Ближайшее число к 20 = " + b);
        } else {
            System.out.println("Ближайшее число к 20 = " + a);
        }
    }
}

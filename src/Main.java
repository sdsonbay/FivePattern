import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int five = 5;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        pattern(number, five, counter);
    }

    public static void pattern(int number, int five, int counter){
        if(number >= 0){
            subtract(number, five, counter);
        }
        else{
            add(number, five, counter);
        }
    }

    public static void subtract(int number, int numberToSubtract, int counter){
        if(number > 0){
            System.out.print(number + " ");
            counter++;
            number -= numberToSubtract;
            subtract(number, numberToSubtract, counter);
        }
        else{
            add(number, numberToSubtract, counter);
        }
    }

    public static void add(int number, int numberToAdd, int counter){
        if(counter >= 0){
            System.out.print(number + " ");
            counter--;
            number += numberToAdd;
            add(number, numberToAdd, counter);
        }
        else{
            return;
        }
    }
}

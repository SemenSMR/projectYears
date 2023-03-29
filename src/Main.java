import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, day ,days = 0 ,count = 0;
        while (true) {
            System.out.print("Введите год: ");
            year = scanner.nextInt();
            System.out.print("Введите количество дней: ");
            day = scanner.nextInt();
              if (year % 400 == 0 || year % 400 != 0 && year % 100 != 0 && year % 4 == 0) {
                days = 366;
            } else if ( year % 100 == 0 || year % 400 != 0 && year % 100 != 0 && year % 4 != 0) {
                days = 365;
            }
            if (days == day){

            }
            else {
                System.out.println("Неправильно! В этом году " + days + " дней!");
                System.out.println("Набрано очков: " + count);
            }
        }
    }
}
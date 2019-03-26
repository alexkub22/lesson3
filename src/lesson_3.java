import java.util.Random;
import java.util.Scanner;

public class lesson_3 {
/* 1. Написать программу, которая загадывает случайное число
от 0 до 9, и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить больше ли указанное
пользователем число чем загаданное, или меньше. После победы или проигрыша
выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(11);

            System.out.println("Загаданное число от 0 до 10, угадай число с 3 попыток.");
            for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Введите число: ");
            int a = sc.nextInt();

            if (a < x) {
                System.out.println("Мое число больше!");
            }
            if (a > x) {
                System.out.println("Мое число меньше!");
            }
            if (a == x) {
                System.out.println("Вы угадали!");
            }

            System.out.println("Сиграем еще? Да-1 / Нет-0");

            a = sc.nextInt();
            if (a == 1) {
                main(String[] args)
            }else{
                System.out.println("Спасибо за игру!");
            }
            }
            System.out.println("Вы не угадали :(");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a == 1) {
                main(String[] args)
            } else {
                System.out.println("Спасибо за игру!");
            }

    }
}
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
        Random rand = new Random();
        int x = rand.nextInt(11);
        System.out.println("x " + x);
        Scanner sc = new Scanner(System.in);
        System.out.println("отгадай число от 1 до 10: ");
        int a = sc.nextInt();


        if (a == x){
                System.out.println("ты отгадал, повторим ? Да-1/Нет-2");
                int b =sc.nextInt();
                if (b=1){

                }
            }else if (a<x){
                System.out.println("загаданное число больше");
            }else if (a>x){
                System.out.println("загаданное число меньше");
        }




    }

}

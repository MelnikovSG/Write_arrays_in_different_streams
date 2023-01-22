import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Программа для записи массивов в файл с использованием нитей: ");
        System.out.println("Введите количество нитей для запуска");
        ArrayList<Thread> th = new ArrThread().crArrThread(sc.nextInt());

        for(Thread t: th){
            t.start();
            t.join();
        }
    }
}
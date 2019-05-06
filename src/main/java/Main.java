import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Текущий поток: " + mainThread.getName());

// Меняем имя и выводим в текстовом поле
        mainThread.setName("HelloProjectThread");
        System.out.println("Новое имя потока: " + mainThread.getName());
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int input = in.nextInt();
    }
}

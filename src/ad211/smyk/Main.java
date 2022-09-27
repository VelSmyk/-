package ad211.smyk;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkArray(); //task1
        FizzBuzz(); //task2
        checkPartArray(); //task3
    }

    static void checkArray() {
        Scanner in = new Scanner(System.in);
        int size;
        boolean check = true;
        do {
            System.out.print("Input size of array(from 2): ");
            size = in.nextInt();
        } while (size < 2); //задаємо розмір масиву, мінімальний розмір - 2 єлементи
        int[] array = new int[size]; // ініціалізація масиву
        for (int i = 0; i < size; i++) {
            System.out.println("Input [" + i + "] element: ");
            array[i] = in.nextInt(); // заповнюємо масив
            if (i >= 1 && array[i] < array[i - 1]) { //перевірка кожного елемента
                check = false;
            }
        }
        System.out.println(check + "\n"); // вивід результату

    }

    static void FizzBuzz() {
        String firstWord = "Fizz", secondWord = "Buzz";
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(firstWord+secondWord);
            } else if(i % 3 == 0){
                System.out.println(firstWord);
            } else if(i % 5 == 0) {
                System.out.println(secondWord);
            } else {
                System.out.println(i);
            }
        }
        System.out.println(" \n");
    }
    private static void checkPartArray() {
        Scanner in = new Scanner(System.in);
        int size2, sumOfFirstPart=0, sumOfSecondPart=0;
        boolean check2 = true;
        do {
            System.out.print("Input size of array(from 2): ");
            size2 = in.nextInt();
        } while (size2 < 2); // задання розміру масиву
        int[] array2 = new int[size2]; // ініціалізація масиву
        for (int i = 0; i < array2.length; i++) { //цикл для заповнення масиву та його перевірки
            System.out.println("Input [" + i + "] element: ");
            array2[i] = in.nextInt();
            if(array2.length % 2 == 0){ //перевірка на парну кіл-ть елементі
                if (i < array2.length/2) {
                    sumOfFirstPart+=array2[i]; //знаходження суми єлементів першої половини масиву
                }
                else{
                    sumOfSecondPart+=array2[i]; //знаходження суми єлементів другої половини масиву
                }
            }
            else {
                if (i <= array2.length/2) {
                    sumOfFirstPart+=array2[i];
                }
                else{
                    sumOfSecondPart+=array2[i];
                }
            }
        }
        if(sumOfFirstPart != sumOfSecondPart){ //перевірка на рівність сум першої та другої половинин масиву
            check2 = false;
        }
        System.out.println(check2); // вивід результату

    }
}

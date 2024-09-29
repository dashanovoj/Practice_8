import java.util.Scanner;

public class NumberReverse {

    // Метод, вызывающий рекурсивный метод
    public static int reverse(int n) {
        return helper(n, 0);
    }

    // Вспомогательный рекурсивный метод (передаем число n и reversed - для сборки результата)
    private static int helper(int n , int reversed) {
        if (n == 0) return reversed; // обратный порядок чисел полностью собран в reversed
        /* n / 10 - убираем последнюю цифру числа,
        n % 10 - возвращаем последнюю цифру числа
        reversed * 10 + n % 10 - добавляем последнюю цифру числа в начало результата */
        else return helper(n / 10, reversed * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        System.out.println("Число " + n + " в обратном порядке: " + reverse(n));
    }

}

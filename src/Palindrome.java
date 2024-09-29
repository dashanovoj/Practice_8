import java.util.Scanner;
public class Palindrome {

    // Создаём метод булева типа, определяющий, является ли слово палиндромом
    public static boolean isPalindrome(String s) {

        // если длина слова равна нулю или единице - это палиндром
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        // если первый символ строки равен последнему символу строки
        if (s.charAt(0) == s.charAt(s.length() - 1)) { // метод charAt возвращает символ, расположенный по указанному индексу строки
            /* метод substring возвращает подстроку, с начального индекса до конечного индекса (не включая его)
            рекурсивно проходимся по строке, каждый раз создавая новую подстроку из меньшего количества символов */
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        // иначе возвращаем ложь
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String s = sc.nextLine();
        if (isPalindrome(s)) {
            System.out.println("Слово '" + s + "' является палиндромом");
        }
        else System.out.println("Слово '" + s + "' не является палиндромом");
    }

}
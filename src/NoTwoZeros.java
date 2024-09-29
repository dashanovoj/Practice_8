import java.util.Scanner;
public class NoTwoZeros {

    // Создаём метод типа Integer, который возвращает количество последовательностей
    public static int Sequence(int a, int b) {
        // Нулей больше, чем единиц - нужной последовательности не существует
        if (a > b + 1) return 0;
        // Если единиц или нулей нет - существует 1 последовательность
        if (a == 0 || b == 0) return 1;
        /* Первая рекурсия - кол-во последовательностей, начинающихся с единицы
        Вторая рекурсия - кол-во последовательностей, начинающихся с нуля, после которого следует единица */
        return Sequence(a, b - 1) + Sequence(a - 1, b - 1); // сумма этих двух значений (общее кол-во последовательностей)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество нулей: ");
        int a = sc.nextInt();
        System.out.println("Введите количество единиц: ");
        int b = sc.nextInt();
        System.out.println("Количество последовательностей: " + Sequence(a, b));
    }

}

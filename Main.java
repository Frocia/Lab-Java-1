import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lab lab = new Lab();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Меню заданий:\n" +
                        "1. Дробная часть\n" +
                        "2. Модуль числа\n" +
                        "3. Букву в число\n" +
                        "4. Тридцать пять\n" +
                        "5. Двузначное\n" +
                        "6. Тройной максимум\n" +
                        "7. Диапазон\n" +
                        "8. Двойная сумма\n" +
                        "9. Равенство\n" +
                        "10. День недели\n" +
                        "11. Числа подряд\n" +
                        "12. Четные числа\n" +
                        "13. Длина числа\n" +
                        "14. Квадрат\n" +
                        "15. Правый треугольник\n" +
                        "16. Поиск максимального\n" +
                        "17. Добавление массива в массив\n" +
                        "18. Возвратный реверс\n" +
                        "19. Все вхождения\n" +
                        "0. Выход");
                System.out.print("Выберите задание: ");
                int choice = scanner.nextInt();
                if (choice == 0) break;

                switch (choice) {
                    case 1:
                        System.out.print("Введите число x: ");
                        double x = scanner.nextDouble();
                        System.out.println("Дробная часть: " + lab.fraction(x));
                        break;
                    case 2:
                        System.out.print("Введите число x: ");
                        int n = scanner.nextInt();
                        System.out.println("Модуль числа: " + lab.abs(n));
                        break;
                    case 3:
                        System.out.print("Введите символ '0'-'9': ");
                        char c = scanner.next().charAt(0);
                        System.out.println("Число: " + lab.charToNum(c));
                        break;
                    case 4:
                        System.out.print("Введите число x: ");
                        int val = scanner.nextInt();
                        System.out.println("Делится на 3 или 5: " + lab.is35(val));
                        break;
                    case 5:
                        System.out.print("Введите число x: ");
                        int two = scanner.nextInt();
                        System.out.println("Двузначное: " + lab.is2Digits(two));
                        break;
                    case 6:
                        System.out.print("Введите три числа: ");
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        int c1 = scanner.nextInt();
                        System.out.println("Максимум: " + lab.max3(a, b, c1));
                        break;
                    case 7:
                        System.out.print("Введите границы a и b и число num: ");
                        int a1 = scanner.nextInt();
                        int b1 = scanner.nextInt();
                        int num = scanner.nextInt();
                        System.out.println("В диапазоне: " + lab.isInRange(a1, b1, num));
                        break;
                    case 8:
                        System.out.print("Введите два числа: ");
                        int s1 = scanner.nextInt();
                        int s2 = scanner.nextInt();
                        System.out.println("Двойная сумма: " + lab.sum2(s1, s2));
                        break;
                    case 9:
                        System.out.print("Введите три числа: ");
                        int eq1 = scanner.nextInt();
                        int eq2 = scanner.nextInt();
                        int eq3 = scanner.nextInt();
                        System.out.println("Все равны: " + lab.isEqual(eq1, eq2, eq3));
                        break;
                    case 10:
                        System.out.print("Введите день недели (1-7): ");
                        int dayNum = scanner.nextInt();
                        System.out.println("День: " + lab.day(dayNum));
                        break;
                    case 11:
                        System.out.print("Введите число x: ");
                        int listNum = scanner.nextInt();
                        System.out.println(lab.listNums(listNum));
                        break;
                    case 12:
                        System.out.print("Введите число x: ");
                        int chetNum = scanner.nextInt();
                        System.out.println(lab.chet(chetNum));
                        break;
                    case 13:
                        System.out.print("Введите число x: ");
                        long lenNum = scanner.nextLong();
                        System.out.println("Длина числа: " + lab.numLen(lenNum));
                        break;
                    case 14:
                        System.out.print("Введите размер квадрата: ");
                        int sq = scanner.nextInt();
                        lab.square(sq);
                        break;
                    case 15:
                        System.out.print("Введите высоту треугольника: ");
                        int right = scanner.nextInt();
                        lab.rightTriangle(right);
                        break;
                    case 16:
                        System.out.print("Введите размер массива: ");
                        int size = scanner.nextInt();
                        int[] arr = new int[size];
                        System.out.print("Введите элементы: ");
                        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
                        System.out.println("Максимум по модулю: " + lab.maxAbs(arr));
                        break;
                    case 17:
                        System.out.print("Введите размер массива arr: ");
                        int size1 = scanner.nextInt();
                        int[] arr1 = new int[size1];
                        System.out.print("Введите элементы arr: ");
                        for (int i = 0; i < size1; i++) arr1[i] = scanner.nextInt();
                        System.out.print("Введите размер массива ins: ");
                        int size2 = scanner.nextInt();
                        int[] ins = new int[size2];
                        System.out.print("Введите элементы ins: ");
                        for (int i = 0; i < size2; i++) ins[i] = scanner.nextInt();
                        System.out.print("Введите позицию вставки: ");
                        int pos = scanner.nextInt();
                        System.out.println("Результат: " + Arrays.toString(lab.add(arr1, ins, pos)));
                        break;
                    case 18:
                        System.out.print("Введите размер массива: ");
                        int size3 = scanner.nextInt();
                        int[] arr3 = new int[size3];
                        System.out.print("Введите элементы: ");
                        for (int i = 0; i < size3; i++) arr3[i] = scanner.nextInt();
                        System.out.println("Реверс: " + Arrays.toString(lab.reverseBack(arr3)));
                        break;
                    case 19:
                        System.out.print("Введите размер массива: ");
                        int size4 = scanner.nextInt();
                        int[] arr4 = new int[size4];
                        System.out.print("Введите элементы: ");
                        for (int i = 0; i < size4; i++) arr4[i] = scanner.nextInt();
                        System.out.print("Введите число для поиска: ");
                        int xFind = scanner.nextInt();
                        System.out.println("Все вхождения: " + Arrays.toString(lab.findAll(arr4, xFind)));
                        break;
                    default:
                        System.out.println("Некорректный ввод!");
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ошибка ввода, попробуйте снова.");
                scanner.nextLine();
            }
        }
    }
}

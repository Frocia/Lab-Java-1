class Lab {

    // 1. Дробная часть
    public double fraction(double x) {
        return x - (int) x;
    }

    // 3. Букву в число
    public int charToNum(char x) {
        return x - '0';
    }

    // 5. Двузначное
    public boolean is2Digits(int x) {
        return x >= 10 && x <= 99 || x <= -10 && x >= -99;
    }

    // 7. Диапазон
    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    // 9. Равенство
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // 1. Модуль числа
    public int abs(int x) {
        return x < 0 ? -x : x;
    }

    // 3. Тридцать пять
    public boolean is35(int x) {
        boolean div3 = x % 3 == 0;
        boolean div5 = x % 5 == 0;
        return (div3 ^ div5); // true, если делится на 3 или 5, но не на оба
    }

    // 5. Тройной максимум
    public int max3(int x, int y, int z) {
        int max = x > y ? x : y;
        return max > z ? max : z;
    }

    // 7. Двойная сумма
    public int sum2(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 19 ? 20 : sum;
    }

    // 9. День недели
    public String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    // 1. Числа подряд
    public String listNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }

    // 3. Четные числа
    public String chet(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }

    // 5. Длина числа
    public int numLen(long x) {
        int len = 0;
        if (x == 0) return 1;
        while (x != 0) {
            x /= 10;
            len++;
        }
        return len;
    }

    // 7. Квадрат
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("*".repeat(x));
        }
    }

    // 9. Правый треугольник
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(" ".repeat(x - i));
            System.out.println("*".repeat(i));
        }
    }

    // 3. Поиск максимального по модулю
    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (Math.abs(val) > Math.abs(max)) {
                max = val;
            }
        }
        return max;
    }

    // 5. Добавление массива в массив
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }

    // 7. Возвратный реверс
    public int[] reverseBack(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }

    // 9. Все вхождения
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int val : arr) if (val == x) count++;
        int[] res = new int[count];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) if (arr[i] == x) res[idx++] = i;
        return res;
    }
}

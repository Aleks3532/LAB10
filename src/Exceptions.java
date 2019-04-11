import java.lang.Exception;

public class Exceptions {

    public static void Arif_ExC() {
        int d, а;
        try {
            d = 0;
            а = 42 / d;
        } catch (ArithmeticException е) {
            System.out.println("Дeлeниe на нуль. Пocлe оператора catch.");
            System.out.println("Описание исключения: " + е);
        }
    }

    public static void Array_ExC() {
        int[] d = new int[6];
        try {
            d[7] = 4;
        } catch (ArrayIndexOutOfBoundsException е) {
            System.out.println("Запрос элемента за пределами массива.");
            System.out.println("Описание исключения: " + е);
        }
    }

    public static void Catches(int a) throws Exception{
        if(a >= 0 && a < 10)
            throw new Exception("int " + a);
        if(a >= 10 && a < 15)
            throw new Exception("float " + a);
        if(a >= 15 && a <= 20)
            throw new Exception("String " + a);
        if(a > 20)
            throw new Exception("All " + a);
    }
}

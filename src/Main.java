public class Main {

    public static void main(String[] args) {
        Exceptions.Arif_ExC();
        Exceptions.Array_ExC();
        try {
            Exceptions.Catches(10);
        } catch (Exception e) {
            System.out.println("Описание исключения: " + e);
        }
        try {
            MyExceptions.my_exc(5);
        }catch (MyExceptions.MyException m) {
            System.out.println("Описание исключения: " + m);
        }
    }
}




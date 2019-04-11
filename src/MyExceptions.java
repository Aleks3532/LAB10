import java.util.Date;

public class MyExceptions {

     static class MyException extends Exception {
        private  int  id;
        Date time = new Date();
        MyException(int а) {
            id = а;
        }
        public String toString(){
            return id + " MyException " + time;
        }
    }

    public static void my_exc(int a) throws MyExceptions.MyException {
        if (a > 2) {
            throw new MyExceptions.MyException(a);
        }
    }
}

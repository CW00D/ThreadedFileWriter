public class InputOutputProcessor extends BasicThread{
    public static void main(String[] args){
        BasicThread thread1 = new BasicThread();
        BasicThread thread2 = new BasicThread();
        thread1.start();
        thread2.start();
    }
}

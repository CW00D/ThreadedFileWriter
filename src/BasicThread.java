public class BasicThread extends Thread{
    public void run(){
        for(;;){
            System.out.println("Hello from a thread");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

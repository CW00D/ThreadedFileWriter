import java.io.IOException;

public class WriteToFileThread extends BasicThread implements WriteToFileEventListener{
    WriteToFileThread() throws IOException {
        super();
    }

    public void eventOccurred(WriteToFileEvent event) throws IOException {
        System.out.println(event);
        //this.writeToFile(event.getMessage());
    }
}

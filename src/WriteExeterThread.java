import java.io.IOException;

public class WriteExeterThread extends BasicThread implements  WriteExeterEventListener{
    WriteExeterThread() throws IOException {
        super();
    }

    public void eventOccurred(WriteEvent event) throws IOException {
        //this.writeToFile(evt.getMessage());
    }
}

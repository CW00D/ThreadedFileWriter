import java.io.IOException;

public class WriteUniversityThread extends BasicThread implements WriteUniversityEventListener{
    WriteUniversityThread() throws IOException {
        super();
    }

    public void eventOccurred(WriteEvent event) throws IOException {
        //this.writeToFile(evt.getMessage());
    }
}

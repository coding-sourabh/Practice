import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String directoryName;
    private List<Object> directory;

    public Directory(String dName) {
        this.directoryName = dName;
        directory = new ArrayList<>();
    }

    public void add(Object obj) {
        directory.add(obj);
    }

    public void ls() {
        System.out.println("Directory Name: " + directoryName);
        for(Object obj: directory) {
            if(obj instanceof File) {
                ((File) obj).ls();
            } else if(obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }
    }
}

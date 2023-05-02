import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemLLD {
    private String directoryName;
    private List<FileSystemLLD> fileSystemLLDList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        fileSystemLLDList = new ArrayList<>();
    }

    public void add(FileSystemLLD fileSystemLLD) {
        this.fileSystemLLDList.add(fileSystemLLD);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name : " + this.directoryName);
        for(FileSystemLLD fileSystemLLD: fileSystemLLDList) {
            fileSystemLLD.ls();
        }
    }
}

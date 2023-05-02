import java.nio.file.FileSystem;

public class File implements FileSystemLLD {
    private String fileName;

    public File(String name) {
        this.fileName = name;
    }

    @Override
    public void ls() {
        System.out.println("File name : " + this.fileName);
    }
}

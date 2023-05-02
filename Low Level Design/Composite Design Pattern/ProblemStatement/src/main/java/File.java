public class File {
    private String fileName;

    public File(String name) {
        this.fileName = name;
    }

    public void ls() {
        System.out.println("File Name: " + this.fileName);
    }
}

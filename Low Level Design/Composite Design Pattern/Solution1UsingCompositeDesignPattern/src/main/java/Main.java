public class Main {
    public static void main(String [] args) {
        Directory pants = new Directory("Pants");
        pants.add(new File("Track Pants"));
        pants.add(new File("Shorts"));

        Directory jeansColor = new Directory("Jeans");
        jeansColor.add(new File("Blue Jeans"));
        jeansColor.add(new File("Black Jeans"));
        jeansColor.add(new File("Grey Jeans"));

        pants.add(jeansColor);

        pants.ls();
    }
}

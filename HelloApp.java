public class HelloApp {
    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            name = String.join(", ", args);  // join multiple names
        } else {
            name = "World";                 // default
        }

        System.out.println("Hello, " + name + "!");
    }
}
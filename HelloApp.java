public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // add all names with ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // remove last ", "
            String result = nameBuilder.substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + result + "!");
        }
    }
}

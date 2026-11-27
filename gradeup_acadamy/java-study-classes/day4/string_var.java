public class string_var {
    public static void main(String[] str) {
        // String name = "Rahul";
        // String city = "Delhi";
        // String message = "Welcome to Java";

        // String name1 = new String("Rahul");

        // System.out.println(name);
        // System.out.println(name1);
        // String text = "Hello Java";

        // System.out.println(text.substring(0, 5));

        // // Compare
        // String a = new String("Java");
        // String b = new String("Java");

        // System.out.println(a == b);
        // System.out.println(a.equals(b));

        // String firstName = "Rahul";
        // String lastName = "Kumar";

        // String fullName = firstName + " " + lastName;

        // System.out.println(fullName);

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");

        System.out.println(sb);

        sb.replace(6, 10, "World");

        System.out.println(sb);

        sb.delete(5, 10);

        System.out.println(sb);

        String sbStr = sb.toString();
    }
}

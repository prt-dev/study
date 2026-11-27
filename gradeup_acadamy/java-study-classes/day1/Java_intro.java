public class Java_intro {
    public static void main(String[] args) {
        System.out.println("How does Java execute a program?\n\n");

        System.out.println(
                """
                        Step 1: Java source code

                        Main.java — code written by the programmer

                        Java compiler (javac)

                        Step 2: Bytecode

                        Main.class — intermediate instructions

                        JVM (Java Virtual Machine)

                        Step 3: Program execution


                        Compiler: Converts Java source code into bytecode

                        The JVM manages memory (including garbage collection),
                        translates bytecode into machine-specific code for your operating system
                        and executes the bytecode on your computer.

                        JDK: Java Development Kit — tools required to develop Java programs

                        JRE stands for Java Runtime Environment.

                        the JRE consists of: JVM, Java class libraries, Supporting runtime components

                        When you install the JDK, you automatically get all three layers:
                        • The Outer Layer (JDK): Provides javac so you can run javac Main.java in your terminal.
                        • The Middle Layer (JRE): Provides the core class libraries (like String, System, and java.util) that your code relies on.
                        • The Core Engine (JVM): Provides the actual execution environment (java) to run your compiled .class files.

                        """);

        System.out.println(
                """
                        JDK includes:

                        - JVM and runtime components.

                        - Java compiler (javac).

                        - Java launcher (java).

                        - Debugging tools.

                        - Other development utilities.

                        - Java class libraries.



                        public means it can be accessed from other classes, subject to Java's access rules.

                        public is a Java access modifier.

                        An access modifier controls who can access a class, method or variable.



                        A class is a blueprint used to create objects.

                        It provides a structure for organizing data and methods.



                        public static void main(String[] args)

                        main method declaration



                        static means the method belongs to the class, not to a particular object.

                        Every student has an individual name. But the school name can be common to all students.



                        In Java, our main() method accepts String[] args, so even if you pass numbers from the terminal, Java initially receives them as Strings, not integers.

                        In Java, you cannot replace String[] args with int[] args in the standard main() method and expect the Java launcher to recognize it as the program entry point.
                        """);
    }
}

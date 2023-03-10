package Question10;
public class Main {
    public static void main(String[] args) {
        String greeting = "   Hello, world!   ";

        // repeat
        String repeated = greeting.repeat(3);
        System.out.println("Repeated: " + repeated);

        // strip
        String stripped = greeting.strip();
        System.out.println("Stripped: " + stripped);

        // isBlank
        boolean isBlank = greeting.isBlank();
        System.out.println("Is blank: " + isBlank);

        // indent
        String indented = greeting.indent(4);
        System.out.println("Indented: " + indented);

        // transform
        String transformed = greeting.transform(s -> s.toUpperCase());
        System.out.println("Transformed: " + transformed);

        // stripIndent
        String indentedText = "    This is some indented text\n"
                + "    With multiple lines\n"
                + "    And different levels of indentation\n";
        String strippedIndent = indentedText.stripIndent();
        System.out.println("Stripped indent:\n" + strippedIndent);

        // translateEscapes
        String escaped = "This is a tab: \t and this is a newline: \n";
        String translated = escaped.translateEscapes();
        System.out.println("Translated escapes: " + translated);

        // formatted
        String name = "Sahil Kadian";
        int age = 22;
        String formatted = String.format("My name is %s and I am %d years old", name, age);
        System.out.println("Formatted string: " + formatted);
    }
}
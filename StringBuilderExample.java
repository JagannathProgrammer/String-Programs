public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder SB = new StringBuilder("Java");

        SB.append(" Programing");
        SB.insert(4, " Core");
        SB.replace(0, 4, "Learn");

        System.out.println(SB);
    }
}

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("String:" + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        sb.append(" Programming");

        System.out.println("Updated String: " + sb);
        System.out.println("Updated Length: " + sb.length());
        System.out.println("Updated Capacity: " + sb.capacity());
    }
}

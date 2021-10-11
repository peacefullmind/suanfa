public class test {
    public static void main(String[] args) {
        int a=42;
        String s="ok";
        System.out.println(((Integer)a).hashCode());
        System.out.println(getType(s.hashCode()));
    }
    private static String getType(Object a) {
        return a.getClass().toString();

    }
}

public class Report5 {

    public static void main(String[] args) throws Exception {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptioが発生しました。");
            System.out.println(e.getMessage());
        }
    }
}

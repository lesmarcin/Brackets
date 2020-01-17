public class Main {
    public static void main(String[] args) {

        String a = "()()";

        int checkBracket = 0;

        for (int i = 0; i<a.length(); i++) {
            if (a.charAt(i) == '(') {
                checkBracket++;
            } else if (a.charAt(i) == ')') {
                checkBracket--;
            }
            if (checkBracket<0) {
                break;
            }
        }
        if (checkBracket != 0) {
            System.out.println("popraw nawiasy");
        } else {
            System.out.println("nawiasy poprawne");
        }
    }
}

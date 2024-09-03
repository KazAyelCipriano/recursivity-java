public class StringParaInteiro {

    public static int stringParaInteiro(String str, int n) {
        if (n == 1) {
            return str.charAt(0) - '0';
        } else {
            return (str.charAt(n - 1) - '0') + 10 * stringParaInteiro(str, n - 1);
        }
    }

    public static void main(String[] args) {
        String numeroStr = "435678";
        int numero = stringParaInteiro(numeroStr, numeroStr.length());
        System.out.println("A string \"" + numeroStr + "\" convertida para inteiro é: " + numero);
    }
}

public class ContadorDigitos {

    public static int quantosDigitos(int numero) {
        if (numero == 0) {
            return 1;
        } else if (numero < 10) {
            return 1;
        } else {
            return 1 + quantosDigitos(numero / 10);
        }
    }

    public static void main(String[] args) {
        int numero = 3245;
        System.out.println("Número de dígitos em " + numero + ": " + quantosDigitos(numero));
    }
}

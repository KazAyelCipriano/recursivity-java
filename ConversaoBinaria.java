public class ConversaoBinaria {

    public static String inteiroParaBinario(int numero) {
        if (numero == 0) {
            return "0";
        } else if (numero == 1) {
            return "1";
        } else {
            return inteiroParaBinario(numero / 2) + (numero % 2);
        }
    }

    public static void main(String[] args) {
        int numero = 13;
        String binario = inteiroParaBinario(numero);
        System.out.println("O número " + numero + " em binário é: " + binario);
    }
}

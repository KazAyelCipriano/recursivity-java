public class SomaArray {

    public static int somaArray(int[] array, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return array[n - 1] + somaArray(array, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int soma = somaArray(array, array.length);
        System.out.println("A soma dos elementos do array é: " + soma);
    }
}

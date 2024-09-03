public class ContadorOcorrencias {

    public static int contaOcorrencias(String str, char c, int pos) {
        if (pos < 0) {
            return 0;
        } else if (str.charAt(pos) == c) {
            return 1 + contaOcorrencias(str, c, pos - 1);
        } else {
            return contaOcorrencias(str, c, pos - 1);
        }
    }

    public static void main(String[] args) {
        String str = "Quem sabia amafagafar os amafagafinhos um bom amafagafigador sera";
        char c = 'a';
        int ocorrencias = contaOcorrencias(str, c, str.length() - 1);
        System.out.println("Número de ocorrências de '" + c + "' em '" + str + "': " + ocorrencias);
    }
}

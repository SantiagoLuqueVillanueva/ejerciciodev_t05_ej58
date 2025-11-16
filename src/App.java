public class App {
    public static void main(String[] args) throws Exception {
        int numeroIntroducido = Integer.parseInt(System.console().readLine("Introduzca un número: "));

        int aux = numeroIntroducido;
        int volteado = 0;
        int longitud = 0;
        int sumaDigitos = 0;

        while (aux != 0) {
            volteado = aux % 10;
            sumaDigitos += volteado;
            aux /= 10;
            longitud++;
        }

        double media = (double)sumaDigitos/longitud;

        System.out.printf("La media de sus dígitos es %.2f", media);
    }
}

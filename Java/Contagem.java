public class Contagem {

    public static int contagem(double[] dados, double N) {
        if (dados == null || dados.length == 0) {
            return 0;
        }

        double primeiro = dados[0];
        double min = Math.min(primeiro, N);
        double max = Math.max(primeiro, N);
        int contador = 0;

        for (double valor : dados) {
            if (valor == Math.floor(valor) && valor >= min && valor <= max) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        double[] conjunto = { 3.0, 4.5, 5.0, 7.0, 10.0, 12.0 };
        double N = 10.0;

        int total = contagem(conjunto, N);

        System.out.println("Quantidade de numeros inteiros entre " + conjunto[0] + " e " + N + ": " + total);
    }
}

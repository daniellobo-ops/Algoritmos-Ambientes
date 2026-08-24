public class Somatorio {
    public static void main(String[] args) {
        int n = 10;
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("O somatorio de 1 a " + n + " e: " + soma);
    }
}

public class MaximoDivisorComum {
    public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int resultado = mdc(num1, num2);

        System.out.println("O maximo divisor comum de " + num1 + " e " + num2 + " e: " + resultado);
    }
}

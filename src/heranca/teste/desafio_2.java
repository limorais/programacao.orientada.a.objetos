package heranca.teste;
import java.util.Scanner;


public class desafio_2 {
   //public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TODO: Complete os espaços em branco com uma possível solução para o desafio
        double pi = 3.14159;
        double R = sc.nextDouble();
        //numero negativo
        //numero real - usar virgula ao inves de ponto
        try {
            if (R < 0) throw new numNegativoException(R);
            double volume = (4 / 3.0) * pi * (Math.pow(R, 3));
            System.out.printf("VOLUME = %.3f%n", volume);
        } catch (numNegativoException e) {
            throw new RuntimeException(e);
        }

    }

    static class numNegativoException extends Exception {
        private Double R;

        public numNegativoException(Double r) {
            super("O numero" + r + "informado é negativo. Informe um numero positivo.");
           R = r;

        }

        @Override
        public String toString() {
            return "numNegativoException{" +
                    "R=" + R +
                    '}';
        }
    }
}

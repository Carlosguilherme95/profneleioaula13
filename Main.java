import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos minutos você falou no telefone:");
        int minutosOp = Integer.parseInt(scanner.nextLine());
        operadora(minutosOp);
    }

    private static void operadora(int minutosOP) {
        if(minutosOP <= 100){
            System.out.println("Valor a pagar: R$ 50.00");
        }else{
            int calculandoMin = (int) (50.00 + (minutosOP - 100) * 2);
            System.out.println("Valor a pagar: R$ " + calculandoMin);
        }
    }
}

/**
 * Problema "operadora"
 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
 * telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
 * ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
 * Exemplo 1:
 * Digite a quantidade de minutos: 22
 * Valor a pagar: R$ 50.00
 * Exemplo 2:
 * Digite a quantidade de minutos: 103
 * Valor a pagar: R$ 56.00
 */
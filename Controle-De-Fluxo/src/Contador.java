import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); 
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); 
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        } finally {
            terminal.close();
        }
    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        if (p1 >= p2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = p1 - p2;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

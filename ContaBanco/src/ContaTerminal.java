import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário e Obter pelo scanner os valores digitados no terminal
        System.out.print("Digite o número da conta: ");
        int num = scanner.nextInt();
      
        System.out.print("Digite o numero da agência: ");
        scanner.nextLine();
        String agencia = scanner.nextLine();
        
        System.out.print("Digite o nome do cliente: ");
        String cliente = scanner.nextLine();
        
        System.out.print("Informe o saldo inicial: ");
        double saldo = scanner.nextDouble();
    
        //Exibir a mensagem conta criada
        System.out.println("\n=================================================");
        System.out.printf("| %s |\n", centralizeText("Conta Aberta", 49));
        System.out.println("=================================================");
        System.out.printf("| %-15s | %-20s |\n", "Cliente", cliente);
        System.out.printf("| %-15s | %-20s |\n", "Agência", agencia);
        System.out.printf("| %-15s | %-20d |\n", "Conta", num);
        System.out.printf("| %-15s | R$ %-17.2f |\n", "Saldo", saldo);
        System.out.println("=================================================");

        System.out.println("\nObrigado por criar uma conta em nosso banco!");

        scanner.close();

        
    }
    public static String centralizeText(String text, int width) {
        int textLength = text.length();
        if (textLength >= width) {
            return text; 
        }
        int padding = (width - textLength) / 2; 
        String spaces = " ".repeat(padding); 
        return spaces + text + spaces + ((width - textLength) % 2 == 0 ? "" : " ");
    }
}

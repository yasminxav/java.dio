import java.util.Scanner;

public class Main {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // TODO: Itere sobre os serviços contratados
        for (int indice = 0; indice < servicosContratados.length; indice++) {
          if (servicosContratados[indice].equals("movel")) {
            movelContratado = true;
          } else if (servicosContratados[indice].equals("tv")) {
            tvContratada = true;
          } else if (servicosContratados[indice].equals("banda larga")) {
            bandaLargaContratada = true;
          }
        }

        // TODO: Verifique se todos os serviços foram contratados
        if (movelContratado == true && bandaLargaContratada == true && tvContratada == true) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}

import java.util.Date;
public class Operadores {
    public static void main(String[] args) throws Exception {
        // Operadores de atribuição
        String nome = "YASMIN";
        String segundoNome = "XAVIER";
        int idade = 20;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();
        
        // Operadores Aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 10 % 100;
        double resultado = (10 * 7) + (20/7.5);
        float teste = 1/3F;

       // Operadores Unários
        int numero = 5;
        boolean amigo = false;
        amigo = !amigo;

        // Operador de Condição Ternária
        int a, b;
        a = 5;
        b = 6;
        String alternativa = a==b ? "verdadeiro" : "falso"; 
        
        // Relacionais
        int numeroUm = 1;
        int numeroDois = 2;
        String simNao = numeroUm == numeroDois ? "Sim" : "Não";
            System.out.println("O número um é igual a dois? " + simNao);
        simNao = numeroUm != numeroDois ? "Sim" : "Não";
        System.out.println("O número um é diferente de dois? " + simNao);

        // Exemplo Curioso
        String nomeUm = "YASMIN";
        String nomeDois = new String("YASMIN");
           // System.out.println(nomeUm.equals(nomeDois));

        // Operadores Lógicos
        boolean condicao1 = true;
        boolean condicao2 = true;
        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("umas das condições é verdadeira");
        }
        
    }
}

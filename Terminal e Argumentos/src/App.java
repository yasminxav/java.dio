public class App {
    public static void main(String[] args) {
        // Os argumentos começam com o índice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args [3]);
        
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
    }
}

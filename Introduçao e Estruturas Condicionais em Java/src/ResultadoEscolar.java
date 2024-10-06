public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        if (nota >= 7) 
            System.out.println("Aprovado");
        else if (nota >= 7) {
            System.out.println("Recuperação");
        }
        else 
            System.out.println("Reprovado");
    /*
    Maneira mais limpa de escrever o código, optando pela condição ternária
        int nota 
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado"
        System.out.println(resultado)
    
    Segundo Caso
    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && <= 7 ? "Recuperação" :"Reprovado";
    
    */
    
    }
}

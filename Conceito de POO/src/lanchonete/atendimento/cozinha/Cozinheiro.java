package lanchonete.atendimento.cozinha;
import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    };
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    };
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    };
    public void prepararLanche() {
        System.out.println("PREPARANDO LANCHE");
    };
    public void prepararVitamina() {
        System.err.println("PREPARANDO VITAMINA");
    };
    public void prepararCombo () {
        prepararLanche();
        prepararVitamina();
    };
    public void selecionarIngredientesLanche () {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    };
    public void selecionarIngredientesVitamina () {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    };
    public void lavarIngredientes () {
        System.out.println("LAVANDO INGREDIENTES");
    };
    public void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    };
    public void fritarIngredientesLanche() {
        System.out.println("FRITANDO CARNE E OVO PARA O HAMBURGUER");
    };
    public void pedirParaTrocarGas (Atendente meuAmigo) {
        meuAmigo.trocarGas();
    };
    public void pedirParaTrocarGas (Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    };
    public void pedirIngredientes (Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }


}

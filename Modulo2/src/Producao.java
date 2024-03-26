public class Producao {

    int previsaoDemanda = 200;
    int producaoNormal = 250;
    int estoqueInicial = 50;
    int estoqueFinal;

    public Producao() {
        this.estoqueFinal = this.estoqueInicial + this.producaoNormal - this.previsaoDemanda;
    }

    public static void main(String[] args) {
        System.out.println("O estoque final previsto para o mês é de: " + new Producao().estoqueFinal);
    }
}

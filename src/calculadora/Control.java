package calculadora;

public class Control{
    static void main(String[] args) {
        CalculadoraPreco calculadora = new CalculadoraPreco();

        double preco1 = 10.00;
        double preco2 = 25.00;
        double preco3 = 50.00;
        double preco4 = 100.00;

        System.out.println("Preço de venda:");

        System.out.println("Produto 1: R$ " +
                calculadora.calcularPrecoVenda(preco1));

        System.out.println("Produto 2: R$ " +
                calculadora.calcularPrecoVenda(preco2));

        System.out.println("Produto 3: R$ " +
                calculadora.calcularPrecoVenda(preco3));

        System.out.println("Produto 4: R$ " +
                calculadora.calcularPrecoVenda(preco4));
    }
}

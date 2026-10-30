package calculadora;

public class CalculadoraPreco {

    public final double markup = 1.54;

    public final double calcularPrecoVenda(double precoCompra){

        return markup * precoCompra;
    }
}

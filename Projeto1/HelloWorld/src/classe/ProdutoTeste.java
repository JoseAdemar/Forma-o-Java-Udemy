package classe;

import java.util.Locale;

public class ProdutoTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.printf( "Produto1 %s\nProduto2 %s\n",p1.nome, p2.nome);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);
        System.out.printf("Média de preço = %.2f",  (precoFinal1 + precoFinal2)/2);

    }
}

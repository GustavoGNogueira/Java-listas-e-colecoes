import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> ListaProdutos = new ArrayList<>();

        Produto p1 = new Produto("Computador",10000,10);
        Produto p2 = new Produto("Mesa",5000,10);
        Produto p3 = new Produto("Cadeira",4000,10);

        ListaProdutos.add(p1);
        ListaProdutos.add(p2);
        ListaProdutos.add(p3);

        System.out.println("Recuperando produto pelo indice: " + ListaProdutos.get(0).getNome());

        ProdutoPerecivel pp1 = new ProdutoPerecivel("Carne",100,10,"12/03/2025");
        ListaProdutos.add(pp1);

        System.out.println(ListaProdutos);


    }
}
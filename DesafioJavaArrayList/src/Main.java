import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> ListaDePessoas = new ArrayList<>(); //ArrayList de Pessoa

        Pessoa p1 = new Pessoa();
        p1.setNome("Gustavo");
        p1.setIdade(18);
        ListaDePessoas.add(p1);

        Pessoa p2 = new Pessoa();
        p2.setNome("Simone");
        p2.setIdade(20);
        ListaDePessoas.add(p2);

        Pessoa p3 = new Pessoa();
        p3.setNome("Claudio");
        p3.setIdade(22);
        ListaDePessoas.add(p3);

        System.out.println("Tamanho da lista: " + ListaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + ListaDePessoas.get(0));
        System.out.println(ListaDePessoas);


    }
}
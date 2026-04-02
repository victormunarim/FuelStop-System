package java.org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        while (true) {
            IO.print("1 - Cadastrar produto");
            IO.print("2 - Cadastrar venda");

            switch (scanner.nextInt()) {
                case 1: {
                    String maisProdutos;
                    do {
                        IO.print("Digite o nome do produto:");
                        String nome = scanner.nextLine();

                        IO.print("Digite o preço do produto:");
                        double preco = scanner.nextDouble();

                        IO.print("Digite o estoque do produto:");
                        double estoque = scanner.nextDouble();

                        Produto produto = new Produto(nome, preco, estoque);
                        listaProdutos.add(produto);

                        IO.print("Deseja cadastrar mais produtos? (s/n):");
                        maisProdutos = scanner.nextLine();

                    } while (maisProdutos.equals("s"));

                    IO.print("Produto cadastrado");
                }
                break;

                case 2: {
                    IO.print("Digite o nome do produto vendido:");
                    String nome = scanner.nextLine();
                    double precoTotal;

                    IO.print("Digite a quantidade do produto que foi vendada:");
                    double quantidade = scanner.nextDouble();

                    for (Produto produto : listaProdutos) {
                        if (produto.getNome().equals(nome) && produto.getEstoque() > 0.0) {
                            precoTotal = quantidade * produto.getPreco();
                            produto.subEstoque(quantidade);
                        }
                    }
                }
            }
        }
    }
}

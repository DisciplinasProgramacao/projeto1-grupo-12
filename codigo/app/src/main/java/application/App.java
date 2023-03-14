package application;

import java.util.*;

public final class App {

    static Scanner entrada = new Scanner(System.in);
    static Estoque e = new Estoque();

    public static void main(String[] args) {
        Produto p1 = new Produto("banana", 10, 25, 20, 2);
        Produto p2 = new Produto("macarrao", 20, 30, 30, 2);

        e.addEstoque(p1);
        e.addEstoque(p2);

        Menu();

    }

    public static void Menu() {
        int x;
        do {
            System.out.println("Escolha o que quer fazer:");
            System.out.println("1 --> Venda e compra de produtos;");
            System.out.println("2 --> Consultar dados de produtos;");
            System.out.println("3 --> Calcular balanço da empresa;");
            System.out.println("0 --> Encerrar programa.");

            x = entrada.nextInt();
            switch (x) {
                case 0:
                    break;

                case 1:
                    SubMenu1();
                    break;

                case 2:
                    subMenu2();

                    break;

                case 3:
                    SubMenu3();
                    break;

                default:
                    System.out.println("Número inválido.");
            }
        } while (x != 0);

    }

    public static void SubMenu1() {
        int x;
        System.out.println("Você gostaria de:");
        System.out.println("1 --> Vender produtos;");
        System.out.println("2 --> Comprar produtos;");

        x = entrada.nextInt();
        switch (x) {
            case 1:
                Venda();
                break;

            case 2:
                comprar();
                break;

            default:
                System.out.println("Número inválido.");
        }
    }

    public static void subMenu2() {
        int x;

        System.out.println("Escolha o que quer fazer:");
        System.out.println("1 --> Consultar dados de produtos;");
        System.out.println("2 --> Consultar dados do estoque;");

        x = entrada.nextInt();
        switch (x) {
            case 1:
                consultarProduto();

                break;

            case 2:
                consultarEstoque();
                break;

            default:
                System.out.println("Número inválido.");
        }

    }

    public static void SubMenu3() {
        int x;

        System.out.println("Escolha o que quer fazer:");
        System.out.println("1 --> Consultar valor do estoque;");
        System.out.println("2 --> Consultar valor vendido;");
        System.out.println("3 --> Consultar valor gasto em pedidos de reposição");
    
        x = entrada.nextInt();
        switch (x) {
            case 1:
                System.out.println(e.calcularValorEstoque());

                break;

            case 2:
                System.out.println(e.getValorVendido());
                break;

            case 3:
                System.out.println(e.getValorGasto());
                break;

            default:
                System.out.println("Número inválido.");
        }
    
    }
    
    public static void Venda() {
        int quant;
        String prod;

        System.out.println("Digite o nome do produto que deseja vender:");
        entrada.nextLine();
        prod = entrada.nextLine();

        System.out.println("Quanto é a quantidade dessa venda?");
        quant = entrada.nextInt();
        
        e.vendaQuantProd(prod, quant);
        
    }

    public static void comprar() {

        System.out.println("Quantos de cada produto você deseja comprar?");
        entrada.nextLine();
        int quantidade = entrada.nextInt();
        e.comprar(quantidade);
    }

    public static void consultarProduto() {

        System.out.println("Digite o nome do produto desejado:");
        entrada.nextLine();
        String pesquisa = entrada.nextLine();

        Produto produtoConsultado = e.consultarProduto(pesquisa);
        System.out.println(produtoConsultado.imprimirProduto());
    }

    public static void consultarEstoque() {

        System.out.println(e.imprimirEstoque());
        
    }

}

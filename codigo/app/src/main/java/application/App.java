package application;

import java.util.Scanner;

public final class App {
    
    static Scanner entrada = new Scanner(System.in);
    static Estoque e = new Estoque();
   
    public static void main(String[] args) {
        Produto p1 = new Produto("banana", 10, 25, 20, 2);
        Produto p2 = new Produto("macarrao", 20, 30, 30, 2);
        

        e.reporEstoque(p1);
        e.reporEstoque(p2);

        Menu();

        

        

        
    }

    public static void Menu(){
        int x;
        do{
            System.out.println("Escolha o que quer fazer:");
            System.out.println("1 --> Venda e compra de produtos;");
            System.out.println("2 --> Consultar dados de produtos;");
            System.out.println("3 --> Calcular balanço da empresa;");
            System.out.println("0 --> Encerrar programa.");
    
            x = entrada.nextInt();
            switch (x){
                case 0:
                break;
    
                case 1:
    
                break;
    
                case 2:
                subMenu2();

                break;
    
                case 3:
    
                break;

                default:
                System.out.println("Número inválido.");
            }
        }while(x != 0);
        
    }

    public static void consultarProduto(){

        System.out.println("Digite o nome do produto desejado:");
        entrada.nextLine();
        String pesquisa = entrada.nextLine();

        e.consultarProduto(pesquisa);
    }

    public static void consultarEstoque(){
        e.imprimirEstoque();
    }

    public static void subMenu2(){
        int x;


        System.out.println("Escolha o que quer fazer:");
            System.out.println("1 --> Consultar dados de produtos;");
            System.out.println("2 --> Consultar dados do estoque;");
    
            x = entrada.nextInt();
            switch (x){
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
}

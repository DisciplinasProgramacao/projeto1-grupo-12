package application;

import java.util.Scanner;

public final class App {
    
    static Scanner entrada = new Scanner(System.in);
   
    public static void main(String[] args) {

        
    }

    public void Menu(){
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
    
                break;
    
                case 3:
    
                break;

                default:
                System.out.println("Número inválido.");
            }
        }while(x != 0);
        
    }
}

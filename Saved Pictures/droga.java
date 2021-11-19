import java.util.Scanner;

public class droga {
    public static void main(String[] args) {

        int n1, n2, n3, n4, n5;
        int choose;
        String nome;
        Scanner texto = new Scanner(System.in);

        // System.out.println("Escreva o nome do aluno: ");
        // nome = texto.nextLine();
        // System.out.println("Digite a primeira nota: ");
        // n1 = texto.nextInt();
        // System.out.println("Digite a segunda nota: ");
        // n2 = texto.nextInt();
        // System.out.println("Digite a terceira nota: ");
        // n3 = texto.nextInt();
        // System.out.println("Digite a quarta nota: ");
        // n4 = texto.nextInt();
        //
        // n5 = (n1 + n2 + n3 + n4)/4;

        // System.out.println("A média de " + nome + " é: " + n5);
        System.out.println("Calculadora!");
        System.out.println("Digite o primeiro numero: ");
        n1 = texto.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = texto.nextInt();
        System.out.println("Escolha sua operação: [1] Soma, [2] Subtração, [3] multiplicação, [4] divisão");
        
       do{
        choose = texto.nextInt();
            switch (choose) {
        case 1:
            System.out.println("O resultado da operação é: " + (n1 + n2));
            break;
        case 2:
            System.out.println("O resultado da operação é: " + (n1 - n2));
            break;
            case 3:
            System.out.println("O resultado da operação é: " + (n1 * n2));
            break;
            case 4:
            System.out.println("O resultado da operação é: " + (n1 / n2));
            break;
        default:
            System.out.println("Insira uma opção válida");
            }
        
        }while (choose !=0);
    }
}
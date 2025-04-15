import java.util.ArrayList;
import java.util.Scanner;

public class usuario {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(0);
        double media = 0;
        int soma = 0;

        System.out.println("deseja criar uma lista de numeros? (S/N)");
            String resposta = ent.nextLine();

            if(resposta.equalsIgnoreCase("s")){
                System.out.println("Adicione os numeros a lista");
                for(int x = 0; x < 5; x++ ){
                    System.err.println(": ");
                    numeros.add(ent.nextInt());
                    ent.nextLine();
                    //System.err.println("Deseja Continuar? S/N");
                    //resposta = ent.nextLine();
                    //if(resposta.equalsIgnoreCase("s"))
                    //    x--;
                    //else;
                }
                System.out.println("O que deseja fazer?");
            System.out.println("(1 - Calcular Média Geral)");
            System.out.println("(2 - Calcular Média dos Números Pares)");
            System.out.println("(3 - Calcular Média dos Números Ímpares)");

            resposta = ent.nextLine();
            switch (resposta) {
                case "1":
                    // Calcular soma de todos os números
                    for (int numero : numeros) {
                        soma += numero;  // Usar += para somar corretamente
                    }
                    media = soma / (double) numeros.size();  // Calcular média após somar
                    System.out.println("A média geral é: " + media);
                    break;
                case "2":
                    soma = 0;  // Resetando soma para os pares
                    int contagemPares = 0;  // Contador de números pares
                    // Calcular soma dos números pares
                    for (int numero : numeros) {
                        if (numero % 2 == 0) {
                            soma += numero;  // Somando apenas os números pares
                            contagemPares++;  // Contando o número de pares
                        }
                    }
                    if (contagemPares > 0) {
                        media = soma / (double) contagemPares;  // Calcular média com o número correto de elementos
                        System.out.println("A média dos números pares é: " + media);
                    } else {
                        System.out.println("Não há números pares na lista.");
                    }
                    break;
                case "3":
                    soma = 0;  // Resetando soma para os ímpares
                    int contagemImpares = 0;  // Contador de números ímpares
                    // Calcular soma dos números ímpares
                    for (int numero : numeros) {
                        if (numero % 2 != 0) {
                            soma += numero;  // Somando apenas os números ímpares
                            contagemImpares++;  // Contando o número de ímpares
                        }
                    }
                    if (contagemImpares > 0) {
                        media = soma / (double) contagemImpares;  // Calcular média com o número correto de elementos
                        System.out.println("A média dos números ímpares é: " + media);
                    } else {
                        System.out.println("Não há números ímpares na lista.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } else {
            System.out.println("OK... Fim do Programa!");
        }

        ent.close();
    }
}
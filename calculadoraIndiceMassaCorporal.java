import java.util.Scanner;

public class calculadoraIndiceMassaCorporal {
    
    public static void main(String[] args) {
    
        String nome;
        double altura;
        int peso;
        double valorAlturaAoQuadrado;
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o seu nome por favor: ");
        nome = entrada.nextLine();
        
        System.out.print("\nInsira o valor da sua altura em metros " + nome + ": ");
        altura = entrada.nextDouble();

        System.out.print("\nInsira o valor do seu peso em Kg " + nome + ": ");
        peso = entrada.nextInt();
        
        System.out.println("Obrigado por inserir os valores. Irei calcular, um instante...");
        valorAlturaAoQuadrado = (Math.pow(altura, 2));
System.out.println(valorAlturaAoQuadrado);
        Double valorFinal = peso / valorAlturaAoQuadrado;

        System.out.printf("Olá " + nome + " o seu indice de massa corporal é de %.2f", valorFinal);
        
        entrada.close();

        if (valorFinal <= 18.50) {
            System.out.println("Seu indíce corporal é considerado como Magreza!");
        } else if (valorFinal < 24.99) {
            System.out.println("Seu indíce corporal é considerado como Normal!");     
        } else if (valorFinal < 29.99) {
            System.out.println("Seu indíce corporal é considerado como Sobrepeso!");
        } else if (valorFinal < 39.99) {
            System.out.println("Seu indíce corporal é considerado como Obesidade!");
        } else if (valorFinal < 40) {
            System.out.println("Seu indíce corporal é considerado como Obesidade grave!");
        }
    }
}

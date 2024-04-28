import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
       Scanner lerTeclado = new Scanner(System.in);
       System.out.println("Digite seu nome: ");
       String nome = lerTeclado.nextLine();
       System.out.println("Digite sua altura: ");
       Double altura = lerTeclado.nextDouble();
       System.out.println("Digite seu peso: ");
       Double peso = lerTeclado.nextDouble();
       System.out.println("Digite seu gênero utilizando F para feminino, M para masculino ou N para Neutro");
       char genero = lerTeclado.next().charAt(0);

       double imc = peso / Math.pow(altura, 2);

       switch (genero) {
        case 'M', 'm':
            if (imc >= 40) {
                System.out.println("A classificação de " + nome + " é de Obesidade Morbida");
            } else if (imc > 30 && imc < 39.9) {
                System.out.println("A classificação de " + nome + " é de Obesidade Moderada");
            } else if (imc > 25 && imc < 29.9) {
                System.out.println("A classificação de " + nome + " é de Obesidade leve");
            }else if (imc > 20 && imc < 24.9) {
                System.out.println("A classificação de " + nome + " é de Normal");
            }else if (imc < 20) {
                System.out.println("A classificação de " + nome + " é de Abaixo do Peso");
            }
            break;
       
        case 'F', 'N', 'f', 'n':
            if (imc >= 39) {
                System.out.println("A classificação de " + nome + " é de Obesidade Morbida");
            } else if (imc > 29 && imc < 38.9) {
                System.out.println("A classificação de " + nome + " é de Obesidade Moderada");
            } else if (imc > 24 && imc < 28.9) {
                System.out.println("A classificação de " + nome + " é de Obesidade leve");
            }else if (imc > 19 && imc < 23.9) {
                System.out.println("A classificação de " + nome + " é de Normal");
            }else if (imc < 19) {
                System.out.println("A classificação de " + nome + " é de Abaixo do Peso");
            }
        break;

        default:
            break;
       }
    lerTeclado.close();
}
}





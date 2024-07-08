import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("me diga seu peso:");
        double peso = scanner.nextDouble();
        System.out.println("me diga sua altura:");
        double altura = scanner.nextDouble();
        scanner.close();

        double formuladoimc = peso/(altura*altura);
        System.out.println(formuladoimc);

        if (formuladoimc < 18.5){
            System.out.println("você está abaixo do peso");
        }if (formuladoimc >= 18.6 && formuladoimc <= 24.9){
            System.out.println("você está no peso ideal, parabéns!");
        }if (formuladoimc >= 25.0 && formuladoimc <= 29.9){
            System.out.println("você está levemente acima do peso");
        }if (formuladoimc >= 30.0  && formuladoimc <= 34.9){
            System.out.println("você está no grau 1 de obesidade");
        }if (formuladoimc >= 35.0 && formuladoimc <= 39.9){
            System.out.println("você está no grau 2 de obesidade");
        }if (formuladoimc >= 40){
            System.out.println("VOCÊ TA COM OBESIDADE GRAU 3 SEU BALEIA VAI MORRER");
        }
       // Abaixo de 18,5   | Abaixo do peso
       // Entre 18,6 e 24,9 | Peso ideal (parabéns)
       // Entre 25,0 e 29,9 | Levemente acima do peso
       // Entre 30,0 e 34,9 | Obesidade grau I
      //  Entre 35,0 e 39,9 | Obesidade grau II (severa) Maior ou igual a 40 | Obesidade grau III (mórbida)
    }
}
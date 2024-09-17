
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a AV1: ");
        Double nota1 = input.nextDouble();

        System.out.println("Digite a AV2: ");
        Double nota2 = input.nextDouble();

        Double media = (nota1 + nota2)/2;
        
        System.out.println("a Media é: " + media);
    }
}

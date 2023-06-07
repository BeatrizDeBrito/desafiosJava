package hipotenusa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro cateto (x): ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor do segundo cateto (y): ");
        int y = scanner.nextInt();

        HypotenuseCalculator calculator = new HypotenuseCalculator();
        double hypotenuse = calculator.calculateHypotenuse(x, y);
        System.out.println("A hipotenusa é: " + hypotenuse);

        scanner.close();
    }
}

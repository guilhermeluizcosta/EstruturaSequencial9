import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual eh a temperatura em Fahrenheit:");
        double fahrenheit = entrada.nextDouble();
        double celsius = 5 * ((fahrenheit-32) / 9);
        System.out.println("A temperatura em Celsius eh: "+ celsius);
    }
}

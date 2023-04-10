import java.util.Scanner; 

public class App {

    public static void main(String[] args) throws Exception {
        // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        double radius; 
        System.out.println("Informe o tamanho do raio ");
        Scanner teclado = new Scanner(System.in); 
        radius = teclado.nextDouble(); 

        double result = 2 * 3.14 * radius; 

        System.out.println("A aréa do círculo é: " + result);
        teclado.close();
        
    }
}

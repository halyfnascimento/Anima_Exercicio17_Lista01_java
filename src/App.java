In progress
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        double metro;
        double litro;
        double lata;
        double valorlata;
        double valorgalao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual área a ser pintada");
        metro = teclado.nextDouble();
        litro = metro / 6;
        lata = Math.ceil(litro / 18);
        valorlata = lata * 80;
        double quantidadegalao = Math.ceil(litro / 3.6);
        valorgalao = quantidadegalao * 25.00;

        // Entrada 2
        double metroMistura = metro * 1.1;
        double litro2 = metroMistura / 6;
        double lataM = Math.ceil(litro2 / 18);
        double lataM2 = litro2 / 18;
        double lataM3 = litro / 18;
        double desperdicio = lataM - lataM2;
        double conversorG = Math.ceil(lataM2 - desperdicio);
System.out.printf("Area a ser Pintada: [%f] metros quadrados. ", metro);
        System.out.println("");
        System.out.println("Litros a ser usados: " + litro);
        System.out.println("Latas a Serem compradas: " + lata);
        System.out.println("valor total comprando apenas latas R$: " + valorlata);
        System.out.println("galao a Serem compradas: " + quantidadegalao);
        System.out.println("Valor total comprando apenas galoes: " + valorgalao);
        System.out.println("");
        System.out.println("a área para mistura é: " + metroMistura);
        System.out.println("Quantidade de litros mistura: " + litro2);
        System.out.println("Quantidade de latas para mistura: " + lataM2);
        System.out.println("A quantidade de latas aredondada é: " + lataM);
        System.out.println("O desperdicio é de: " + desperdicio);
        System.out.println("A quantidade de galoes mistura: " + conversorG);
        System.out.printf("A quantidade de lata na mistura será:[%f] e a quantidade de galoes e de:[%f]", lataM3,
                conversorG);

        teclado.close();
    }
}

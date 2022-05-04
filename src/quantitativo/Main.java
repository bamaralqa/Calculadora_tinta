package quantitativo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculadora de tinta ===");
        System.out.println("Para uma área retangular, \nInforme o tamanho da base, em metros: ");
        double base = Double.parseDouble(scanner.next());
        System.out.println("Informe o tamanho da altura, em metros: ");
        double altura = Double.parseDouble(scanner.next());
        System.out.println("Informe o valor unitário da tinta de 5L: ");
        double precoUnitarioTinta = Double.parseDouble(scanner.next());

        double custoTotalTinta;

        area = base * altura;

        double qntLatasTinta = area / 15;
        double nLatasTinta = Math.ceil(qntLatasTinta);

        custoTotalTinta = nLatasTinta * precoUnitarioTinta;

        System.out.println("Área do local: " + area + "m²");
        System.out.println("Quantidade de galões de 5l necessários para pintar essa área: "
                + nLatasTinta + " galões");
        System.out.println("Valor à ser gasto com os galões de tinta: R$ " + custoTotalTinta);

    }
}

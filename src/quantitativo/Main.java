public class Main {


    public static void main(String[] args) {

        double base;
        double altura;
        double area;
        double precoUnitarioTinta;


        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculadora de tinta ===");
        System.out.println("\\nPara uma área retangular, \\nInforme o tamanho da base, em metros: ");
        String base = scanner.next();
        System.out.println("Informe o tamanho da altura, em metros: ");
        String altura = scanner.next();
        System.out.println("Informe o valor unitário da tinta de 5L: ")
        String precoUnitarioTinta = scanner.next();

        double custoTotalTinta;
        double nLatasTinta;

        area = base * altura;

        nLatasTinta = area / 15;

        custoTotalTinta = nLatasTinta * precoUnitarioTinta;

        System.out.println("\\nÁrea do local: " + area + "m²");
        System.out.println("\\nQuantidade de galões de 5l necessários para pintar essa área: " + nLatasTinta + " galões")
        System.out.println("\\nValor à ser gasto com os galões de tinta: R$ " + custoTotalTinta);

    }
}

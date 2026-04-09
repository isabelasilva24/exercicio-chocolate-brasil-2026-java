import java.util.Scanner;

public class FiscalizacaoChocolate {
    public static void main(String[] args) {

        // Criando o objeto Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        System.out.println("--- SISTEMA DE FISCALIZAÇÃO PASCOA 2026 ---");

        // =============================
        // 1ª SITUAÇÃO: Teor de Cacau
        // =============================
        System.out.print("Digite o percentual de cacau da amostra: ");
        double cacau = sc.nextDouble();

        // Verifica a classificação com base no teor de cacau
        if (cacau < 25) {
            System.out.println("Status: ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate'.");
        } else if (cacau >= 25 && cacau < 35) {
            System.out.println("Status: Chocolate Comum (Padrão Nacional Atual).");
        } else {
            System.out.println("Status: Chocolate de Alta Qualidade (Padrão Internacional/UE).");
        }

        // =============================
        // 2ª SITUAÇÃO: Tipo e Açúcar
        // =============================
        System.out.print("\nDigite o tipo de chocolate (AO_LEITE/AMARGO): ");
        String tipo = sc.next();

        System.out.print("Gramas de açúcar: ");
        int acucar = sc.nextInt();

        // Verifica classificação com base no tipo e açúcar
        if (tipo.equalsIgnoreCase("AO_LEITE") && acucar > 15) {
            System.out.println("Status: Classificação: Doce de leite com cacau (Excesso de açúcar).");
        } else {
            System.out.println("Status: Classificação: Chocolate balanceado.");
        }

        // =============================
        // 3ª SITUAÇÃO: Exportação
        // =============================
        System.out.print("\nDigite o preço do ovo de Páscoa: ");
        double preco = sc.nextDouble();

        System.out.print("Digite a nota de pureza (0 a 10): ");
        double pureza = sc.nextDouble();

        // Verifica se o produto pode ser exportado
        if (preco > 100.0 || pureza < 5) {
            System.out.println("Status: REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões.");
        } else {
            System.out.println("Status: APROVADO: Produto competitivo para o mercado externo.");
        }

        // Fechando o Scanner
        sc.close();
    }
}
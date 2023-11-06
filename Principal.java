package pessoas;

public class Principal {

    public static void main(String[] args) {
        Faxineiro a1 = new Faxineiro("Jorge", 32, "M", 2500);
        
        System.out.println("Faxineiro:");
        a1.bater_ponto();
        a1.tarefa();

        System.out.println(" ");

        Vendedor b1 = new Vendedor("Mario", 25, "M", 1800, " ");

        System.out.println("Vendedor: ");
        b1.bater_ponto();
        b1.realizar_venda();
        b1.fechar_caixa();
        System.out.println(" ");
        
        Gerente c1 = new Gerente("Maria", 29, "F", 5800, " ");

        System.out.println("Gerente: ");
        c1.bater_ponto();
        c1.solicitar_material();

    }

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Quarto[] q = new Quarto[10];
        Hospede[] h = new Hospede[10];
        Ocupacao[] o = new Ocupacao[10];

        for (int i = 0; i < q.length; i++) {
            q[i] = new Quarto(false);
        }

        menu();
        System.out.print("=== Quantos quartos irá alugar? ");
        int quant = sc.nextInt();
        for (int i = 0; i < quant; i++) {
            System.out.println("== Aluguel " + (i + 1) + " ==");
            System.out.print("=== Qual quarto você quer? ");
            int n = sc.nextInt();

            while (q[n].getOcupado()) {
                if (q[n].getOcupado()) {
                    System.out.println("Está ocupado! Escolha outro.");
                }
                n = sc.nextInt();
            }
            q[n] = new Quarto(n);
            System.out.print("=== Quantos dias ficará hospedado? ");
            int dias = sc.nextInt();

            System.out.println("== Hóspede " + (i + 1) + " ==");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Sexo: ");
            sc.nextLine();
            String sexo = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();

            h[n] = new Hospede(nome, idade, sexo, email);

            o[n] = new Ocupacao(q[n], h[n], dias);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < q.length; i++) {
            if(q[i].getOcupado()) {
                System.out.println(o[i].toString());
                System.out.println();
            }
        }

    }

    public static void menu(){
        System.out.println("===========================");
        System.out.println("=== Bem-vindo ao Hotel! ===");
        System.out.println("===========================");
        System.out.println("=== Lista de quartos");
        System.out.println("1 - 4 = Básico");
        System.out.println("5 - 7 = Intermediário");
        System.out.println("7 - 10 = Luxo");
        System.out.println("=== Valor das diárias");
        System.out.println("- Quarto Básico = R$50,00");
        System.out.println("- Quarto Intermediário = R$80,00");
        System.out.println("- Quarto Luxo = R$120,00");
        System.out.println("===========================");
    }

}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Departamento departamento1 = new Departamento();
        Trabalhador funcionario = new Trabalhador();

        // ===================== DEPARTAMENTO =====================
        System.out.println("Digite o nome do departamento:");
        departamento1.setName(sc.nextLine());
        funcionario.setDepartamento(departamento1.getName());

        // ===================== FUNCIONÁRIO ======================
        System.out.println("\nDigite os dados do funcionário:");

        System.out.print("Nome: ");
        funcionario.setNome(sc.nextLine());

        System.out.print("Nível (JUNIOR, MID_LEVEL, SENIOR): ");
        funcionario.setNivel(WorkerLevel.valueOf(sc.nextLine()));

        System.out.print("Salário base: ");
        funcionario.setSalarioBase(sc.nextDouble());
        sc.nextLine(); // limpa buffer

        // ===================== CONTRATOS ========================
        System.out.print("\nQuantos contratos ele possui? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nContrato #" + (i + 1));

            Contratos contrato = new Contratos();

            System.out.print("Data (DD/MM/YYYY): ");
            Date data = sdf.parse(sc.nextLine());
            contrato.setData(data);

            System.out.print("Valor por hora: ");
            contrato.setValorPorHora(sc.nextDouble());
            sc.nextLine();

            System.out.print("Horas trabalhadas: ");
            contrato.setHoras(sc.nextInt());
            sc.nextLine();

            funcionario.adicionarContrato(contrato);
        }

        // ===================== RENDA =================
        System.out.print("\nDigite o mês (1 a 12): ");
        int mes = sc.nextInt();

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        double renda = funcionario.income(mes, ano);

        // ===================== TELA FINAL ==================
        System.out.println("\n--- RELATÓRIO FINAL ---");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento());
        System.out.println("Renda total: R$ " + String.format("%.2f", renda));

        sc.close();
    }
}

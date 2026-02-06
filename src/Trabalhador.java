import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private WorkerLevel nivel;
    private double salarioBase;
    private String departamento;
    private List<Contratos> contratoDoFuncionario = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public WorkerLevel getNivel() {
        return nivel;
    }

    public void setNivel(WorkerLevel nivel) {
        this.nivel = nivel;
    }

    public void adicionarContrato(Contratos contrato){
        contratoDoFuncionario.add(contrato);
    }

    public void removerContrato(Contratos contrato){
        contratoDoFuncionario.remove(contrato);
    }

    public double income(int mes, int ano){
        double soma = salarioBase;

        for (Contratos contratos : contratoDoFuncionario){
            Calendar data = Calendar.getInstance();
            data.setTime(contratos.getData());
            int cYear = data.get(Calendar.YEAR);
            int cMonth = data.get(Calendar.MONTH) + 1;

            if (ano == cYear && mes == cMonth) {
                soma += contratos.valorTotal();
            }
        }

        return soma;
    }
}

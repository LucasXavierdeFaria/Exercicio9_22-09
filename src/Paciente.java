import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private int idade;
    private List<String> historicoConsultas;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.historicoConsultas = new ArrayList<>(); // Inicializa o histórico como uma lista vazia
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Adiciona uma nova consulta ao histórico
    public void adicionarConsulta(String consulta) {
        historicoConsultas.add(consulta);
        System.out.println("Consulta adicionada: " + consulta);
    }

    // Exibe o histórico de consultas
    public void exibirConsultas() {
        if (historicoConsultas.isEmpty()) {
            System.out.println("Nenhuma consulta registrada.");
        } else {
            System.out.println("Histórico de consultas de " + nome + ":");
            for (String consulta : historicoConsultas) {
                System.out.println(consulta);
            }
        }
    }
}

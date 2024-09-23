public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Maria Silva", 30);

        paciente.adicionarConsulta("Consulta de rotina - 01/01/2024");
        paciente.adicionarConsulta("Exame de sangue - 15/02/2024");
        paciente.exibirConsultas();  // Exibe as consultas adicionadas
    }
}

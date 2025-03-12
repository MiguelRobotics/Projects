public class Droid {

    String name;
    int batteryLevel;

    // Construtor
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100; // Inicializa o nível da bateria com 100%
    }

    // Método toString para fornecer uma representação em string do Droid
    @Override
    public String toString() {
        return "Olá, eu sou o droid " + name;
    }

    // Método para executar uma tarefa e reduzir o nível da bateria
    public String performTask(String task) {
        if (batteryLevel >= 10) { // Verifica se há bateria suficiente para executar a tarefa
            System.out.println(name + " está executando a tarefa: " + task);
            batteryLevel -= 10; // Reduz o nível da bateria em 10%
            return "Tarefa '" + task + "' concluída. Nível da bateria: " + batteryLevel + "%";
        } else {
            return name + " não tem bateria suficiente para realizar a tarefa: " + task;
        }
    }

    // Método main para testar a classe Droid
    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey); // Exibe a apresentação do droid

        // Executa tarefas
        System.out.println(codey.performTask("falando"));
        System.out.println(codey.performTask("andando"));
        System.out.println(codey.performTask("correndo"));

        // Tenta executar uma tarefa com bateria baixa
        System.out.println(codey.performTask("pulando"));
    }
}

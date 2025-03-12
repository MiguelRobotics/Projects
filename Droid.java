public class Droid {

    String name;
    int batteryLevel;

    // Construtor
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100; // Inicializa o n�vel da bateria com 100%
    }

    // M�todo toString para fornecer uma representa��o em string do Droid
    @Override
    public String toString() {
        return "Ol�, eu sou o droid " + name;
    }

    // M�todo para executar uma tarefa e reduzir o n�vel da bateria
    public String performTask(String task) {
        if (batteryLevel >= 10) { // Verifica se h� bateria suficiente para executar a tarefa
            System.out.println(name + " est� executando a tarefa: " + task);
            batteryLevel -= 10; // Reduz o n�vel da bateria em 10%
            return "Tarefa '" + task + "' conclu�da. N�vel da bateria: " + batteryLevel + "%";
        } else {
            return name + " n�o tem bateria suficiente para realizar a tarefa: " + task;
        }
    }

    // M�todo main para testar a classe Droid
    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey); // Exibe a apresenta��o do droid

        // Executa tarefas
        System.out.println(codey.performTask("falando"));
        System.out.println(codey.performTask("andando"));
        System.out.println(codey.performTask("correndo"));

        // Tenta executar uma tarefa com bateria baixa
        System.out.println(codey.performTask("pulando"));
    }
}

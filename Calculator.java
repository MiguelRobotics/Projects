public class Calculator {

    /*
     * Este programa tem como objetivo ser uma calculadora aritm�tica simples.
     * A calculadora ser� capaz de:
     * - Adicionar dois inteiros
     * - Subtrair dois inteiros
     * - Multiplicar dois inteiros
     * - Dividir dois inteiros
     * - Aplicar o operador m�dulo em dois inteiros
     * Este projeto demonstra minhas habilidades de cria��o de m�todos e par�metros.
     */

    public Calculator() {
        // Construtor vazio
    }

    // M�todo para adi��o
    public int add(int a, int b) {
        return a + b;
    }

    // M�todo para subtra��o
    public int subtract(int a, int b) {
        return a - b;
    }

    // M�todo para multiplica��o
    public int multiply(int a, int b) {
        return a * b;
    }

    // M�todo para divis�o (com tratamento de divis�o por zero)
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divis�o por zero n�o � permitida.");
        }
        return a / b;
    }

    // M�todo para m�dulo (com tratamento de divis�o por zero)
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divis�o por zero n�o � permitida.");
        }
        return a % b;
    }

    // M�todo principal para testar a calculadora
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        // Testando as opera��es
        System.out.println("Adi��o: " + myCalculator.add(5, 7)); // Resultado esperado: 12
        System.out.println("Subtra��o: " + myCalculator.subtract(45, 11)); // Resultado esperado: 34
        System.out.println("Multiplica��o: " + myCalculator.multiply(3, 4)); // Resultado esperado: 12
        System.out.println("Divis�o: " + myCalculator.divide(10, 2)); // Resultado esperado: 5
        System.out.println("M�dulo: " + myCalculator.modulo(10, 3)); // Resultado esperado: 1

        // Testando divis�o por zero (isso lan�ar� uma exce��o)
        try {
            System.out.println("Divis�o por zero: " + myCalculator.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Exibe a mensagem de erro
        }
    }
}
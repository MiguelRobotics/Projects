public class Calculator {

    /*
     * Este programa tem como objetivo ser uma calculadora aritmética simples.
     * A calculadora será capaz de:
     * - Adicionar dois inteiros
     * - Subtrair dois inteiros
     * - Multiplicar dois inteiros
     * - Dividir dois inteiros
     * - Aplicar o operador módulo em dois inteiros
     * Este projeto demonstra minhas habilidades de criação de métodos e parâmetros.
     */

    public Calculator() {
        // Construtor vazio
    }

    // Método para adição
    public int add(int a, int b) {
        return a + b;
    }

    // Método para subtração
    public int subtract(int a, int b) {
        return a - b;
    }

    // Método para multiplicação
    public int multiply(int a, int b) {
        return a * b;
    }

    // Método para divisão (com tratamento de divisão por zero)
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return a / b;
    }

    // Método para módulo (com tratamento de divisão por zero)
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return a % b;
    }

    // Método principal para testar a calculadora
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        // Testando as operações
        System.out.println("Adição: " + myCalculator.add(5, 7)); // Resultado esperado: 12
        System.out.println("Subtração: " + myCalculator.subtract(45, 11)); // Resultado esperado: 34
        System.out.println("Multiplicação: " + myCalculator.multiply(3, 4)); // Resultado esperado: 12
        System.out.println("Divisão: " + myCalculator.divide(10, 2)); // Resultado esperado: 5
        System.out.println("Módulo: " + myCalculator.modulo(10, 3)); // Resultado esperado: 1

        // Testando divisão por zero (isso lançará uma exceção)
        try {
            System.out.println("Divisão por zero: " + myCalculator.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Exibe a mensagem de erro
        }
    }
}
package Exercicios;
    public class TesteIR {

        public static void main(String[] args) {
            System.out.println("Testando IRs");

            // De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
            // De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
            // De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636

            double salario = 4664.0;


            //ifs aqui
            if (salario <= 2800.0) {
                System.out.println("Vai ser descontado 7,5% do seu salario, totalizano R$142,00.");
            } else if (salario >= 2800.0 && salario <= 3751.0) {
                System.out.println("Vai ser descontado 15% do seu salario, totalizando R$350,00. ");
            } else if (salario >= 3751.01 && salario <= 4664.00) {
                System.out.println("Vai ser descontado 22,5% do seu salario, totalizando R$636,00");
            }
        }
    }

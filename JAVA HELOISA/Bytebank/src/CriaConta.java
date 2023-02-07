import java.sql.SQLOutput;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        System.out.println("\nO valor da primeira conta é de: " + primeiraConta.saldo);

        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        System.out.println("\nO valor da segunda conta é de: " + segundaConta.saldo);

        segundaConta.saldo = 400;
        System.out.println(segundaConta.saldo);
        segundaConta.saldo +=100;
        System.out.println(segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        if(primeiraConta == segundaConta) {
            System.out.println("São a mesma conta");
        } else
            System.out.println("São contas diferentes");
    }


}


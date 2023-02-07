public class testaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 1700;
        contaDoPaulo.deposita(100);
        System.out.println("O salário total desta vaga, com o vale transporte incluso " +
                "é de " + contaDoPaulo.saldo);

        //Função de saque
        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

    }
}

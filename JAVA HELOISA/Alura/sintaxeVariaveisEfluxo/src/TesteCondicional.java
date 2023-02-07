public class TesteCondicional {
    public static void main(String[] args) {
        System.out.println("testando coindicionais");

        int idade = 20;
        int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Você não tem 18 anos, mas pode entrar pois esta acompanhado");

            } else {
                System.out.println("Infelizmente você não pode entrar");
            }
        }
    }
}
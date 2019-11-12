package br.com.fiap.contas.main;

public class TestaString {

    public static void main(String[] args) {
        String string1 = "fj11";
        string1.replace("1","2");
        System.out.println(string1);

        // Para alterar o conteúdo é necessário que após o replace seja feito a atribuição do valor para a variável
        String string2 = "fj11";
        string2 = string2.replace("1","2");
        System.out.println(string2);
    }
}
